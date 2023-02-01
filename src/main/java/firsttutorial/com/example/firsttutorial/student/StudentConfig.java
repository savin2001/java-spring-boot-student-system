package firsttutorial.com.example.firsttutorial.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner (StudentRepository repository){
        return args -> {
            Student savin = new Student(
                        "Savin",
                        "test@mele.com",
                        LocalDate.of(2005, Month.JULY, 7),
                        22
                );
            Student dee = new Student(
                    "Dee",
                    "dee@mele.com",
                    LocalDate.of(2005, Month.DECEMBER, 23),
                    24
            );
            repository.saveAll(
                    List.of(savin, dee)
            );
        };
    }
}
