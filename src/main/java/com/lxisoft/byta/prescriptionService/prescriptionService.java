package com.lxisoft.byta.prescriptionService;

import java.util.List;

import com.lxisoft.byta.model.PrescriptionTestStub;

/**
 * This class is using for Service
 * 
 * @author basil1
 * @version 1.0
 */
public interface prescriptionService{

	public PrescriptionTestStub save(PrescriptionTestStub p);

	public List<PrescriptionTestStub> findAll();
}
