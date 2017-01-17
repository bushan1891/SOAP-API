package io.bush.soap;

public class InvalidInputException extends Exception {
	private String errorDetails ;
	
	public InvalidInputException(String reason,String errordetails){
		super(reason);
		this.errorDetails=errordetails;
		
	}
	
	public String getFaultInfo(){
		return errorDetails;
	}
	
}
