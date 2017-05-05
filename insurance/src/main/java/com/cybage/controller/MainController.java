package com.cybage.controller;

import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cybage.model.Customer;
import com.cybage.model.Insurance;
import com.cybage.services.CustomerService;
import com.cybage.services.InsuranceService;

@Controller
public class MainController {

private static final Logger logger = Logger.getLogger(MainController.class);

static int update_id;
static int insupdate_id;

@Autowired
CustomerService customerservice;

@Autowired
InsuranceService insuranceservice;

@InitBinder
public void initBinder(WebDataBinder webDataBinder) {
 SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
 dateFormat.setLenient(false);
 webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
 }

@RequestMapping(value="/", method=RequestMethod.GET)
public String index(Model model) 
{ 
   model.addAttribute("msg", "This is index page");
   return "index";
}

	@RequestMapping(value="/homepage")
public String list(Model model)
{   
	logger.info("in homepage... maincontroller");
	List<Insurance> allinsurance= insuranceservice.getInsurance();
	model.addAttribute("allinsurance", allinsurance);
	return "homepage";
}

@RequestMapping(value="/allcustomers")
public String showAllCustomers(Model model)
{ 
	logger.info("in showallCustomers...maincontroller");
	List<Customer> allcustomers= customerservice.getCustomer();
	model.addAttribute("allcustomers", allcustomers);
	return "allcustomers";
}

@RequestMapping(value="/add")
public String add(@ModelAttribute("SpringWeb")Customer customer)
{ 
	System.out.println("in add... maincontroller");
	return "addcustomer";
	
}

@RequestMapping(value="/addCustomer",method= RequestMethod.POST)
 public String addCustomer(@ModelAttribute("SpringWeb")Customer customer)
{  
    System.out.println("in main controller.. addCustomer");
	customerservice.addCustomer(customer);
	return "redirect:/allcustomers";
}

@RequestMapping(value="/edit/{id}")
public String editCustomer(ModelMap model,@PathVariable int id)
{  
	logger.debug("in main controller.. edit"+id);
	System.out.println("in main controller.. edit"+id);
	List customer= customerservice.searchCustomer(id);
	Customer cust= (Customer) customer.get(0);
	System.out.println(cust);
	update_id=id;
	model.addAttribute("customerId",update_id);
	model.addAttribute("name",cust.getName());
	model.addAttribute("address", cust.getAddress());
	model.addAttribute("phone", cust.getPhone());
	model.addAttribute("dob",cust.getDob());
	return "updatecustomer";
}

@RequestMapping(value="/updateCustomer",method=RequestMethod.POST)
public String updateCustomer(@ModelAttribute("SpringWeb")Customer customer)
{
	System.out.println("in maincontroller.. update customer");
	customerservice.updateCustomer(customer,update_id);
	return "redirect:/allcustomers";
}

@RequestMapping(value="/delete/{id}")
public String deleteCustomer(ModelMap model,@PathVariable int id)
{
  logger.info("in main controller...delete"+id);
  System.out.println("in main controller...delete"+id);
  customerservice.removeCustomer(id);
  return "redirect:/allcustomers";}

  /*
   * ----- Code for adding delete confirmation page---
   * List customer= customerservice.searchCustomer(id);
  Customer cust= (Customer) customer.get(0);
  System.out.println(cust);
  delete_id=id;
  model.addAttribute("customerId",delete_id);
  model.addAttribute("name",cust.getName());
  model.addAttribute("phone",cust.getPhone());		
	return "deletecustomer";
}

@RequestMapping(value="/deleteConfirm/{id}")
public String deleteConfirm(@ModelAttribute("SpringWeb")Customer customer)
{   
	System.out.println("in maincontroller.. deleteConfirm");
	customerservice.removeCustomer(delete_id);
	return "redirect:/allcustomers";
}*/

@RequestMapping("/allinsurance")
public String showAllInsurance(Model model)
{
	logger.info("in showallInsurance...maincontroller");
	List<Insurance> allinsurance= insuranceservice.getInsurance();
	model.addAttribute("allinsurance", allinsurance);
	return "allinsurance";	
}

@RequestMapping(value="/addnew")
public String addNew(@ModelAttribute("SpringWeb")Insurance insurance)
{ 
	System.out.println("in addnew... maincontroller");
	return "addinsurance";
	
}

@RequestMapping(value="/addInsurance",method= RequestMethod.POST)
 public String addInsurance(@ModelAttribute("SpringWeb")Insurance insurance)
{  
    System.out.println("in main controller.. addInsurance"+" "+insurance);
	insuranceservice.addInsurance(insurance);
	return "redirect:/allinsurance";
}

@RequestMapping(value="/editins/{id}")
public String editInsurance(ModelMap model,@PathVariable int id)
{  
	logger.debug("in main controller.. edit"+id);
	System.out.println("in main controller.. editins"+id);
	List insurance= insuranceservice.searchInsurance(id);
	Insurance ins= (Insurance) insurance.get(0);
	System.out.println(ins);
	insupdate_id=id;
	model.addAttribute("insuranceId",insupdate_id);
	model.addAttribute("insurancecode",ins.getInsurancecode());
	model.addAttribute("type", ins.getType());
	model.addAttribute("dateOfIssuance", ins.getDateofIssuance());
	model.addAttribute("dateOfRenewal",ins.getDateofRenewal());
	model.addAttribute("customer.customerId",ins.getCustomer().getCustomerId());
	return "updateinsurance";
}

@RequestMapping(value="/updateInsurance",method=RequestMethod.POST)
public String updateInsurance(@ModelAttribute("SpringWeb")Insurance insurance)
{
	System.out.println("in maincontroller.. update customer");
	insuranceservice.updateInsurance(insurance,insupdate_id);
	return "redirect:/allinsurance";
}

@RequestMapping(value="/deleteinsurance/{id}")
public String deleteInsurance(ModelMap model,@PathVariable int id)
{
  logger.info("in main controller...delete"+id);
  System.out.println("in main controller...delete"+id);
  insuranceservice.removeInsurance(id);;
  return "redirect:/allinsurance";}

@RequestMapping(value="/sortCustomerByName")
public String sortCustomerByName(ModelMap model)
{
  List<Customer> allcustomers= customerservice.getCustomer();
  Collections.sort(allcustomers, new com.cybage.dao.sortCustomerByName() );
  model.addAttribute("allcustomers",allcustomers);
	return "allcustomers";
}

@RequestMapping(value="/sortInsuranceByDateOfIssuance")
public String sortInsuranceByDateOfIssuance(ModelMap model)
{
 List<Insurance> allinsurance=insuranceservice.getInsurance();
 Collections.sort(allinsurance, new com.cybage.dao.sortInsuranceByDateOfIssuance());
 model.addAttribute("allinsurance",allinsurance);
  return "allinsurance";
}
@RequestMapping(value="/sortInsuranceByDateOfExpiry")
public String sortInsuranceByDateOfExpiry(ModelMap model)
{
 List<Insurance> allinsurance=insuranceservice.getInsurance();
 Collections.sort(allinsurance, new com.cybage.dao.sortInsuranceByDateOfExpiry());
 model.addAttribute("allinsurance",allinsurance);
  return "allinsurance";
}





}
