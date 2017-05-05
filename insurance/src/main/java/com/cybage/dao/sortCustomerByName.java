package com.cybage.dao;

import java.util.Comparator;

import com.cybage.model.Customer;

public class sortCustomerByName implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
       Customer cust1= (Customer) o1;
       Customer cust2= (Customer) o2;
       return cust1.getName().compareToIgnoreCase(cust2.getName());
			}

}
