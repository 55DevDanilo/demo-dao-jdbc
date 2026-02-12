package model.dao;

import java.util.List;

import module.entities.Department;

public interface SellerDao {

	void insert(Department obj);

	void update(Department obj);

	void deleteById(Department obj);

	Department findbyId(Integer id);

	List<Department> findAll();

}
