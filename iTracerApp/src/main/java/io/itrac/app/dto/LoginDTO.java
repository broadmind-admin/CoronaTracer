package io.itrac.app.dto;

import java.io.Serializable;


public class LoginDTO implements Serializable {

    private static final long serialVersionUID = -4159366809929151486L;

    private String username;
    private String mobile;

    public LoginDTO() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(final String username) {
        this.username = username;
    }

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

    
}
