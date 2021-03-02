package com.roon.mapper;

import java.util.List;

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
public class BoardMapperTests {
	
	@Setter(onMethod_ = @Autowired)
	private BoardMapper mapper;
	
//	@Test
//	public void testGetList() {
//		mapper.getList().forEach(board->log.info(board));
//	}
//	
//	@Test
//	public void testInsert() {
//		BoardVO board = new BoardVO();
//		board.setTitle("new post");
//		board.setContent("new contents");
//		board.setWriter("new writer");
//		mapper.insert(board);
//		
//		log.info(board);
//	}
//	
//	@Test
//	public void testInsertSelectKey() {
//		BoardVO board = new BoardVO();
//		board.setTitle("new post select key");
//		board.setContent("new contents select key");
//		board.setWriter("new writer");
//		mapper.insertSelectKey(board);
//		
//		log.info(board);
//	}
//	
//	@Test 
//	public void testRead() {
//		BoardVO board  = mapper.read(5L);
//		
//		log.info(board);
//	}
//	
//	@Test 
//	public void testDelete() {
//		log.info("delete count ="+mapper.delete(18L));
//		
//	}
//	
//	
//	@Test
//	public void testUpdate() {
//		BoardVO board = new BoardVO();
//		
//		board.setBno(5L);
//		board.setTitle("updated title");
//		board.setContent("updated contents");
//		board.setWriter("updated writer");
//		
//		int count = mapper.update(board);
//		log.info("updated cnt :"+count );
//	}
//	
//	@Test
//	public void testPaging() {
//		Criteria cri = new Criteria();
//		List<BoardVO> list = mapper.getListWithPaging(cri);
//		list.forEach(board->log.info(board));
//	}
	
	@Test
	public void testSearch() {
		Criteria cri = new Criteria();
		cri.setKeyword("writer");
		cri.setType("W");
		
		List<BoardVO> list = mapper.getListWithPaging(cri);
		
		list.forEach(board->log.info(board));
	} 
	
	
}
