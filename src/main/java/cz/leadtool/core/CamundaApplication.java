package cz.leadtool.core;

import io.camunda.zeebe.spring.client.annotation.Deployment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Deployment(resources = {"classpath:process/*.bpmn"})
public class CamundaApplication {
    public static void main(String[] args) {
        SpringApplication.run(CamundaApplication.class, args);
    }
}
