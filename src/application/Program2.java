package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		System.out.println("\n=== Test number one: seller insert === ");
		Department newDepartment = new Department(null, "Artigos Esportivos");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New department = " + newDep'artment.getId());
		
		System.out.println("\n=== Test number two: seller Update === ");
		depar= sellerDao.findById(3);
		seller.setName("Maria Juana");
		seller.setEmail("mariajuana@gmail.com");
		sellerDao.update(seller);
		System.out.println("Update completed!");


	}

}
