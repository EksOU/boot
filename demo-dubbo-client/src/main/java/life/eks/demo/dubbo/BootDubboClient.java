package life.eks.demo.dubbo;

import org.springframework.boot.SpringApplication;

import com.alibaba.dubbo.config.annotation.Reference;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Eks OU
 */
@SpringBootApplication
@RestController
public class BootDubboClient {

	@Reference(version = "1.0.0")
  	private HelloDubboService demoService;

	public static void main(String[] args) {
		SpringApplication.run(BootDubboClient.class, args);
	}
	
	@RequestMapping("/")
    public String home() {
		return demoService.sayHello("world");
    }
}
