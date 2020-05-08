package kg.Exam.service;

import kg.Exam.entity.Cinema;

import java.util.List;

public interface CinemaService {
    Cinema create(Cinema cinema);
    List<Cinema> getAll();
}
