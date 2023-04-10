package entities;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private int custId;
    private  String name;
    private String lastName;
    private boolean driverLicense;
    private Car car;

    public Customer(int custId,String name, String lastName, boolean driverLicense, Car car) {
        this.custId= custId;
        this.name = name;
        this.lastName = lastName;
        this.driverLicense = driverLicense;
        this.car = car;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(boolean driverLicense) {
        this.driverLicense = driverLicense;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custId=" + custId +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", driverLicense=" + driverLicense +
                '}';
    }
}
