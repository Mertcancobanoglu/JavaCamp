package services.concretes;

import dataAccess.abstracts.BranchDao;
import entities.Branch;
import entities.Car;
import entities.Customer;
import services.abstracts.BranchService;

import java.util.ArrayList;
import java.util.List;

public class BranchManager implements BranchService {
     private BranchDao branchDao;

     public BranchManager(){
         branches.add(new Branch(1,"Avis","İstanbul"));
         branches.add(new Branch(2,"axa","ankara"));
         branches.add(new Branch(3,"vavacars","izmir"));
         branches.add(new Branch(4,"tiktak","adana"));
     }

     List<Branch> branches = new ArrayList<>();
    @Override
    public void add(Branch branch) {
        if(branch.getBranchName().equals("")){
            System.out.println("Bayi ismi boş olamaz");
        }
        branches.add(branch);



    }

    @Override
    public void delete(Branch branch) {
        branches.remove(branch);

    }

    @Override
    public void update(Branch branch) {
        for(Branch branch1:branches){
            if (branch1.getBranchName()== branch.getBranchName()){
                branch1.setBranchId(branch.getBranchId());
                branch1.setLocation(branch.getLocation());
            }
        }

    }

    @Override
    public List<Branch> getAll() {
        return branches;
    }

    @Override
    public void rentCar(Car car, Customer customer) {

    }
}
