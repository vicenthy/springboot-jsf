package br.com.springjsf.springjsf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication(scanBasePackages = {"br.com.springjsf*"
}, scanBasePackageClasses = {RedirectToIndexConfigurationProvider.class})
public class JsfSpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(JsfSpringApplication.class, args);
    }

}
