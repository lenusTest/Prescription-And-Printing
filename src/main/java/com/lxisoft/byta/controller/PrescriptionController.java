package com.lxisoft.byta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lxisoft.byta.model.PrescriptionTestStub;
import com.lxisoft.byta.prescriptionImpl.prescriptionImpl;

/**
 * This class is using for storing and retrieving data
 * 
 * @author basil1
 * @version 1.0.0
 */
@RestController
@RequestMapping("/prescription")
public class PrescriptionController {

	@Autowired
	private prescriptionImpl impl; // service instAnce

	@RequestMapping("/save")
	public PrescriptionTestStub save(PrescriptionTestStub p) {
		
		impl.save(p);
		return p;
	}

	@RequestMapping("/read")
	public List<PrescriptionTestStub> findall() {

		
		return impl.findAll();
	}

}
