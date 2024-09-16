package org.example.input.web.constant;

import lombok.experimental.UtilityClass;

@UtilityClass
public class EndpointConstants {

    private static final String EMPLOYEE_VACATION = "/employee-vacation";
    private static final String API_PREFIX_V1 = "/api/v1";

    @UtilityClass
    public static class Vacation {

        public static final String VACATION_CALCULATE = EMPLOYEE_VACATION + API_PREFIX_V1 + "/calculate";
    }
}
