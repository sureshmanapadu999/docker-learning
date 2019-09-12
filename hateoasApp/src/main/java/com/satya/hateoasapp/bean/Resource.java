package com.satya.hateoasapp.bean;

public class Resource {
	private int rId;
	private String rName;
	private String rSkillSet;
	private String rRole;
	private double rPackage;

	public Resource(){
		
	}
	public Resource(int rId,String rName, String rSkillSet, String rRole, double rPackage){
		this.rId = rId;
		this.rName = rName;
		this.rSkillSet = rSkillSet;
		this.rRole = rRole;
		this.rPackage = rPackage;
		
	}
	public int getrId() {
		return rId;
	}

	public void setrId(int rId) {
		this.rId = rId;
	}

	public String getrName() {
		return rName;
	}

	public void setrName(String rName) {
		this.rName = rName;
	}

	public String getrSkillSet() {
		return rSkillSet;
	}

	public void setrSkillSet(String rSkillSet) {
		this.rSkillSet = rSkillSet;
	}

	public String getrRole() {
		return rRole;
	}

	public void setrRole(String rRole) {
		this.rRole = rRole;
	}

	public double getrPackage() {
		return rPackage;
	}

	public void setrPackage(double rPackage) {
		this.rPackage = rPackage;
	}
}