package com.blood.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.blood.dao.StockDao;
import com.blood.modal.BloodStock;

@Service
@Transactional
public class StockServiceImpl implements StockService {
	
	@Autowired
	StockDao dao;
	
	@Override
	public boolean addStock(BloodStock stock) {
		dao.addStock(stock);
		return true;
		
	}
	
	@Override
	public boolean updateStock(BloodStock stock) {
		dao.updateStock(stock);
		return true;
	}
	
	@Override
	public boolean deleteStock(int id) {
		dao.deleteStock(id);
		return true;
		
	}
	
	@Override
	public List<BloodStock> findByStockName(String blGrp) {
		return dao.findByStockName(blGrp);
	}
	
	@Override
	public List<BloodStock> findAllStock() {
		
		return dao.listAllStock();
	}
	
	

}
