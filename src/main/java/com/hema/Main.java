package com.hema;

import model.Customer;
import model.Item;
import service.CustomerService;
import service.ItemService;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        CustomerService customerService = new CustomerService();
        customerService.save();
        List<Customer> customerlist = customerService.getALlCustomers();
        customerService.updateCustomer();
        ItemService itemService = new ItemService();
        itemService.save();
        itemService.updateItem();
    }
}