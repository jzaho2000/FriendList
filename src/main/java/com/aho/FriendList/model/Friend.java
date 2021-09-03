package com.aho.FriendList.model;

import org.springframework.lang.NonNull;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.constraints.Min;

public class Friend {

	//@NonNull
	@NotNull
	@Size(min=2, max=30)
	private String name;
	
	// possible to add later...
	// private int id;
	// private String phonnumber;
	// private String StreetAddress
	// ...
	 
	
	public Friend() {
		this.name = "";
	}
	
	public Friend(String name) {
		this.name = name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
}
