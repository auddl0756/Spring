package com.roon.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.roon.domain.BoardVO;
import com.roon.domain.Criteria;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {com.roon.config.RootConfig.class})
@Log4j
public class BoardServiceTests {
	@Setter(onMethod_ = {@Autowired})
	private BoardService service;
	
//	@Test
//	public void testExist() {
//		log.info(service);
//		assertNotNull(service);
//	}
	
//	@Test
//	public void testRegister() {
//		BoardVO board = new BoardVO();
//		board.setTitle("new post");
//		board.setContent("new contents");
//		board.setWriter("new writer");
//		//mapper.insert(board);
//		service.register(board);
//		
//		log.info("생성된 게시물의 번호 : "+board.getBno());
//	}
	
//	@Test
//	public void testGetList() {
//		service.getList().forEach(board->log.info(board));
//	}
	
//	@Test
//	public void testGet() {
//		log.info(service.get(1L));
//	}
	
	@Test
	public void testUpdate() {
		BoardVO board=service.get(1L);
		if(board==null) return;
		board.setTitle("제목을 수정합니다");
		log.info("수정된 결과:"+service.modify(board));
	}
	
	@Test
	public void testDelete() {
		log.info(service.remove(2L));
	}
	
	@Test
	public void testGetList() {
		service.getList(new Criteria(2,10)).forEach(board->log.info(board));
	}
	
}
