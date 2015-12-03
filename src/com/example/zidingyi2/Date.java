package com.example.zidingyi2;

public class Date {
 private String name;
 private Boolean check;
 
public Date(String name, Boolean check) {
	super();
	this.name = name;
	this.check = check;
}
public Date() {
	// TODO Auto-generated constructor stub
}
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Boolean getCheck() {
	return check;
}

public void setCheck(Boolean check) {
	this.check = check;
}

@Override
public String toString() {
	return "Date [name=" + name + ", check=" + check + "]";
}
 
}
