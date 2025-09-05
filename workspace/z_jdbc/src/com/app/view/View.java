package com.app.view;

import java.util.ArrayList;

import com.app.config.DBConnecter;
import com.app.domain.MemberVO;
import com.app.domain.PostVO;
import com.app.domain.ReplyVO;
import com.app.domain.dto.PostDTO;
import com.app.domain.dto.ReplyDTO;
import com.app.domain.member.MemberGender;
import com.app.repogitory.MemberDAO;
import com.app.repogitory.PostDAO;
import com.app.repogitory.ReplyDAO;

public class View {
		public static void main(String[] args) {
//		MemberDAO memberDAO = new MemberDAO();
//		MemberVO memberVO = new MemberVO();
//		
//		memberVO.setMemberEmail("test1353@gmail.com");
//		memberVO.setMemberPassword("1234");
//		memberVO.setMemberName("테스트");
//		memberVO.setMemberAge(30);
//		memberVO.setMemberGender(MemberGender.getEnum("여"));
//		
//		
//		
//		memberDAO.insert(memberVO);
//		
//		
//		memberVO.setMemberPassword("3587");
//		memberVO.setMemberName("오유성");
//		memberVO.setMemberAge(18);
//		memberVO.setMemberGender(MemberGender.MAN);
//		memberVO.setId(1l);
//		memberDAO.drop(memberVO);
////		
//		PostVO postVO = new PostVO();
//		PostDAO postDAO = new PostDAO();
//		
//		postVO.setPostTitle("테스트제목");
//		postVO.setPostContent("테스트 내용");
//		postVO.setMemberId(6l);
//		
//		postDAO.insert(postVO);
//		PostDTO postDTO = postDAO.selectOne(2l); 
//		System.out.println(postDTO);
//		
//		postDTO.setPostTitle("수정된제목");
//
//		postDAO.update(postDTO.toVO());
//	
//		System.out.println(postDTO);
		ReplyDAO replyDAO = new ReplyDAO();
		ReplyVO replyVO = new ReplyVO();
//		replyVO.setReplyContent("수정된내용");
//		replyVO.setPostId(2l);
//		replyVO.setId(1l);
		ArrayList<ReplyDTO> relplyDTO = replyDAO.selectAll();
		System.out.println(relplyDTO);
		
		
		
		
		}
}
