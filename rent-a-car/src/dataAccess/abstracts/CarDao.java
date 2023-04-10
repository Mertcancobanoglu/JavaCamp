package dataAccess.abstracts;

import entities.Car;

import java.util.List;

public interface CarDao {
    List<Car> getAll();
    void add(Car car);
    void delete(int engineNumber);
    Car update(Car car ,int engineNumber);
}
