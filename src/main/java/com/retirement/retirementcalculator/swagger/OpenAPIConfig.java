package com.retirement.retirementcalculator.swagger;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        Info info = new Info()
                .title("Retirement Calculator APIs")
                .version("1.0")
                .description("Set of APIs used by Retirement Calculator application");

        return new OpenAPI().info(info);
    }
}
