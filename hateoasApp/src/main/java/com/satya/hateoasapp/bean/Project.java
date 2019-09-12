package com.satya.hateoasapp.bean;

public class Project {
	private int pId;
	private String pName;
	private String clientName;

	public Project(){
		
	}
	
    public Project(int pId,String pName, String clientName){
    	this.pId = pId;
    	this.pName = pName;
    	this.clientName = clientName;
    }
    
	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
}
