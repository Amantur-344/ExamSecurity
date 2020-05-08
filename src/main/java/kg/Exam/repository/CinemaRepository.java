package kg.Exam.repository;

import kg.Exam.entity.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CinemaRepository extends JpaRepository<Cinema,Long> {
}
