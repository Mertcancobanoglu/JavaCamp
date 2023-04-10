package dataAccess.abstracts;

import entities.Customer;

import java.util.List;

public interface CustomerDao {
    List<Customer> getAll();
    void add(Customer customer);
    void delete(int custId);
    Customer update();



}
