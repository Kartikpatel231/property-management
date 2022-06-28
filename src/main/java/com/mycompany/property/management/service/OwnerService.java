package com.mycompany.property.management.service;

import com.mycompany.property.management.modal.Customer;

public class OwnerService {
    public void saveNewCustomer(Customer cus) {
        System.out.println("ID = " + cus.getId());
        System.out.println("Name = " + cus.getStuname());
        System.out.println("Collage = " + cus.getCollageName());
        System.out.println("Phone = " + cus.getPhoneNo());
        if (cus.getId() == 20100 && cus.getCollageName().equals("svvvInore")) {
            System.out.println("Customer is from SvvvIndorecollage");
        } else {
            System.out.println("Another collage");
        }
    }
}
