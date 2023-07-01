package max.lab.spring3native;

import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelloSpring3NativeApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpring3NativeApplication.class, args);
	}

	@GetMapping("/hello")
	public Map<String, String> hello() {
		return Map.of("hello", "world");
	}

}
