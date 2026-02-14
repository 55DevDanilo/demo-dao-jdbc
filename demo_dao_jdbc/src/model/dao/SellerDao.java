package model.dao;

import java.util.List;

import module.entities.Department;
import module.entities.Seller;

public interface SellerDao {

	void insert(Department obj);

	void update(Department obj);

	void deleteById(Department obj);

	Seller findById(Integer id);

	List<Seller> findAll();
	List<Seller> findByDepartment(Department department);

}
