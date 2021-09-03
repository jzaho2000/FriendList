package com.aho.FriendList.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.aho.FriendList.model.Friend;

@Controller
public class FriendListController{
	
	private ArrayList<Friend> friendList = new ArrayList<Friend>();

	@RequestMapping(value="/index", method=RequestMethod.GET)
	public void indexForm(
			@RequestParam(name="friend", defaultValue="")String friendName,
			Model model) {
		
		if (friendName != null && friendName.compareTo("") != 0) {
			friendList.add(new Friend(friendName));
		}
		
		
		
		model.addAttribute("friends",this.friendList);
		
	}
	
}
