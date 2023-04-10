package dataAccess.abstracts;

import entities.Branch;
import entities.Car;

import java.util.List;

public interface BranchDao {
    List<Branch> getAll();
    void add(Branch branch);
    void delete(Branch branch);
    Branch update(Branch branch);
}
