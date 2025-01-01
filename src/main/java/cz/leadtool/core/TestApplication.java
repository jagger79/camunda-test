package cz.leadtool.core;

import io.camunda.zeebe.spring.client.annotation.Deployment;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Deployment(resources = {"classpath:process/process-declaration-create.bpmn",
        "classpath:process/process-declaration-update.bpmn",
        "classpath:process/process-declaration-submit-to-cms.bpmn"
})
public class TestApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }
}
