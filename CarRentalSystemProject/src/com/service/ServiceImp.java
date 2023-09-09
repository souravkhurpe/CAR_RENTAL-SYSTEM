package com.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.model.Car;
import com.model.Customer;

public class ServiceImp implements services {

	Scanner sc = new Scanner(System.in);

	List<Car> car = new ArrayList<Car>();
	List<Customer> customer = new ArrayList<Customer>();

	@Override
	public void addCar() {
		System.out.println("How many Car u want to add: ");

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			Car c = new Car();

			System.out.println("Enter car Id: ");

			c.setCid(sc.nextInt());

			System.out.println("Enter car name: ");

			c.setcName(sc.next());

			System.out.println("Enter car brand: ");

			c.setcBrand(sc.next());

			System.out.println("Enter car base price for per day: ");

			c.setBasePrice(sc.nextDouble());

			c.setAvailable(true);

			car.add(c);
			System.out.println("Car Added Successfully");
		}

	}

	@Override
	public void rentCar() {

		System.out.println("Enter ur customer id: ");

		int id = sc.nextInt();
		for (Customer customer : customer) {

			if (id == customer.getId()) {
				System.out.println("Successfully login...!!");
				System.out.println();
				
				System.out.println("Your Details: ");
				System.out.println(customer);
				System.out.println();
				System.out.println("Cars Details: ");
				showCar();

				System.out.println("enter car id u want from rent: ");
				int cid = sc.nextInt();
				boolean flag = true;
				while (flag) {
					for (Car car : car) {
						if (cid == car.getCid() && car.isAvailable()) {

							System.out.println("Car Details: ");
							System.out.println(car);
							System.out.println("How many days u want car for rent: ");

							int days = sc.nextInt();
							double total = days * car.getBasePrice();

							car.setAvailable(false);
							customer.setRent(true);
							customer.setCarRent("Car id: " + car.getCid() + ", Car brand: " + car.getcBrand()
									+ ", Car name: " + car.getcName() + ", Duration of rent: " + days);
//							System.out.println( customer.getCarRent());
//							customer.setCarRent(car.getcName());
							System.out.println(customer.getName() + " have successfully rented" + " " + car.getcName()
									+ " " + "for " + days + " days " + "total charge: " + total);
							flag = false;
							break;
						}

					}
					if (flag) {
						System.out.println("Car Wrong id or car is not Available");
						break;
					}
				}
			}
		}

	}

	public void showCustomerDetails() {

		System.out.println("Enter your customer id: ");
		int cid = sc.nextInt();
		boolean flag = true;

		while (flag) {
			for (Customer c : customer) {

				if (cid == c.getId()) {
					System.out.println(c);
					flag = false;
					break;

				}
			}
			if (flag) {
				System.out.println("Customer Dosnt exist....!!");
				break;
			}

		}

	}

	@Override
	public void showCar() {
		
		if(car.isEmpty()) {
			System.out.println("No cars added, plz add cars.");
		}else {
			System.out.println("Car Details: ");
		for (Car c : car) {
			System.out.println(c);
		}
		}

	}

	@Override
	public void addCustomer() {
		Customer c = new Customer();
		System.out.println("Enter ur name: ");

		c.setName(sc.next());

		System.out.println("Enter ur id: ");

		c.setId(sc.nextInt());

		System.out.println("Enter mobile");
		c.setMobileNo(sc.nextLong());

		customer.add(c);
		System.out.println("Account created Successfully...!!");

	}

	@Override
	public void returnCar() {

		Customer cus = null;
		System.out.println("Enter ur customer id: ");
		int cid = sc.nextInt();
		for (Customer customer : customer) {
			if (cid == customer.getId()) {
				System.out.println("Successfully login...!!");
				System.out.println("Your Details: ");
				System.out.println(customer);

				System.out.println("Enter car id which u have to written: ");

				int carId = sc.nextInt();
				for (Car car : car) {
					if (carId == car.getCid()) {
						car.setAvailable(true);
						customer.setCarRent("Not taken any car on rent");
						customer.setRent(false);

						System.out.println("Car successfully Returned");
						cus = customer; // for deleting customer from history once returned

					}
				}
			}
		}
		if (cus != null) {
			customer.remove(cus);
		}

	}

}
