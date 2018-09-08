package com.Maven.Ref;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("myBean")
public class Vamshi {

	@Value("#{addressBean}")
	private Address address;

	@Value("#{addressBean.country}")
	private String country;

	@Value("#{addressBean.getFullAddress('Praveen')}")
	private String fullAddress;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFullAddress() {
		return fullAddress;
	}

	public void setFullAddress(String fullAddress) {
		this.fullAddress = fullAddress;
	}

	@Override
	public String toString() {
		return "Customer [Address=" + address +"\nFullAddress= " + fullAddress + "]";
	}

}