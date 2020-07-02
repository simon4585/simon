package org.edu.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.edu.vo.BoardVO;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAOImpl implements IF_BoardDAO {

   private static String mapperQuery = "org.edu.dao.IF_BoardDAO";
   @Inject
   private SqlSession sqlSession;
   
@Override
public void insertBoard(BoardVO boardVO) throws Exception {
   sqlSession.insert(mapperQuery + ".insertBoard", boardVO);
   
}
@Override
public List<BoardVO> selectBoard() throws Exception {
   // TODO Auto-generated method stub
   return sqlSession.selectList(mapperQuery + ".selectBoard");
}
@Override
public void updateBoard(BoardVO boardVO) throws Exception {
   sqlSession.update(mapperQuery + ".updateBoard", boardVO);
   
}
@Override
public void deleteBoard(Integer bno) throws Exception {
   sqlSession.delete(mapperQuery + ".deleteBoard", bno);
   
}
@Override
public BoardVO viewBoard(Integer bno) throws Exception {
   return sqlSession.selectOne(mapperQuery + ".viewBoard", bno);
}
   
@Override
public void insertAttach(String fullname) throws Exception {
   sqlSession.insert(mapperQuery + ".insertAttach", fullname);
   
}
@Override
public List<String> selectAttach(Integer bno) throws Exception {
	return sqlSession.selectList(mapperQuery+ ".selectAttach", bno);
}
@Override
public void deleteAttach(Integer bno) throws Exception {
	sqlSession.delete(mapperQuery +".deleteAttach", bno);
	
}

 
}