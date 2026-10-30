package dev.fykio.gademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@SpringBootApplication
@RestController
public class GademoApplication {

	private static final Logger log = Logger.getLogger(GademoApplication.class.getName());

	public static void main(String[] args) {
		SpringApplication.run(GademoApplication.class, args);
	}

	@GetMapping("/")
	public ResponseEntity<String> home() {
		log.info("Home hit!");
		return ResponseEntity.ok().body("<h3>Welcome to Continuous Integration demo using GitHub, GitHub Actions, & Docker Hub And Hello World!</h3>");
	}

	@GetMapping("/ping")
	public ResponseEntity<String> ping() {
		log.info("Service pinged!");
		return ResponseEntity.ok().body("GA Demo Service is up...");
	}
}
