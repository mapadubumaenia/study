package com.simplecoding.simpledms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaAuditing
// TODO: JPA 사용 폴더 지정
@EnableJpaRepositories(basePackages = "com.simplecoding.simpledms.jpa")
//TODO: es 사용 폴더 지정
@EnableElasticsearchRepositories(basePackages = "com.simplecoding.simpledms.es")
public class SimpleDmsApplication {
    public static void main(String[] args) {
        SpringApplication.run(SimpleDmsApplication.class, args);
    }

}
