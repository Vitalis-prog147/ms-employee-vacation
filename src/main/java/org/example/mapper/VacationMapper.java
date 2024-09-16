package org.example.mapper;

import org.example.output.model.response.VacationResponse;
import org.springframework.stereotype.Component;

@Component
public class VacationMapper {

    public VacationResponse toVacationResponse(Integer vacationPay) {

        return VacationResponse.builder()
                .vacationPay(vacationPay)
                .build();
    }
}
