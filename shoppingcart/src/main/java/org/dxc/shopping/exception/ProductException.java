package org.dxc.shopping.exception;

public class ProductException extends Exception {
	private String productName;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	public ProductException() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ProductException(String productName) {
		super();
		this.productName = productName;
	}


	@Override
	public String toString() {
		return productName+" Product is not available";
	}
	


}
