package firsttutorial.com.example.firsttutorial;

import firsttutorial.com.example.firsttutorial.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class FirstTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstTutorialApplication.class, args);
	}

	@GetMapping(path = "/")
	public List<Student> hello(){
		return List.of(
				new Student(
						1L,
						"Savin",
						"test@mele.com",
						LocalDate.of(2005, Month.JULY, 7),
						22

				)
		);
	}

}
