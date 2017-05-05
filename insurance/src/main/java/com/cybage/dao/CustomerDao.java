package com.cybage.dao;

import java.util.Date;
import java.util.List;

import com.cybage.model.Customer;

public interface CustomerDao 
{
List<Customer> getCustomer();
List searchCustomer(String name);
List searchCustomer(int id);
void addCustomer(Customer customer);
void removeCustomer(int del_id);
void updateCustomer(Customer customer,int id);


}
