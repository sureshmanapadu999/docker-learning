package com.satya.hateoasapp.reppo;

import java.util.ArrayList;

import java.util.List;

import com.satya.hateoasapp.bean.Project;
import com.satya.hateoasapp.bean.Resource;
import com.satya.hateoasapp.bean.Team;


public class TeamReppo {
   private static List<Team>  teams = new ArrayList<>();
   static{
	   
	   Project project1 = new Project(1, "bankApp", "SBI");
	   Project project2 = new Project(2, "insurance", "LIC");
	   Project project3 = new Project(3, "healthCare", "Appolo");
	   
	   List<Project> projects1 = new ArrayList<>();
	   projects1.add(project1);
	   projects1.add(project2);
	   projects1.add(project3);
	   
	   Resource resource1= new Resource(1, "subbu", "java", "lead", 5.6);
	   Resource resource2= new Resource(2, "azar", "php", "SSE", 4.6);
	   Resource resource3= new Resource(3, "nadeem", "oracle", "SSE", 5.0);
	   List<Resource> resources1 = new ArrayList<>();
	   resources1.add(resource1);
	   resources1.add(resource2);
	   resources1.add(resource3);
	   
	   Team team1 = new Team();
	   team1.setTid(1);
	   team1.setTeamName("thindarbirds");
	   team1.setProjects(projects1);
	   team1.setResources(resources1);
	   
	   Project project4 = new Project(1, "andriodApp", "Samsung");
	   Project project5 = new Project(2, "iosApp", "Apple");
	   Project project6 = new Project(3, "ubuntuApp", "ubun");
	   
	   List<Project> projects2 = new ArrayList<>();
	   projects2.add(project4);
	   projects2.add(project5);
	   projects2.add(project6);
	   
	   Resource resource4= new Resource(1, "raju", "java", "lead", 5.6);
	   Resource resource5= new Resource(2, "naresh", "php", "SSE", 4.6);
	   Resource resource6= new Resource(3, "suresh", "oracle", "SSE", 5.0);
	   List<Resource> resources2 = new ArrayList<>();
	   resources2.add(resource4);
	   resources2.add(resource5);
	   resources2.add(resource6);
	   
	   Team team2 = new Team();
	   team2.setTid(2);
	   team2.setTeamName("dragans");
	   team2.setProjects(projects2);
	   team2.setResources(resources2);
	  
	   teams.add(team1);
	   teams.add(team2);
   }
   public static List<Team> getAllTeams(){
	   return teams;
   }
   public static Team getATeam(int tId){
	   Team team = null;
	   for(Team t:teams){
		   if(tId == t.getTid()){
			   team  = t;
			   break;
		   }
	   }
	   return team;
   }
   public static List<Resource> getAllResources(int tId){
	   Team team = getATeam(tId);
	   return team.getResources();
   }
   public static List<Project> getAllProjects(int tId){
	   Team team = getATeam(tId);
	   return team.getProjects();
   }
   public static Resource getAResource(int tId,int rId){
	   Resource resource = null;
	   List<Resource> resources = getAllResources(tId);
	   for(Resource r:resources){
		   if(r.getrId()==rId){
			   resource = r;
			   break;
		   }
	   }
	   return resource;
   }
   public static Project getAProject(int tId,int pId){
	   Project project = null;
	   List<Project> Projects = getAllProjects(tId);
	   for(Project p:Projects){
		   if(p.getpId()==pId){
			   project = p;
			   break;
		   }
	   }
	   return project;
   }
}