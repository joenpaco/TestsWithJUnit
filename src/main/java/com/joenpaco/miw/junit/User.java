package com.joenpaco.miw.junit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class User {
	
	private static Logger logger = LogManager.getLogger();

	private int number;
	
	private String name;
	
	private String familyName;
	
	public User(int number, String name, String familyName) {
		this.number = number;
		this.name = this.format(name);
		this.familyName = this.format(familyName);
	}
	
	private String format(String string) {
		string = string.trim();
		return string.substring(0,  1).toUpperCase() + string.substring(1).toLowerCase();
	}
	
	public String fullName() {
		logger.info("Se concatenan el nombre y el apellido");
		return name + " " + familyName;
	}
	
	public String initials() {
		logger.info("Se obtiene la inicial del nombre concatenada con un punto");
		return name.substring(0, 1) + ".";
	}

	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public String getFamilyName() {
		return familyName;
	}

	@Override
	public String toString() {
		return "User [number=" + number + ", name=" + name + ", familyName=" + familyName + "]";
	}
	
	
}
