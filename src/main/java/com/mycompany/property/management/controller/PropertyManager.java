package com.mycompany.property.management.controller;

import com.mycompany.property.management.modal.Customer;
import com.mycompany.property.management.service.BrokerService;
import com.mycompany.property.management.service.OwnerService;

public class PropertyManager {
    BrokerService brokerService;
    OwnerService ownerService;
    public PropertyManager() {
        brokerService = new BrokerService();
        ownerService = new OwnerService();
    }
    public void run() {
        Customer newCustomer = brokerService.getNewCustomer();
        ownerService.saveNewCustomer(newCustomer);
    }
}
