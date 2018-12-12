package com.zhanglf.cn.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhanglf.cn.domain.AwsBo;
import com.zhanglf.cn.mapper.first.mapper.FirstAwsMapper;
import com.zhanglf.cn.service.IFirstAwsService;

@Service(IFirstAwsService.SERVICEID)
public class FirstAwsServiceImpl implements IFirstAwsService {

	@Autowired
	private FirstAwsMapper firstMapper;
	
	@Override
	public AwsBo getFirstAws(int id) {
		return firstMapper.getAwsById(id);
	}

}
