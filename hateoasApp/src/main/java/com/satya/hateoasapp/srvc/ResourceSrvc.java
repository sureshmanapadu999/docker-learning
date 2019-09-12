package com.satya.hateoasapp.srvc;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import com.satya.hateoasapp.bean.Resource;
import com.satya.hateoasapp.reppo.TeamReppo;

public class ResourceSrvc {
	@GET
	public List<Resource> getAllResources(@PathParam("teamId") int tId) {
      return TeamReppo.getAllResources(tId);
	}
	
	@GET
	@Path("/{rId}")
	public Resource getAResource(@PathParam("teamId") int tId,@PathParam("rId")int rId) {
      return TeamReppo.getAResource(tId,rId);
	}
}