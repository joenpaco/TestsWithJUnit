package com.joenpaco.miw.junit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Point {

	private static Logger logger = LogManager.getLogger();
	
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point(int xy) {
		this(xy, xy);
	}
	
	public Point() {
		this(0, 0);
	}
	
	public double module() {
		logger.info("Se calcula la distancia entre dos puntos");
		return Math.sqrt((x*x) + (y*y));
	}
	
	public double phase() {
		return Math.atan((double) y / x);
	}
	
	public void translateOrigin(Point origin) {
		x -= origin.getX();
		y -= origin.getY();
		logger.info("Se traslada un punto de un lugar a otro");
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
	
	
}
