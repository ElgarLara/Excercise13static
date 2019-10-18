package com.ExcerciseOOPI.model;

public class Car 
{
	private String serialNumber;
	private int numberDoors;
	private boolean isCoupe=false;
	private String brand;
	
	public Car()
	{
		
	}
	public Car (String SerialNumer, int numberDoors)
	{
		this.serialNumber= serialNumber;
		this.numberDoors=numberDoors;
		
		
	}
	public String getSerialNumber() {
		return serialNumber;
		
	}
	public void setSerialNumber(String serialNumber)
	{
		this.serialNumber=serialNumber;
		
	}
	public int getNumberDoors()
	{
		return numberDoors;
		
	}
	public void setNumberDoors() {
		this.numberDoors=numberDoors;
		
	}
	public void CarIsCoupe(boolean isCoupe)
	{
		this.isCoupe=isCoupe;
		if(this.isCoupe)
		{
			this.numberDoors=2;
		}
	
		
	}
	public getBrand()
	{
		this.brand=brand;
	}
	
	public String ToString()
	{
		return "seria number;"+this.numberDoors
	}

}
