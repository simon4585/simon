package org.edu.dao;

import java.util.List;

import org.edu.vo.BoardVO;


public interface IF_BoardDAO {
    public void insertMember(BoardVO boardVO) throws Exception;
    public List<BoardVO> selectBoard() throws Exception;
    public void updateBoard(BoardVO boardVO) throws Exception;
    public void deleteBoard(Integer bno) throws Exception;
}
