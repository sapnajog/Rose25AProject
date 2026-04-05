package com.collection;

public class EmployeeObjectHashmap {

 int id ;
 String name;
 float salary; 
 String dep;
 
 public EmployeeObjectHashmap(int id, String name, float salary, String dep) {
	this.id = id;
	this.name = name;
	this.salary= salary;
	this.dep = dep;
}
 public int getId() {
	return id;
 }
 public void setId(int id) {
	this.id = id;
 }
 public String getName() {
	return name;
 }
 public void setName(String name) {
	this.name = name;
 }
 public float getSalary() {
	return salary;
 }
 public void setSalary(float salary) {
	this.salary = salary;
 }
 public String getDep() {
	return dep;
 }
 public void setDep(String dep) {
	this.dep = dep;
 }
 @Override
 public String toString() {
	return id + ""+name +""+salary+""+dep;
	 
 }
 
}
