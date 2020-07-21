package org.dxc.shopping;
import java.util.Scanner;
import org.dxc.shopping.exception.ProductException;
import org.dxc.shopping.model.Product;
import org.dxc.shopping.service.CartOperationService;
import org.dxc.shopping.service.CartOperationServiceImpl;


public class ShoppingCart 
{
    public static void main( String[] args )throws ProductException{
    	Product p1=new Product("Keyboard",400,2);
		Product p2=new Product("Pendrive",300,2);
		Product p3=new Product("Camera",3000,1);
		// Upcasting or Dynamic Method Dispatch
		CartOperationService cartService=new CartOperationServiceImpl(10); // loosly couplying
	
		cartService.removeFromCart(p3);
		
		cartService.addToCart(p1);//return 880.0
		cartService.addToCart(p2); //return 660.0
		cartService.addToCart(p3); //return 3300.0
		System.out.println(cartService.getInvoiceAmount());// return 4840.0
		
		cartService.removeFromCart(p1);
		System.out.println(cartService.getInvoiceAmount());// return 3960.0
		System.out.println(cartService); // print Pendrive Camera
		
		int size=cartService.getProductContainerSize();
		
		System.out.println(size);
		
		

	}

}

    	