package top.smartsoftware.smarthr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SmarthrApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmarthrApplication.class, args);
    }

    @RequestMapping("/")
    public String index() {
        return "Hello,Smart Hr";
    }

}
