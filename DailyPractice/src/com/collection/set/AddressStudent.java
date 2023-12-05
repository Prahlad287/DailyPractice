package com.collection.set;

public class AddressStudent {
	String City;
	String State;
	
	public AddressStudent(String city, String state) {
		
		this.City = city;
		this.State = state;
	}

	@Override
	public String toString() {
		return " [City=" + City + ", State=" + State + "]";
	}

}
