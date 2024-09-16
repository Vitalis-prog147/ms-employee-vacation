package org.example.web.vacation;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.BaseIntegrationTest;
import org.example.input.web.model.request.VacationRequest;
import org.example.output.model.response.VacationResponse;
import org.example.service.VacationService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.assertEquals;


class GettingUnitTest extends BaseIntegrationTest {

    private final VacationService vacationService;

    @Autowired
    public GettingUnitTest(MockMvc mockMvc,
                           ObjectMapper objectMapper,
                           VacationService vacationService) {
        super(mockMvc, objectMapper);
        this.vacationService = vacationService;
    }

    @Test
    void searchWithFilterAndPagination_invalidParams() {
        final VacationRequest request = VacationRequest.builder()
                .averageSalary(1000)
                .vacationDays(10)
                .build();

        VacationResponse response = vacationService.getVacationPay(request);
        assertEquals(response.vacationPay(), 10000);
    }
}
