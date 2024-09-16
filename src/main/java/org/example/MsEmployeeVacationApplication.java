package org.example;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(
        info = @Info(
                title = "ms-employee-vacation",
                description = "Микросервис по работе с отпусками сотрудников"
        )
)
@SpringBootApplication
public class MsEmployeeVacationApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsEmployeeVacationApplication.class, args);
    }
}
