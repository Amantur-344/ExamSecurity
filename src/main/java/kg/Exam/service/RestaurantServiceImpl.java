package kg.Exam.service;

import kg.Exam.entity.Restaurant;
import kg.Exam.repository.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantServiceImpl implements RestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepository;
    @Override
    public List<Restaurant> getAll() {
        return restaurantRepository.findAll();
    }

    @Override
    public Restaurant create(Restaurant restaurant) {
        return restaurantRepository.save(restaurant);
    }
}
