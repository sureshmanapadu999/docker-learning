package com.satya.hateoasapp.bean;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlTransient;

public class Team {
	private int tid;
	private String teamName;
	private List<Resource> resources = new ArrayList<>();
	private List<Project> projects = new ArrayList<>();
	private List<Link> links = new ArrayList<>();

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	@XmlTransient
	public List<Resource> getResources() {
		return resources;
	}

	public void setResources(List<Resource> resources) {
		this.resources = resources;
	}
	@XmlTransient
	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	public List<Link> getLinks() {
		return links;
	}

	public void setLinks(List<Link> links) {
		this.links = links;
	}

}
