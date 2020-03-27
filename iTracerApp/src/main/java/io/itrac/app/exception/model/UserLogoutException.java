package io.itrac.app.exception.model;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.EXPECTATION_FAILED)
public class UserLogoutException extends RuntimeException {

    /**
	 * 
	 */
	private static final long serialVersionUID = 3389116317790097815L;
	@SuppressWarnings("unused")
	private final String user;
    @SuppressWarnings("unused")
	private final String message;

    public UserLogoutException(String user, String message) {
        super(String.format("Couldn't log out device [%s]: [%s])", user, message));
        this.user = user;
        this.message = message;
    }
}