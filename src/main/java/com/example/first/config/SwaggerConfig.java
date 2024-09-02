package com.example.first.config;

//import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;

import java.util.List;

/*
@Configuration
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("public")
                .pathsToMatch("/**")
                .build();
    }

}*/
@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI defineOpenApi() {
        Server dev = new Server();
        dev.setUrl("http://localhost:8080");
        dev.setDescription("Development");

        Info information = new Info()
                .title("Profile Management APIs")
                .version("1.0")
                .description("API endpoints for profile management service");

        return new OpenAPI()
                .info(information)
                .servers(List.of(dev));
    }
}