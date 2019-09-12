package com.satya.hateoasapp.srvc;

import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import com.satya.hateoasapp.bean.Link;
import com.satya.hateoasapp.bean.Team;
import com.satya.hateoasapp.reppo.TeamReppo;

@Path("/teams")
public class TeamSrvc {
	@GET
	
	public List<Team> getAllTeam(@Context UriInfo uriInfo){
		List<Team> teams = TeamReppo.getAllTeams();
		for(Team team:teams){
			List<Link> links = team.getLinks();
			if(links.size()>0){
				links = new ArrayList<>();
				team.setLinks(links);
			}
			String href = uriInfo.getAbsolutePath().toString()+team.getTid();
			links.add(Link.getLinke(href, "self"));
			href = uriInfo.getAbsolutePathBuilder().path(team.getTid()+"/resources").build().toString();
			links.add(Link.getLinke(href, "resources"));
			href = uriInfo.getAbsolutePathBuilder().path(team.getTid()+"/projects").build().toString();
			links.add(Link.getLinke(href, "projects"));
			
			team.setLinks(links);	
		}
		return teams;
	}

		
	@GET
	@Path("/{teamId}")
	public Team getATeam(@PathParam("teamId") int tId,@Context UriInfo uriInfo){
		//data getting from DB
		Team team = TeamReppo.getATeam(tId);
		//team.setProjects(projects);
		//team.setResources(resources);
		
		List<Link> links = team.getLinks();
		if(links.size()>0){
			links = new ArrayList<>();
			team.setLinks(links);
		}
		String href = uriInfo.getAbsolutePath().toString();
		links.add(Link.getLinke(href, "self"));
		href = uriInfo.getAbsolutePathBuilder().path("/resources").build().toString();
		links.add(Link.getLinke(href, "resources"));
		href = uriInfo.getAbsolutePathBuilder().path("/projects").build().toString();
		links.add(Link.getLinke(href, "projects"));
		
		team.setLinks(links);
		return team;
		
	}
	
	@Path("/{teamId}/resources")
	public ResourceSrvc getRresourceSrvc(){
		return new ResourceSrvc();
	}

	@Path("/{teamId}/projects")
	public ProjectSrvc getProjectSrvc(){
		return new ProjectSrvc();
	}
	//createTeam
	//getAllTeams
	//updateATeam
	//deleteATeam
}