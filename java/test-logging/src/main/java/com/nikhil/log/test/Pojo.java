package com.nikhil.log.test;

public class Pojo {
	
	private String property1;
	
	private String property2;
	
	private String property3;
	
	private String property4;
	
	private AnotherPojo anotherPojo;

	public String getProperty1() {
		return property1;
	}

	public void setProperty1(String property1) {
		this.property1 = property1;
	}

	public String getProperty2() {
		return property2;
	}

	public void setProperty2(String property2) {
		this.property2 = property2;
	}

	public String getProperty3() {
		return property3;
	}

	public void setProperty3(String property3) {
		this.property3 = property3;
	}

	public String getProperty4() {
		return property4;
	}

	public void setProperty4(String property4) {
		this.property4 = property4;
	}

	public AnotherPojo getAnotherPojo() {
		return anotherPojo;
	}

	public void setAnotherPojo(AnotherPojo anotherPojo) {
		this.anotherPojo = anotherPojo;
	}

	@Override
	public String toString() {
		return "Pojo [property1=" + property1 + ", property2=" + property2 + ", property3=" + property3 + ", property4="
				+ property4 + ", anotherPojo=" + anotherPojo + "]";
	}

	
}