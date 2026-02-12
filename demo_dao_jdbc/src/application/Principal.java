package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import module.entities.Department;
import module.entities.Seller;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department obj = new Department(1, "books");
		System.out.print(obj);
		
		Seller obj1 = new Seller(21,"Bob","bob@gmail.com",new Date(),3000.00,obj);
		System.out.print(obj1);
		
		SellerDao sellerdao = DaoFactory.createSellerDao();

	}

}
