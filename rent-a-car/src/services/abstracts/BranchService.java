package services.abstracts;

import entities.Branch;
import entities.Car;
import entities.Customer;

import java.util.List;

public interface BranchService {
    void add(Branch branch);

    void delete(Branch branch);

    void update(Branch branch);

    List<Branch> getAll();

    void rentCar(Car car, Customer customer);
}
