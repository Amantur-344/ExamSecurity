package kg.Exam.service;

import kg.Exam.entity.Tickets;
import kg.Exam.repository.TicketsRepository;

import javax.validation.constraints.Max;
import java.util.List;

public interface TicketsService {
    List<Tickets> getAll();
    Tickets create (Tickets tickets);
}
