package com.bss.kerberosspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
public class KerberosSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(KerberosSpringApplication.class, args);
    }

}
