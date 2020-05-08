package kg.Exam.service;

import kg.Exam.entity.Cinema;
import kg.Exam.repository.CinemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CinemaServiceImpl implements CinemaService {
    @Autowired
    private CinemaRepository cinemaRepository;
    @Override
    public Cinema create(Cinema cinema) {
        return cinemaRepository.save(cinema);
    }

    @Override
    public List<Cinema> getAll() {
        return cinemaRepository.findAll();
    }


}
