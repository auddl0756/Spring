package com.roon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.roon.mapper.Sample1Mapper;
import com.roon.mapper.Sample2Mapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Service
@Log4j

public class SampleTxServiceImpl implements SampleTxService{
	@Setter(onMethod_ = {@Autowired})
	private Sample1Mapper mapper1;
	
	@Setter(onMethod_ = {@Autowired})
	private Sample2Mapper mapper2;
	
   
	@Override
	@Transactional
	public void addData(String value) {
		log.info("mapper 1  ....");
		mapper1.insertCol1(value);
		
		log.info("mapper2 ....");
		mapper2.insertCol2(value);
		
		log.info("end .... ");
		
	}
	
	
//	@Override
//	public void getData() throws Exception {
////		mapper1.show();
//		log.info(mapper1.show());
//		
////		mapper2.show();
//		
//	}
}
