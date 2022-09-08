package com.project;

import com.project.Admin.AdminFunc;
import com.project.Customer.CustomerFunc;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    static Scanner sc= new Scanner(System.in);

    static AdminFunc af = new AdminFunc();

    static CustomerFunc cf = new CustomerFunc();
    //static AdminFunc af = new AdminFunc();
    //af.flightList;
    //af.addFlight("Indian AirLines","India","Russia","3:00","20:00");
    public static void main(String[] args) {


        af.addFlight("Indian AirLines", "India", "Russia", "3:00", "20:00");
        af.addFlight("American AirLines", "America", "India", "8:00", "10:00");
        af.addFlight("Korean AirLines", "Korean", "India", "2:00", "14:00");




        System.out.println("**** Welcome *****");
        char ch;
        do {
            System.out.println("1.Register as a customer");
            System.out.println("2.Login as a customer");
            System.out.println("3.Login as a admin");
            System.out.println("4.Exit\n");
            System.out.print("Enter your choice:");


            //Object Creation

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("\n**** Customer Registration Page *****");
                    System.out.println("Enter your name:");
                    String name = sc.nextLine();
                    System.out.println("Enter a password:");
                    String pass = sc.nextLine();
                    System.out.println("Enter your age:");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter your country");
                    String country = sc.nextLine();
                    cf.Register(name, pass, age, country);
                    customerMenu();
                    //System.out.println(name+"-"+pass);
                    break;
                case 2:
                    System.out.println("*** Customer Login Page ***");
                    System.out.println("Enter your Name:");
                    name = sc.nextLine();
                    System.out.println("Enter your Password:");
                    pass = sc.nextLine();
                    if (cf.login(name, pass)) {
                        customerMenu();
                    }
                    break;
                case 3:
                    System.out.println("*** Admin Login Page ***");
                    System.out.println("Enter your admin uname:");
                    name = sc.nextLine();
                    System.out.println("ENter your admin password:");
                    pass = sc.nextLine();
                    if (af.login(name, pass)) {
                        adminMenu();
                    }
                    break;
                case 4:
                    System.exit(0);
            }
            System.out.println("Do you wish to Continue?(Y/N)");
            ch = sc.nextLine().charAt(0);
        } while (ch == 'y' || ch == 'Y');
    }

    static void customerMenu() {
        char ch;
        do {
            System.out.println("***** Customer Menu ******");
            System.out.println("1.View Flights");
            System.out.println("2.Book Ticket");
            System.out.println("3.Exit");

            int cusChoice = sc.nextInt();
            sc.nextLine();

            switch (cusChoice) {
                case 1:
                    af.viewFlight();
                    break;
                case 2:
                    //cf.bookTicket();
                    //System.out.println(cf.customerList);
                    break;
                case 3:
                    break;
            }
            System.out.println("Do you wish to Continue in Admin Menu?(Y/N)");
            ch = sc.nextLine().charAt(0);
        } while (ch == 'y' || ch == 'Y');
    }

    static void adminMenu() {
        char ch;
        do {
            System.out.println("***** Admin Menu ******");
            System.out.println("1.View Flights");
            System.out.println("2.View Booked Tickets");
            System.out.println("3.Add Flight");
            System.out.println("4.Exit");

            int adminChoice = sc.nextInt();
            sc.nextLine();

            switch (adminChoice) {
                case 1:
                    af.viewFlight();
                    break;
                case 2:
                    //af.viewBookedTickets();
                    break;
                case 3:
                    System.out.println("*** Adding Flight ***");
                    System.out.println("Enter Flight Name:");
                    String flightName = sc.nextLine();
                    System.out.println("Enter Flight Source:");
                    String flightSource = sc.nextLine();
                    System.out.println("Enter Flight Destination:");
                    String des = sc.nextLine();
                    System.out.println("Enter Flight Departure Time:");
                    String dt = sc.nextLine();

                    System.out.println("Enter Flight Arrival Time:");
                    String at = sc.nextLine();

                    af.addFlight(flightName, flightSource, des, dt, at);
                    break;
                case 4:
                    break;
            }
            System.out.println("Do you wish to Continue in Admin Menu?(Y/N)");
            ch = sc.nextLine().charAt(0);
        } while (ch == 'y' || ch == 'Y');
    }
}
