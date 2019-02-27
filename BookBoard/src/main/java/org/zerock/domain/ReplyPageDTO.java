package org.zerock.domain;

import java.util.List;


public class ReplyPageDTO {

  private int replyCnt;
  private List<ReplyVO> list;
  
  
	public ReplyPageDTO(int countByBno, List<ReplyVO> list2) {
	// TODO Auto-generated constructor stub
		this.replyCnt = countByBno;
		this.list = list2;
	}
	public int getReplyCnt() {
		return replyCnt;
	}
	public void setReplyCnt(int replyCnt) {
		this.replyCnt = replyCnt;
	}
	public List<ReplyVO> getList() {
		return list;
	}
	public void setList(List<ReplyVO> list) {
		this.list = list;
	}
	  
  
}
