package com.cybage.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cybage.model.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao
{  
	@Autowired
	SessionFactory sf;

	@Override
	public List<Customer> getCustomer() {
     System.out.println("Autowired worked");
     @SuppressWarnings("unchecked")
	List<Customer> allCustomers= sf.getCurrentSession().createQuery("from Customer")
    		                       .list();
		return allCustomers;
	}

	@Override
	public List searchCustomer(String name) {
		return sf.getCurrentSession().createQuery("from Customer where name="+name).list();
	}

	@Override
	public void addCustomer(Customer customer) {
		/*Customer customer= new Customer();
		customer.setName(name);
		customer.setAddress(address);
		customer.setDob(dob);
		customer.setPhone(phone);*/
         sf.getCurrentSession().save(customer);	
	}

	@Override
	public void removeCustomer(int del_id) {
	 Customer customer= new Customer();
	 customer.setCustomerId(del_id);
	 sf.getCurrentSession().delete(customer);
	}

	@Override
	public void updateCustomer(Customer customer, int id) {
		customer.setCustomerId(id);
		sf.getCurrentSession().update(customer);
	}

	@Override
	public List searchCustomer(int id) {
		return sf.getCurrentSession().createQuery("from Customer where customerId="+id).list();

	}

}
