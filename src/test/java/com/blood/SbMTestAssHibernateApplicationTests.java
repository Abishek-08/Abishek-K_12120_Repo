package com.blood;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.blood.modal.BloodDonor;
import com.blood.modal.BloodStock;
import com.blood.service.DonorService;
import com.blood.service.StockService;

@SpringBootTest
class SbMTestAssHibernateApplicationTests {

	@Autowired
	DonorService dnrServ;
	
	@Autowired
	StockService stkServ;
	
	     @Test
		//@Ignore
		void test_InsertStock() {
			BloodDonor donor = new BloodDonor();
			donor.setDnrId(5);
			
			BloodStock stock = new BloodStock();
			stock.setBlCount("190");
			stock.setBlGroup("B+ve");
			stock.setBlRBC("789mgh");
			stock.setBlWBC("354mgh");
			stock.setDonor(donor);
			
			boolean result = stkServ.addStock(stock);
			assertEquals(true, result);
			
		}
		
		@Test
		//@Ignore
		void test_UpdateStock() {
			BloodDonor donor = new BloodDonor();
			donor.setDnrId(10);
			
			BloodStock stock = new BloodStock();
			stock.setBlId(5);
			stock.setBlCount("789");
			stock.setBlGroup("A-ve");
			stock.setBlRBC("467mgh");
			stock.setBlWBC("231mgh");
			stock.setDonor(donor);
			
			boolean result = stkServ.updateStock(stock);
			assertEquals(true, result);
			
		}
		
		//@Test
		@Ignore
		void test_DeleteStock() {
			
			
			boolean result = stkServ.deleteStock(2);
			assertEquals(true, result);
			
		}
		
		@Test
		//@Ignore
		void test_FindAllStock() {
			
			
			List<BloodStock> result = stkServ.findAllStock();
			assertNotNull(result);
			
		}
		
		@Test
		//@Ignore
		public void test_InsertDonor() {
			BloodDonor donor = new BloodDonor();
			donor.setDnrName("vijay");
			donor.setDnrAge("56");
			donor.setDnrMob("963789451");
			donor.setDnrWeight("75kg");
			donor.setDnrLocation("chennai");
			
			boolean result = dnrServ.insertDonor(donor);
			assertEquals(true, result);
		}
		
		@Test
		//@Ignore
		public void test_UpdateDonor() {
			BloodDonor donor = new BloodDonor();
			donor.setDnrId(10);
			donor.setDnrName("vijay");
			donor.setDnrAge("45");
			donor.setDnrMob("9787531956");
			donor.setDnrWeight("50kg");
			donor.setDnrLocation("Bangalore");
			
			boolean result = dnrServ.updateDonor(donor);
			assertEquals(true, result);
		}
		
		//@Test
		@Ignore
		public void test_DeleteDonor() {
			boolean result = dnrServ.deleteDonor(1);
			assertEquals(true, result);
		}
		
		@Test
		//@Ignore
		public void test_FindAllDonor() {
			List<BloodDonor> result = dnrServ.findAllDonor();
			assertNotNull(result);
			}

}
