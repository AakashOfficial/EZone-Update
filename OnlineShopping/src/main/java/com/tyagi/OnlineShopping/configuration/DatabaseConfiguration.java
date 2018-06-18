package com.tyagi.OnlineShopping.configuration;

import java.util.Properties;
import javax.sql.DataSource;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan("com.tyagi.OnlineShopping")
@EnableTransactionManagement
public class DatabaseConfiguration {

	@Bean(name = "dataSource")
	public DataSource getH2DataSource() 
	{
		System.out.println("Starting of the method getH2DataSource");
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.h2.Driver");
		dataSource.setUrl("jdbc:h2:~/OnlineShopping");
		dataSource.setUsername("sa");
		dataSource.setPassword("@aakash");
		System.out.println("Data Source Creation");
		return dataSource;
	}

	
	@Autowired
	@Bean(name="sessionFactory")
	public SessionFactory getSessionFactory(DataSource dataSource)
	{
		System.out.println("---Hibernate Properties----");
		System.out.println("---Hibernate Properties Creation----");
		Properties prop=new Properties();
		prop.setProperty("hibernate.hbm2ddl.auto", "update");
		prop.put("hibernate.show_sql", "true"); //optional
		prop.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect");
		System.out.println("---Hibernate Properties Created");
		
		System.out.println("---Local SessionFactory Builder Object Creation---");
		LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(getH2DataSource());
		sessionBuilder.addProperties(prop);
		System.out.println("---Factory Builder Object Created---");
				
		System.out.println("Session Factory Object Creation");
		SessionFactory sessionFactory=sessionBuilder.buildSessionFactory();
		System.out.println("Session Factory Object Created");
		return sessionFactory;
	}

	@Autowired
	@Bean(name = "transactionManager")
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory) {
		System.out.println("--Transaction manager Object Creation--");
		HibernateTransactionManager transactionManager = new HibernateTransactionManager(sessionFactory);
		System.out.println("--Transaction manager Object Created--");
		return transactionManager;
	}

	

}