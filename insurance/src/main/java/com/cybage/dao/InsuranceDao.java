package com.cybage.dao;

import java.util.List;

import com.cybage.model.Customer;
import com.cybage.model.Insurance;

public interface InsuranceDao 
{
 List<Insurance> getInsurance();
 List<Insurance> searchInsurance(String code);
 List<Insurance> searchInsurance(int code);
 void addInsurance(Insurance insurance);
 void removeInsurance(int id);
 void updateInsurance(Insurance insurance,int id);
}
