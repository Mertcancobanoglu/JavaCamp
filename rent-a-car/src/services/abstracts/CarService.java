package services.abstracts;

import entities.Car;
import entities.Customer;

import java.util.List;

public interface CarService {
    void add(Car car);

    void delete(Car car);

    void update(Car car, int engineNumber);

    List<Car> getAll();

}
