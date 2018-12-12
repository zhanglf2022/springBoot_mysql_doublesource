package com.zhanglf.cn.service;

import com.zhanglf.cn.domain.AwsBo;

public interface ISecondAwsService {
	final String SERVICEID="secondAwsService";
	public void insertOneToSecondAws(AwsBo ab);
}
