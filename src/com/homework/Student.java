package com.homework;

public class Student {
	private Integer number;
	private String name;
	private double mathGard;
	private double laugugeGard;
	private double exlaugugeGard;

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMathGard() {
		return mathGard;
	}

	public void setMathGard(double mathGard) {
		this.mathGard = mathGard;
	}

	public double getLaugugeGard() {
		return laugugeGard;
	}

	public void setLaugugeGard(double laugugeGard) {
		this.laugugeGard = laugugeGard;
	}

	public double getExlaugugeGard() {
		return exlaugugeGard;
	}

	public void setExlaugugeGard(double exlaugugeGard) {
		this.exlaugugeGard = exlaugugeGard;
	}
	
	public Boolean isPass() {
		if(this.getLaugugeGard()>60&&this.getExlaugugeGard()>60&&this.getMathGard()>60&&this.getExlaugugeGard()+this.getLaugugeGard()+this.getMathGard()>200)
			return true;
		else 
			return false;
	}
	public void initStudent() {
		this.setExlaugugeGard(121);
		this.setLaugugeGard(73);
		this.setMathGard(109);
	}
}
