package com.homework;

public class HumanBeings {
	private String otorhinolaryngology;
	private String internalOrgans;
	private String limb;

	public void eating() {
		System.out.println("people eat");
	}

	public void working() {
		System.out.println("people work");
	}

	public void sleeping() {
		System.out.println("people sleep");
	}

	public static void initHuman() {
		HumanBeings per = new HumanBeings();
		per.eating();
		per.working();
		per.sleeping();
	}
}
