package com.Maven.common;

public class Hello
{
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void printHello() {
		System.out.println("First Project in " + name);
	}
}