package com.nv;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDockerDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDockerDemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(DemoRepository demoRepository) {
        return args -> {
            demoRepository.save(new DemoEntity("Docker", "Docker Demo"));
        };
    }

}
