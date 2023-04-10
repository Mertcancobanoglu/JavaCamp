import entities.Branch;
import entities.Car;
import entities.Customer;
import services.concretes.BranchManager;
import services.concretes.CarManager;
import services.concretes.CustomerManager;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager();
        List<Customer> customerList = customerManager.getCustomerList("murat");
        for (Customer cust : customerList) {
            System.out.println(cust.toString());
            Customer customer1 = new Customer(9, "Mehmet", "ata", true, new Car("Mercedes", 2, 236657, 400, "sedan"));
            System.out.println(customer1);
        }
        CarManager carManager = new CarManager();
        List<Car> carList = carManager.getAll();
        Car car1 = new Car("toyota", 8, 5665485, 100, "sedan");
        System.out.println(car1);


        BranchManager branchManager = new BranchManager();
        List<Branch> branchList = branchManager.getAll();
        Branch branch1 =new Branch(4,"Getir","istanbul");
        System.out.println(branch1);
        System.out.println(branchList);



    }
}