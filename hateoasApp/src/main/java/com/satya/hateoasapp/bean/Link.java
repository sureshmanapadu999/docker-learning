package com.satya.hateoasapp.bean;

public class Link {
	private String href;
	private String rel;

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public String getRel() {
		return rel;
	}

	public void setRel(String rel) {
		this.rel = rel;
	}
	
	public static Link getLinke(String href,String rel){
		Link link = new Link();
		link.setHref(href);
		link.setRel(rel);
		return link;
	}

}