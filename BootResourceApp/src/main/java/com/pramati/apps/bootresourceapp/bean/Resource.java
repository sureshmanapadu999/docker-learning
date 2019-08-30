package com.pramati.apps.bootresourceapp.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Resource {
	@Id
	private int rId;
	private String rName;
	private String rRole;
	private String rSkillSet;
	private double rSalary;

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

	public String getrRole() {
		return rRole;
	}

	public void setrRole(String rRole) {
		this.rRole = rRole;
	}

	public String getrSkillSet() {
		return rSkillSet;
	}

	public void setrSkillSet(String rSkillSet) {
		this.rSkillSet = rSkillSet;
	}

	public double getrSalary() {
		return rSalary;
	}

	public void setrSalary(double rSalary) {
		this.rSalary = rSalary;
	}
	public String toString(){
		return "rId:"+rId+",rName:"+rName+",rRole:"+rRole+",rSkillSet:"+rSkillSet+",rSalary:"+rSalary;
	}
	

}