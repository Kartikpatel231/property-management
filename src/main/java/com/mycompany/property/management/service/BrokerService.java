package com.mycompany.property.management.service;

import com.mycompany.property.management.modal.Customer;

import java.util.Scanner;

public class BrokerService {
    public Customer getNewCustomer() {
        Scanner ob = new Scanner(System.in);
        Customer newCustomer = new Customer();

        System.out.println("Customer Information");
        System.out.println("Enter Customer id =");
        newCustomer.setId(ob.nextInt());
        System.out.println("Enter Customer name =");
        newCustomer.setStuname(ob.next());
        ob.nextLine();
        System.out.println("Enter Customer collageName =");
        newCustomer.setCollageName(ob.nextLine());
        System.out.println("Enter Phone Number");
        newCustomer.setPhoneNo(ob.nextDouble());
        return newCustomer;
    }
}
