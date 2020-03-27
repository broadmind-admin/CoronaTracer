package io.itrac.app.converter.dto;

import org.springframework.core.convert.converter.Converter;

import io.itrac.app.dto.UserDTO;
import io.itrac.app.model.Authority;
import io.itrac.app.model.User;

import java.util.ArrayList;
import java.util.List;


public class UserDTOConverter implements Converter<UserDTO, User> {

    @Override
    public User convert(final UserDTO dto) {
        final User user = new User();

        user.setUsername(dto.getUsername());
        user.setPassword(dto.getMobile());
        user.setMobile(dto.getMobile());
        user.setAccountNonExpired(false);
        user.setCredentialsNonExpired(false);
        user.setEnabled(true);

        List<Authority> authorities = new ArrayList<>();
        authorities.add(Authority.ROLE_USER);
        user.setAuthorities(authorities);
        return user;
    }
}
