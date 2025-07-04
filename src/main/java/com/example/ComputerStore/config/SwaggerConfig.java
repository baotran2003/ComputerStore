package com.example.ComputerStore.config;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;
@OpenAPIDefinition(
        info = @Info(
                contact = @Contact(
                        name = "Bao",
                        email = "bao2003@gmail.com"
                ),
                description = "OpenApi documentation for Spring Security",
                title = "OpenApi specification - Education System",
                version = "1.0",
                license = @License(
                        name = "License name",
                        url = "https://some-url.com/"
                ),
                termsOfService = "Terms of service"
        ),
        servers = {
                @Server(
                        description = "Local Education-System ",
                        url = "http://localhost:8090"
                ),
        }
//        // API yêu cầu JWT token và các yêu cầu phải được xác thực
//        security = {
//                @SecurityRequirement(name = "bearerAuth")
//        }
)
//@SecurityScheme(
//        name = "bearerAuth",
//        description = "JWT auth description",
//        // schme: "Bearer," "Basic," hoặc "OAuth
//        scheme = "bearer",
//        type = SecuritySchemeType.HTTP,
//        bearerFormat = "JWT",
//        in = SecuritySchemeIn.HEADER
//)
public class SwaggerConfig {
}
