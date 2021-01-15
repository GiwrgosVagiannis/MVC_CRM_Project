package com.vagiannis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.vagiannis.dao.PhoneCenterDAO;
import com.vagiannis.entity.PhoneCenter;

@Controller
@RequestMapping("/phonecenter")
public class PhoneCenterController {
	@Autowired
	private PhoneCenterDAO phoneCenterDAO;
	
	@GetMapping("/list")
	public String listPhoneCenter(Model theModel) {
		
		//get Phones from the dao
		List<PhoneCenter>thePhones=phoneCenterDAO.getPhones();
		//add the P to theModel
		theModel.addAttribute("phones",thePhones);
		
		
		return "list-phones";
	}}
	

