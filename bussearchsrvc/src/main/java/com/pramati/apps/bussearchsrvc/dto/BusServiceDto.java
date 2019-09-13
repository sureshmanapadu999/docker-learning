package com.pramati.apps.bussearchsrvc.dto;

import java.sql.Time;

public class BusServiceDto {
	private int srvnum;
	private String srvcname;
	private String startstation;
	private String endstation;
	private Time deptime;
	private String stype;

	public int getSrvnum() {
		return srvnum;
	}

	public void setSrvnum(int srvnum) {
		this.srvnum = srvnum;
	}

	public String getSrvcname() {
		return srvcname;
	}

	public void setSrvcname(String srvcname) {
		this.srvcname = srvcname;
	}

	public String getStartstation() {
		return startstation;
	}

	public void setStartstation(String startstation) {
		this.startstation = startstation;
	}

	public String getEndstation() {
		return endstation;
	}

	public void setEndstation(String endstation) {
		this.endstation = endstation;
	}

	public Time getDeptime() {
		return deptime;
	}

	public void setDeptime(Time deptime) {
		this.deptime = deptime;
	}

	public String getStype() {
		return stype;
	}

	public void setStype(String stype) {
		this.stype = stype;
	}

}
