package services.concretes;

import dataAccess.abstracts.CarDao;
import dataAccess.abstracts.CustomerDao;
import entities.Car;
import entities.Customer;
import services.abstracts.CarService;

import java.util.ArrayList;
import java.util.List;

public class CarManager implements CarService {
    private CarDao carDao;
    List<Car> cars = new ArrayList<>();

    public CarManager() {
        cars.add(new Car("Skoda",4,7588521,200,"sedan"));
        cars.add(new Car("BMW",3,465456,250,"Suv"));
        cars.add(new Car("Mercedes",1,778998,241,"sedan"));
        cars.add(new Car("Seat",4,1445632,125,"sedan"));
        cars.add(new Car("Audi",2,1233320,250,"sedan"));
        cars.add(new Car("Porsche",0,1425523,500,"sport"));


    }


    @Override
    public void add(Car car) {
        if(car.getCarName().equals("")){
            System.out.println("Araç ismi boş olamaz");
        }else {
            cars.add(car);
        }
    }

    @Override
    public void delete(Car car) {
        cars.remove(car);
    }

    @Override
    public void update(Car car, int engineNumber) {
    for (Car car1:cars){
        if(car1.getEngineNumber()==engineNumber){
            car1.setCarName(car.getCarName());
            car1.setAge(car.getAge());
            car1.setModel(car.getModel());
        }
    }

    }

    @Override
    public List<Car> getAll() {
        return cars;
    }
}