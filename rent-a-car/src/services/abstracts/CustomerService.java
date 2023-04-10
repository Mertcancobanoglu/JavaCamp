package services.abstracts;

import entities.Customer;

import java.util.List;

public interface CustomerService {

    void add(Customer customer);

    void delete(Customer customer);

    void update(Customer customer, int custId);

    List<Customer> getAll();

    String getCustomer(Customer customer);

    List<Customer> getCustomerList (String name);


}
