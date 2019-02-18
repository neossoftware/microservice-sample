package com.neosuniversity.demomicroservice;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:4200")
                .allowedMethods("GET")
                .allowedHeaders("Content-Type", "Access-Control-Allow-Origin", "Access-Control-Allow-Headers", "Authorization", "X-Requested-With", "requestId", "Correlation-Id")
                .allowCredentials(false).maxAge(3600);
    }
}

