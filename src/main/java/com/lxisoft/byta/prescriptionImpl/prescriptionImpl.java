package com.lxisoft.byta.prescriptionImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.lxisoft.byta.model.PrescriptionTestStub;
import com.lxisoft.byta.prescriptionService.prescriptionService;
import com.lxisoft.byta.repository.PrescriptionRepo;

/**
 * This class is using for implementing Service
 * 
 * @author basil1
 * @version 1.0
 */
public class prescriptionImpl implements prescriptionService {
	@Autowired
	private PrescriptionRepo repo;

	@Override
	public PrescriptionTestStub save(PrescriptionTestStub p) {
		return repo.save(p);
	}

	@Override
	public List<PrescriptionTestStub> findAll() {
		return repo.findAll();
	}

}
