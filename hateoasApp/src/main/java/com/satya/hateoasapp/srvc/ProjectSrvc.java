package com.satya.hateoasapp.srvc;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import com.satya.hateoasapp.bean.Project;
import com.satya.hateoasapp.reppo.TeamReppo;

public class ProjectSrvc {
	
	@GET
	public List<Project> getAllProjects(@PathParam("teamId") int tId) {
      return TeamReppo.getAllProjects(tId);
	}
	@GET
	@Path("/{pId}")
	public Project getProject(@PathParam("teamId") int tId,@PathParam("pId")int pid) {
      return TeamReppo.getAProject(tId,pid);
	}
}