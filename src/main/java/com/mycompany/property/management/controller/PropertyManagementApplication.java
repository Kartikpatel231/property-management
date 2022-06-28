package com.mycompany.property.management.controller;

import com.mycompany.property.management.modal.Customer;
import com.mycompany.property.management.service.BrokerService;
import com.mycompany.property.management.service.OwnerService;
import com.mycompany.property.management.studentInformation.Details;

//@SpringBootApplication //spring boot configuration,unable auto configuration class,component ,etc
public class PropertyManagementApplication {
 //   BrokerService brokerService;
   // OwnerService ownerService;

   /* public PropertyManagementApplication() {
        brokerService = new BrokerService();
        ownerService = new OwnerService();
        }*/

    public static void main(String[] args) {
        //SpringApplication.run(PropertyManagementApplication.class, args); //embeded tomcat server to run our program
       // PropertyManager obj = new PropertyManagementApplication();
      PropertyManager obj=new PropertyManager();
        obj.run();
       // Details objj=new Details();
       // objj.run();
    }

   /*private void run() {
    StudentDetailM stuobj = collage.setCollageDetail();
    student.getCollageInformation(stuobj);
   /*     Customer newCustomer = brokerService.getNewCustomer();
        ownerService.saveNewCustomer(newCustomer);
    }*/
}