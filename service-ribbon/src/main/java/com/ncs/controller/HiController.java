package com.ncs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ncs.service.HiService;

@RestController
public class HiController {
	@Autowired
	private HiService hiService;
	
	@RequestMapping("/hi")
	public String hi(@RequestParam String name){
		return hiService.hiService(name);
	}
}
