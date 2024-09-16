package org.example.output.model.response;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;

@Builder
public record VacationResponse(

        @Schema(description = "Отпускные")
        Integer vacationPay
) {
}
