package br.com.springjsf.springjsf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableCaching
@SpringBootApplication(scanBasePackages = { "br.com.springjsf.entity", "br.com.springjsf.beans",
		"br.com.springjsf.security" }, scanBasePackageClasses = { RedirectToIndexConfigurationProvider.class })
@EnableJpaRepositories(basePackages = "br.com.springjsf.repository")
public class JsfSpringApplication {
	public static void main(String[] args) {
		SpringApplication.run(JsfSpringApplication.class, args);
	}

}
