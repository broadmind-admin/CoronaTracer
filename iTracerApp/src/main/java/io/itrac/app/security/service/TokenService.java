package io.itrac.app.security.service;


public interface TokenService {

    String getToken(String username, String password);
}
