package com.customer.management;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.customer.management.service.impl.CustomerServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws NumberFormatException, IOException
    {
        System.out.println( "---WELCOME TO MY APPLICATION---" );
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        int choice = 0;
        do {
        	System.out.println("ENTER 1 TO ADD CUSTOMER");
        	System.out.println("ENTER 2 TO DISPLAY CUSTOMER BY ID");
        	System.out.println("ENTER 3 EXIT");
        	choice = Integer.parseInt(br.readLine());
        	switch (choice) {
        	case 1:
        		System.out.println("ENTER ID");
        		int id = Integer.parseInt(br.readLine());
        		System.out.println("ENTER NAME");
        		String name = br.readLine();
        		System.out.println("ENTER ADDRESS");
        		String address = br.readLine();
        		customerService.insertCustomer(id, name, address);
        		break;
        	case 2:
        		System.out.println("ENTER ID");
        		int cus_id = Integer.parseInt(br.readLine());
        		customerService.getCustomer(cus_id);
        		break;
        	case 3:
        		System.out.println("YOU CHOOSED TO EXIT");
        		break;
        	default:
        		System.out.println("WRONG CHOICE TRY AGAIN LETTER");
        		break;
        	}
        }while(choice !=3);
        System.out.println("EXITING...");
    }
}
