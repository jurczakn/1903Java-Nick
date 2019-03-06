package com.revature;

public class WebApp {

	private String header;
	
	private String[] forms;
	
	private int[] users;
	
	public String getHeader(){
		return this.header;
	}
	
	public void setHeader(String header){
		this.header = header;
	}
	
	public String[] getForms(){
		return this.forms;
	}
	
	public void setForms(String[] forms){
		this.forms = forms;
	}
	
	public int[] getUsers(){
		return this.users;
	}
	
	public void setUsers(int[] users){
		this.users = users;
	}
	
	
	
	@Override
	public String toString() {
		return "header: " + this.header + " # of Forms: " + forms.length + " # of users: " + users.length;
	}

	public WebApp(){
		this.header = "default";
		this.forms = new String[9];
		this.users = new int[100];
	}
	
}
