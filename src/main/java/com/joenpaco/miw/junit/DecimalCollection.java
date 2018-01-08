package com.joenpaco.miw.junit;

import java.util.ArrayList;
import java.util.List;

public class DecimalCollection {

	private List<Double> collection;
	
	public DecimalCollection() {
		collection = new ArrayList<Double>();
	}
	
	public void add(double value) {
		collection.add(value);
	}
	
	public int size() {
		return collection.size();
	}
	
	public double sum() {
		double sum = 0;
		for (double item : collection) {
			sum += item;
		}
		return sum;
	}
	
	public double higher() {
		double higher = Double.NEGATIVE_INFINITY;
		for (double item : collection) {
			if(item > higher) {
				higher = item;
			}
		}
		return higher;
	}
}
