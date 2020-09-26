package com.distributedkvstore.manager.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

public class AppConfig {
    @Configuration
    @EnableSwagger2
    public class SwaggerConfig {
        @Bean
        public Docket Api() {
            return new Docket(DocumentationType.SWAGGER_2)
                    .select()
                    .paths(PathSelectors.any())
                    .build();
        }
    }
}
