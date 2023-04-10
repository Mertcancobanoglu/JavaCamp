package services.concretes;

import dataAccess.abstracts.CustomerDao;
import entities.Customer;
import services.abstracts.CustomerService;

import java.util.ArrayList;
import java.util.List;

public class CustomerManager implements CustomerService {
    private CustomerDao customerDao;
    List<Customer> customers = new ArrayList<>();

    public CustomerManager() {
        customers.add(new Customer(1,"Mertcan","Cobanoglu",true,null));
        customers.add(new Customer(2,"Ramazan","Cobanoglu",true,null));
        customers.add(new Customer(3,"Aras","Cobanoglu",false,null));
        customers.add(new Customer(4,"Rusen","Cobanoglu",false,null));
        customers.add(new Customer(5,"Seyfi","Cobanoglu",false,null));
        customers.add(new Customer(6,"Murat","Cobanoglu",true,null));
        customers.add(new Customer(6,"Murat","Cobanoglu",true,null));
        customers.add(new Customer(6,"Murat","Cobanoglu",true,null));
        customers.add(new Customer(6,"Murat","Cobanoglu",true,null));
        customers.add(new Customer(6,"Murat","Cobanoglu",true,null));
    }

    @Override
    public void add(Customer customer) {
        if(customer.isDriverLicense()){
            customers.add(customer);
        }
    }

    @Override
    public void delete(Customer customer) {
        customers.remove(customer);

    }

    @Override
    public void update(Customer customer, int custId) {
        for(Customer cust : customers){
            Customer customer1 = customerDao.update();
            customer.setCustId(custId);
            return;

        }


    }

    @Override
    public List<Customer> getAll() {
        return customers;
    }



    @Override
    public String getCustomer(Customer customer) {
        for (Customer cust : customers){
            if(cust.getCustId() == customer.getCustId()){
                return cust.toString();
            }
        }
        return null;
    }

    @Override
    public List<Customer> getCustomerList(String name) {
        List<Customer> customerList = new ArrayList<>();
        for (Customer cust : customers){
            if(cust.getName().equalsIgnoreCase(name)){
                customerList.add(cust);
            }
        }
        return customerList;
    }
}
