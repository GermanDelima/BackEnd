
package com.portfolio.jgd.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;



@Configuration
public class MiConfiguracionCors implements WebMvcConfigurer{
    
    
    @Override
    public void addCorsMappings(CorsRegistry registry){
       registry.addMapping("/**")
                .allowedOrigins("http://localhost:4200") // Reemplaza con el origen de tu frontend Angular
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS", "HEAD")
                .allowedHeaders("*")
                .allowCredentials(true);
    
    }

}
