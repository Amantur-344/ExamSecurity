package kg.Exam.service;

import kg.Exam.entity.Tickets;
import kg.Exam.repository.TicketsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TicketsServiceImpl implements TicketsService {
    @Autowired
    private TicketsRepository ticketsRepository;
    @Override
    public List<Tickets> getAll() {
        return ticketsRepository.findAll();
    }

    @Override
    public Tickets create(Tickets tickets) {
        return ticketsRepository.save(tickets);
    }
}
