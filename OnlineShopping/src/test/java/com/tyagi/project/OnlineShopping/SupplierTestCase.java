package com.tyagi.project.OnlineShopping;

import java.util.List;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tyagi.project.OnlineShopping.dao.SupplierDAO;
import com.tyagi.project.OnlineShopping.model.Supplier;

import javax.naming.Context;

public class SupplierTestCase {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.tyagi.project.OnlineShopping");
		context.refresh();

		SupplierDAO supplierDAO = (SupplierDAO) context.getBean("supplierDAO");

		Supplier supplier = new Supplier();

		supplier.setSuppname("Aman");
		supplier.setSuppaddress("Ghaziabad");

		supplierDAO.insertUpdateSupplier(supplier);
		System.out.println("Supplier Inserted");

		// Retrieval TestCase
		/*
		 * Supplier supplier=supplierDAO.getSupplier(2);
		 * System.out.println("Supplier Name:"+supplier.getSuppname());
		 * System.out.println("Supplier Description:"+supplier.getSuppaddress());
		 */

		// Deletion TestCase
		/*
		 * Supplier supplier=supplierDAO.getSupplier(2);
		 * supplierDAO.deleteSupplier(supplier);
		 * System.out.println("The Supplier Deleted");
		 */

		// Retrieving the Data

		/*
		 * List<Supplier> list=supplierDAO.getSupplierDetails();
		 * 
		 * for(Supplier supplier1:list) {
		 * System.out.println(supplier1.getSuppid()+":"+supplier1.getSuppname()+":"+
		 * supplier1.getSuppaddress()); }
		 */

		// Update the Supplier
		/*
		 * Supplier supplier=supplierDAO.getSupplier(1); supplier.setSuppname("X");
		 * supplierDAO.insertUpdateSupplier(supplier);
		 * System.out.println("The Supplier Updated");
		 */

	}

}
