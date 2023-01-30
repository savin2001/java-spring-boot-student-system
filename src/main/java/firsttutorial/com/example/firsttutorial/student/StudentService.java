package firsttutorial.com.example.firsttutorial.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {
    public List<Student> getStudents(){
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
