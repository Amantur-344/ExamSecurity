package kg.Exam.service;

import kg.Exam.entity.Restaurant;

import java.util.List;

public interface RestaurantService {
    List<Restaurant> getAll();
    Restaurant create (Restaurant restaurant);
}
