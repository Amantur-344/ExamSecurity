package kg.Exam.repository;

import kg.Exam.entity.Tickets;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketsRepository extends JpaRepository<Tickets,Long> {
}
