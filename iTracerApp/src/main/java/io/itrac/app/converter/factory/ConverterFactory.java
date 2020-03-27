package io.itrac.app.converter.factory;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import io.itrac.app.converter.dto.UserDTOConverter;
import io.itrac.app.dto.UserDTO;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;


@Component
public class ConverterFactory {

    private Map<Object, Converter> converters;

    public ConverterFactory() {

    }

    @PostConstruct
    public void init() {
        converters = new HashMap<>();
        converters.put(UserDTO.class, new UserDTOConverter());
    }

    public Converter getConverter(final Object type) {
        return converters.get(type);
    }
}
