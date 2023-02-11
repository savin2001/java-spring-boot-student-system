package firsttutorial.com.example.firsttutorial.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    // Check if the email exists in the DB
    // Method 1
    @Query(" SELECT s FROM Student s WHERE s.email =?1")
    // Method 2
    Optional<Student> findStudentByEmail(String email);
}
