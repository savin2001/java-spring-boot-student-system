package firsttutorial.com.example.firsttutorial.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
        // Here you can do complex validation such as whether email is valid or not, e.t.c
        Optional<Student> studentOptional = studentRepository.findStudentByEmail(student.getEmail());

        // Checking if email exists
        if (studentOptional.isPresent()){
            throw new IllegalStateException("Email already taken");
        }
        studentRepository.save(student);
    }
}
