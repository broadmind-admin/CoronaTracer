package io.itrac.app.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import io.itrac.app.converter.factory.ConverterFactory;
import io.itrac.app.dto.UserDTO;
import io.itrac.app.model.User;


@Component
public class ConverterFacade {

    @Autowired
    private ConverterFactory converterFactory;

    public User convert(final UserDTO dto) {
        return (User) converterFactory.getConverter(dto.getClass()).convert(dto);
    }
}
