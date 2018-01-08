package com.joenpaco.miw.junit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Fraction {
	
	private static Logger logger = LogManager.getLogger();
	
	private int numerator;
	
	private int denominator;
	
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public Fraction() {
		this(1, 1);
	}
	
	public double decimal() {
		logger.info("Se devuelve la division entre dos numeros");
		return (double) numerator / denominator;
	}

	public int getNumerator() {
		return numerator;
	}

	public int getDenominator() {
		return denominator;
	}

}
