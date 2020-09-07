package com.luv2code.aopdemo;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;
import com.luv2code.aopdemo.dao.MembershipDAO;

public class AfterReturningDemoApp {

	public static void main(String[] args) {
		// read the java config class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(DemoConfig.class);
		
		//get the bean from spring container
		AccountDAO theAccountDAO = context.getBean("accountDAO",AccountDAO.class);
		
		//call the findAccounts()
		List<Account> theAccounts = theAccountDAO.findAccounts();
		
		//display the list of accounts
		System.out.println("\n\nMain Program : AfterReturningDemoApp");
		System.out.println("------------------------------");
		System.out.println(theAccounts);
		
		//close the context
		context.close();

	}

}
