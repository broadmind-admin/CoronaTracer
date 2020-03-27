### Spring Boot base for projects with MongoDB and JWT based security.
---
This is a quick-start base for java projects with Spring Boot, MongoDB and configured JWT security.
### Running
* Download this base
* Start the MongoDB service/daemon in your system 
* Run project by `Application.class` or by `mvn clean install`, `java -jar target/*.jar`, or by `mvn spring-boot:run`

---
### JWT security
Page `http://localhost:8080/api/hello` is secured. To access this page, you need to do the following:

* **POST** request to `http://localhost:8080/api/signup` with body
```json
  username: "user",
  password: "12345"
```
* **POST** request to `http://localhost:8080/api/auth`, then take token from responce and use it in header to access secured page
* **GET** request to `http://localhost:8080/api/hello` with header:
```json
  x-auth-token: eyJhbGciOiJIUzUxMiJ9.eyJjbGllbnRUeXBlIjoidXNlciIsInRva2VuX2V4cGlyYXRpb25fZGF0ZSI6MTU4NTI4NjYzODM2MiwidXNlcklEIjoiNWU3Y2RmOTg0YWRjZGUzMTBlYTAxNGE2IiwidXNlcm5hbWUiOiJpc2hhbiIsInRva2VuX2NyZWF0ZV9kYXRlIjp7InllYXIiOjIwMjAsIm1vbnRoIjoiTUFSQ0giLCJkYXlPZk1vbnRoIjoyNywiZGF5T2ZXZWVrIjoiRlJJREFZIiwiZGF5T2ZZZWFyIjo4NywibW9udGhWYWx1ZSI6MywibmFubyI6MzYyMDAwMDAwLCJob3VyIjo0LCJtaW51dGUiOjUzLCJzZWNvbmQiOjU4LCJjaHJvbm9sb2d5Ijp7ImNhbGVuZGFyVHlwZSI6Imlzbzg2MDEiLCJpZCI6IklTTyJ9fX0.dQEJ7d4YFz38G0DzCMRAoQWh9FDQbkBWfqrkX5yy2annbo1YF3s5mEBe5SJXo4sTQEX54GjA008fJDJmFBED-g
