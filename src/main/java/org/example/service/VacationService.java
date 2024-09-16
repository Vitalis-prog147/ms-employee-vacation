package org.example.service;

import lombok.RequiredArgsConstructor;
import org.example.input.web.model.request.VacationRequest;
import org.example.mapper.VacationMapper;
import org.example.output.model.response.VacationResponse;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VacationService {

    private final VacationMapper mapper;

    public VacationResponse getVacationPay(VacationRequest params) {
        return mapper.toVacationResponse(
                calculationVacationPay(params)
        );
    }

    private static Integer calculationVacationPay(VacationRequest params) {
        return params.averageSalary() * params.vacationDays();
    }
}
