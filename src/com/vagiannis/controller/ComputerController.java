package com.vagiannis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vagiannis.dao.ComputerDAO;

import com.vagiannis.entity.Computer;


@Controller
@RequestMapping("/computers")
public class ComputerController {
	@Autowired
	private ComputerDAO computerDAO;
	
	@GetMapping("/list")
	public String listComputer(Model theModel) {
		
		//get Computers from the dao
		List<Computer>theComputers=computerDAO.getComputers();
		//add the Computers to theModel
		theModel.addAttribute("computers",theComputers);
		
		
		return "list-computers";
	}}
		
		
		

