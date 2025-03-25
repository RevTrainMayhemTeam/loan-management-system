package com.mayhem.lms.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Loan Management System API")
                        .version("1.0")
                        .description("REST API for managing loans and users")
                        .contact(new Contact()
                                .name("Mayhem Team")
                                .email("contact@mayhem.com")));
    }
}
