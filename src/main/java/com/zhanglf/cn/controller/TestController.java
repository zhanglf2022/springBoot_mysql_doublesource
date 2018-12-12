package com.zhanglf.cn.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zhanglf.cn.domain.AwsBo;
import com.zhanglf.cn.service.IFirstAwsService;
import com.zhanglf.cn.service.ISecondAwsService;

@RestController
@RequestMapping("/test")
public class TestController {

	@Resource(name=IFirstAwsService.SERVICEID)
	private IFirstAwsService firstService;
	
	@Resource(name=ISecondAwsService.SERVICEID)
	private ISecondAwsService secondService;
	
	@RequestMapping("/show")
	public String showFirstAws(){
		String aws=firstService.getFirstAws(1).toString();
		return aws;
	}
	@RequestMapping("/insert")
	public String insertSecondAws(){
		AwsBo firstAws = firstService.getFirstAws(2);
		secondService.insertOneToSecondAws(firstAws);
		return "执行完毕！";
	}
}
