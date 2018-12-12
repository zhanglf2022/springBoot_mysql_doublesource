package com.zhanglf.cn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhanglf.cn.domain.AwsBo;
import com.zhanglf.cn.mapper.second.mapper.SecondAwsMapper;
import com.zhanglf.cn.service.ISecondAwsService;

@Service(ISecondAwsService.SERVICEID)
public class SecondAwsServiceImpl implements ISecondAwsService {

	@Autowired
	private SecondAwsMapper secondMapper;
	
	@Override
	public void insertOneToSecondAws(AwsBo ab) {
		secondMapper.insertAws(ab);
	}

}
