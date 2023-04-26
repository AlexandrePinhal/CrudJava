    package com.example.app.repository;

    import org.springframework.data.jpa.repository.JpaRepository;
    import org.springframework.stereotype.Repository;
    import com.example.app.model.Student;
    import java.util.List;

    @Repository
    public interface StudentRepository extends JpaRepository<Student, Long> {
        List<Student> findByPromotion(String promotion);
    }