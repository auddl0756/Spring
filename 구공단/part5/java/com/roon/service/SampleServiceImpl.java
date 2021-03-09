package com.roon.service;

import org.springframework.stereotype.Service;

@Service
public class SampleServiceImpl implements SampleService {
	@Override
	public Integer doAdd(String s1, String s2) throws Exception {
		return Integer.parseInt(s1)+Integer.parseInt(s2);
	}
	
}
