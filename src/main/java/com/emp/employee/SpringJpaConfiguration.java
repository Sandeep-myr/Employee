package com.emp.employee;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@EnableJpaRepositories("com.emp.*")
public class SpringJpaConfiguration {

	@Bean
	DataSource getDataSource() {
		DriverManagerDataSource dbms = new DriverManagerDataSource();
		dbms.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		dbms.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dbms.setUsername("spring");
		dbms.setPassword("spring100");
		return dbms;
		
	}
	
	@Bean("entityManagerFactory")
	LocalContainerEntityManagerFactoryBean createEntityManagerFactory() {
		LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
		factory.setDataSource(getDataSource());
		factory.setPackagesToScan("com.emp.*");
		factory.setJpaProperties(hibernateProperties());
		HibernateJpaVendorAdapter vendor = new HibernateJpaVendorAdapter();
		factory.setJpaVendorAdapter(vendor);
		return factory;
	}
	
	Properties hibernateProperties() {
		Properties prop = new Properties();
		prop.setProperty("hibernate.hbm2ddl.auto", "update");
		prop.setProperty("hibernate.show_sql", "true");
		return prop;
	}
	
	
	@Bean("transactionManager")
	public PlatformTransactionManager getTransactionManager() {
		 
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(createEntityManagerFactory().getObject());
		return transactionManager;
		
	}
	
	
	
}
