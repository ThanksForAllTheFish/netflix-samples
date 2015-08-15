package org.t4atf.netflix;

import javax.annotation.Resource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@EnableAutoConfiguration
@EnableEurekaClient
@RestController
public class Application {
  
  @Resource
  private Environment env;

  @RequestMapping("/")
  public String home() {
    //env.getProperty("spring.application.name");
    return "Hello World from " + env.getProperty("spring.application.name");
  }

  public static void main(String[] args) {
    
    SpringApplication.run(Application.class, args);
  }

}

