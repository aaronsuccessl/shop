package com.manager.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.manager.pojo.TbItem;

@RestController
public class DefaultController {

	@RequestMapping("")
	@ResponseBody
	public String index() {
		return "hello";
	}
}
