package com.zhanglf.cn.service;

import com.zhanglf.cn.domain.AwsBo;

public interface IFirstAwsService {
	final String SERVICEID="firstAwsService";
	//获取一个实体
	public AwsBo getFirstAws(int id);
}
