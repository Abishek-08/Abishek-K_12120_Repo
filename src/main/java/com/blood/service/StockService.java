package com.blood.service;

import java.util.List;

import com.blood.modal.BloodStock;

public interface StockService {
	
	public boolean addStock(BloodStock stock);
	public boolean updateStock(BloodStock stock);
	public boolean deleteStock(int id);
	public List<BloodStock> findByStockName(String blGrp);
	public List<BloodStock> findAllStock();

}
