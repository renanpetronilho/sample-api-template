package io.fylabs.sampleapi.config;


import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiDocConfig {

    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Sample API")
                        .description("API Sample Template")
                        .version("v0.0.1"))
                .externalDocs(new ExternalDocumentation()
                        .description("SampleAPI Wiki Documentation")
                        .url("http://google.com"));
    }
}
