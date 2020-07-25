package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

		SellerDao sellerDao = DaoFactory.createSellerDao();
		System.out.println("=== Test number one: seller findById === ");
		Seller seller = sellerDao.findById(8);
		System.out.println(seller);

		
		System.out.println("\n=== Test number two: seller findByDepartment === ");
		Department department = new Department(4, null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== Test number three: seller findAll === ");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== Test number three: seller findAll === ");
		Seller newSeller = new Seller(null, "Quixote", "quixote@hotmail.com", new Date(), 6700.00, department);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New Id = " + newSeller.getId());
		
	}
		
	}


