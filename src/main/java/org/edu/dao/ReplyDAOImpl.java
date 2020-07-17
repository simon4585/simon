package org.edu.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.edu.vo.ReplyVO;
import org.springframework.stereotype.Repository;
@Repository

public class ReplyDAOImpl implements IF_ReplyDAO  {
   private static String mapperQuerry="org.edu.dao.IF_ReplyDAO";
   
	@Inject
	private SqlSession sqlSession; //마이바티스 사용 변수 추가
   
   
   @Override
	public List<ReplyVO> selectReply(Integer bno) throws Exception {
		return sqlSession.selectList(mapperQuerry+".selectReply",bno);
	}

	@Override
	public void insertReply(ReplyVO replyVO) throws Exception {
		sqlSession.insert(mapperQuerry+".insertReply",replyVO);
		
	}

	@Override
	public void updateReply(ReplyVO replyVO) throws Exception {
	   sqlSession.update(mapperQuerry+".updateReply",replyVO);
		
	}

	@Override
	public void deleteReply(Integer rno) throws Exception {
		sqlSession.delete(mapperQuerry+ ".deleteReply",rno);
		
	}
	
	
	

}
