package entities;

import entities.enums.Color;

public class Rectangle extends Shape{

	private Double width;
	private Double height;
	
	public Rectangle() {
		super();
	}
	
	public Rectangle(Color color, Double width, Double heigt) {
		super(color);
		this.width = width;
		this.height = heigt;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeigt() {
		return height;
	}

	public void setHeigt(Double heigt) {
		this.height = heigt;
	}

	@Override
	public double area() {
		return width * height;
	}
	
}
