package io.schuberty.dio.personaapi.utils;

import io.schuberty.dio.personaapi.enums.PhoneType;
import io.schuberty.dio.personaapi.model.persona.Phone;
import io.schuberty.dio.personaapi.system.dto.request.PhoneDTO;

public class PhoneUtils {

    private static final String PHONE_NUMBER;
    private static final PhoneType PHONE_TYPE;
    private static final Long PHONE_ID;

    public static PhoneDTO createFakeDTO() {
        return PhoneDTO.builder()
            .number(PHONE_NUMBER)
            .type(PHONE_TYPE)
            .build();
    }

    public static Phone createFakeEntity() {
        return Phone.builder()
            .id(PHONE_ID)
            .number(PHONE_NUMBER)
            .type(PHONE_TYPE)
            .build();
    }

    static {
        PHONE_NUMBER = "1198155-0111";
        PHONE_TYPE = PhoneType.MOBILE;
        PHONE_ID = 1L;
    }
}