
package com.portfolio.jgd.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;



@Configuration
public class MiConfiguracionCors implements WebMvcConfigurer{
    
    
    @Override
    public void addCorsMappings(CorsRegistry registry){
       registry.addMapping("/**")
                .allowedOrigins("https://delimaprograma.web.app") 
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS", "HEAD")
                .allowedHeaders("*")
                .allowCredentials(true);
    
    }

}
