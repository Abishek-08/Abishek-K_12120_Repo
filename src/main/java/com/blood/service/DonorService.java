package com.blood.service;

import java.util.List;

import com.blood.modal.BloodDonor;

public interface DonorService {
	
	public boolean insertDonor(BloodDonor donor);
	public boolean updateDonor(BloodDonor donor);
	public boolean deleteDonor(int id);
	public BloodDonor findDonorById(int id);
	public List<BloodDonor> findAllDonor();

}
