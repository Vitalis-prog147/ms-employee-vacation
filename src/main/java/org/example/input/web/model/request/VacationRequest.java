package org.example.input.web.model.request;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;

import java.util.List;

import static org.example.input.web.constant.Constants.MAXIMUM_DAYS_VACATION;
import static org.example.input.web.constant.Constants.MAXIMUM_SALARY;

@Builder
public record VacationRequest(

        @NotNull
        @Max(value = MAXIMUM_SALARY)
        @Schema(description = "Средняя зарплата за 12 месяцев")
        Integer averageSalary,

        @NotNull
        @Max(value = MAXIMUM_DAYS_VACATION)
        @Schema(description = "Количество дней отпуска")
        Integer vacationDays,

        @Size(max = MAXIMUM_DAYS_VACATION)
        @Schema(description = "Список дней ухода в отпуск")
        List<Integer> listVacationDays
) {
}
