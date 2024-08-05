package org.hari.spring.boot.ms;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloMicroServiceApplication {

    private static Logger log = LoggerFactory.getLogger(HelloMicroServiceApplication.class);

    public static void main(String[] args) {
        log.info("starting application..");
        SpringApplication.run(HelloMicroServiceApplication.class, args);
    }

    @PostConstruct
    public void init(){
        log.info("Object have been constructed");
    }

    @GetMapping("/sayHello")
    public String sayHello(){
        log.info("sayHello");
        return "Hello Jenkins User";
    }

}
