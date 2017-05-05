package com.cybage.dao;

import java.util.Comparator;

import com.cybage.model.Insurance;

public class sortInsuranceByDateOfIssuance implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) 
	{
	  Insurance ins1=(Insurance)o1;
	  Insurance ins2=(Insurance) o2;
	  
		return ins1.getDateofIssuance().compareTo(ins2.getDateofIssuance());
	}

}
