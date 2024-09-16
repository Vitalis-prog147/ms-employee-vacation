package org.example.input.web;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.example.input.web.model.request.VacationRequest;
import org.example.output.model.response.VacationResponse;
import org.example.service.VacationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.example.input.web.constant.EndpointConstants.Vacation.VACATION_CALCULATE;

@RestController
@RequiredArgsConstructor
@Tag(name = "Работа с отпусками сотрудников")
public class VacationController {

    private final VacationService service;

    @Operation(summary = "Получение отпускных")
    @GetMapping(VACATION_CALCULATE)
    public ResponseEntity<VacationResponse> getVacationPay(@Valid VacationRequest params) {
        return ResponseEntity.ok(service.getVacationPay(params));
    }
}
