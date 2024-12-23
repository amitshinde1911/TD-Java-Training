package com.amit.spring.springcore.properties;

import java.util.Properties;

public class CountriesAndlanguages {

	private Properties countryAndLangs;

	public Properties getCountryAndLangs() {
		return countryAndLangs;
	}

	public void setCountryAndLangs(Properties countryAndLangs) {
		this.countryAndLangs = countryAndLangs;
	}

	@Override
	public String toString() {
		return "CountriesAndlanguages [countryAndLangs=" + countryAndLangs + "]";
	}

}
