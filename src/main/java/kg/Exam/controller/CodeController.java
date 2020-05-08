package kg.Exam.controller;

import kg.Exam.entity.Cinema;
//import kg.Exam.entity.Code;
//import kg.Exam.entity.Tickets;
//import kg.Exam.repository.CodeRepository;
import kg.Exam.model.Code;
import kg.Exam.service.CinemaService;
import kg.Exam.service.CodeService;
import kg.Exam.service.RestaurantService;
import kg.Exam.service.TicketsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/book")
public class CodeController {
//    @Autowired
//    private CodeService codeService;
    @Autowired
    private CinemaService cinemaService;
    @Autowired
    private RestaurantService restaurantService;
    @Autowired
    private TicketsService ticketsService;

    @GetMapping("/{code}")
    public List<Code> getAll(){
        return Code ;//Я не знаю как можно возвращать этот код
    }

//    private LocalDateTime localDateTime;

//    @GetMapping("/{code}")
//    public List<Code> getAll() {
//        return codeService.getAll();
//    }
//
//    public List<Cinema> getAllCinema() {
//        return cinemaService.getAll();
//        codeService.create();
//    }
//
//    public List<Cinema> getAllRestaurant() {
//        return restaurantService.getAll();
//        codeService.create();
//    }
//    public List<Cinema> getAllTickets() {
//        return ticketsService.getAll();
//        codeService.create();
//    }
}