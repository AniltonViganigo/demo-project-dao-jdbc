package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

		System.out.println("\n=== Test number one: Department insert === ");
		Department newDepartment = new Department(null, "Artigos Esportivos");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New department = " + newDepartment.getId());

		System.out.println("\n=== Teste number two: Department findById ");
		Department department = departmentDao.findById(1);
		System.out.println(department);

		System.out.println("\n=== Teste number three: Department delete ");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed!");

		System.out.println("\n=== Teste number four: Department findAll ");
		List<Department> list = new ArrayList<>();
		list = departmentDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);
		}

		System.out.println("\n=== Teste number five: Department Update ");
		department = departmentDao.findById(10);
		department.setName("Vestuário");
		departmentDao.update(department);

		sc.close();

	}

}
