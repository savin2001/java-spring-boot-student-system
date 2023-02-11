package firsttutorial.com.example.firsttutorial.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private  final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    public List<Student> getStudents(){
        return studentRepository.findAll();
//                List.of(
//                new Student(
//                        1L,
//                        "Savin",
//                        "test@mele.com",
//                        LocalDate.of(2005, Month.JULY, 7),
//                        22
//
//                )
//        );
    }

    // Adding new students to the db
    public void addNewStudent(Student student) {
        System.out.println(student);
    }
}
