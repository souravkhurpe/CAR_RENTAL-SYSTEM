package com.controller;

import java.util.Scanner;

import com.service.ServiceImp;
import com.service.services;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		services s = new ServiceImp();

		boolean flag = true;
		while (flag) {
			System.out.println(" ********************* WELCOME TO CAR RENTAL SHOWROOM *********************");
			System.out.println("||------------ 1) Add new car to showroom -------------------------------||");
			System.out.println("||------------ 2) Show all cars in showroom	-------------------------||");
			System.out.println("||------------ 3) create new customer account ---------------------------||");
			System.out.println("||------------ 4) Take a car on rent ------------------------------------||");
			System.out.println("||------------ 5) Return a car ------------------------------------------||");
			System.out.println("||------------ 6) Get customer history ----------------------------------||");
			System.out.println("||------------ 0) exit --------------------------------------------------||");
			int ch = sc.nextInt();
			switch (ch) {

			case 1:
				s.addCar();
				break;
			case 2:
				s.showCar();
				break;
			case 3:
				s.addCustomer();
				break;
			case 4:
				s.rentCar();
				break;
			case 5:
				s.returnCar();
				break;
			case 6:
				s.showCustomerDetails();
				break;
			case 0:
				flag = false;
				break;
			default:
				System.out.println("Invalid choice, plz enter valid choice");

			}
		}
	}
}
