package javaproject.CarMng;

import java.util.*;

public class Showroom implements utility {

    String showroom_name;
    String showroom_address;
    int total_employees;
    int total_cars;
    String Manager_name;

    @Override
    public void get_details() {
        System.out.println("Showroom Name : " + showroom_name);
        System.out.println("Showroom Address : " + showroom_address);
        System.out.println("Manager Nmae : " + Manager_name);
        System.out.println("Total Employees : " + total_employees);
        System.out.println("Total Cras In Stock : " + total_cars);
    }

    @Override
    public void set_details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("=============== **** ENTER SHOWROOM DETAILS **** ==============");
        System.out.println();
        System.out.println("SHOWROOM NAME : ");
        showroom_name = sc.nextLine();
        System.out.println("SHOWROOM ADDRESS : ");
        showroom_address = sc.nextLine();
        System.out.println("MANAGER NAME : ");
        Manager_name = sc.nextLine();
        System.out.println("TOTAL NO. OF EMPLOYEES : ");
        total_employees = sc.nextInt();
        System.out.println("TOTAL CARS IN STOCK : ");
        total_cars = sc.nextInt();

    }

}
