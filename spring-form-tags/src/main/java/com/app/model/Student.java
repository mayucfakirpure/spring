package com.app.model;

import java.util.HashMap;
import java.util.Map;

public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	private Map<String,String> countryOptions;
	private String favoriteLanguage;
	private String[] operatingSystems;
	
	public Student()
	{
		countryOptions = new HashMap();
		countryOptions.put("IN", "India");
		countryOptions.put("DE", "Germany");
		countryOptions.put("BR", "Brazil");
		countryOptions.put("FR", "FRANCE");
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Map<String, String> getCountryOptions() {
		return countryOptions;
	}

	public void setCountryOptions(Map<String, String> countryOptions) {
		this.countryOptions = countryOptions;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	
	
	

}
