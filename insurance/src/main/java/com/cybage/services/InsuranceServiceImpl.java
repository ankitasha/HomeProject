package com.cybage.services;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybage.dao.InsuranceDao;
import com.cybage.dao.InsuranceDaoImpl;
import com.cybage.model.Insurance;

@Service
@Transactional
public class InsuranceServiceImpl implements InsuranceService
{   
	@Autowired
    InsuranceDao insurancedao;
	
	@Override
	public List<Insurance> getInsurance() {
    System.out.println(insurancedao instanceof InsuranceDaoImpl);
		return insurancedao.getInsurance();
	}

	@Override
	public List<Insurance> searchInsurance(String code) {
		return insurancedao.searchInsurance(code);
	}

	@Override
	public void addInsurance(Insurance insurance) {
            insurancedao.addInsurance(insurance);		
	}

	@Override
	public void removeInsurance(int id) {
        insurancedao.removeInsurance(id);		
	}

	@Override
	public void updateInsurance(Insurance insurance, int id) {
          insurancedao.updateInsurance(insurance, id);		
	}

	@Override
	public List<Insurance> searchInsurance(int id) {
		return insurancedao.searchInsurance(id);
	}
	
}
