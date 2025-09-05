package com.app.repogitory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Optional;

import com.app.config.DBConnecter;
import com.app.domain.MemberVO;
import com.app.domain.member.MemberGender;
import com.app.domain.status.MemberStatus;

public class MemberDAO {
//   내가 설정한 RDB의 연결 객체
//	 디비버와 연동,조회에 필요한 것들 선언 
   private Connection connection;
   private PreparedStatement preparedStatement;
   private ResultSet resultSet;
   
//   추가
//   매개변수로 VO를받아옴
   public void insert(MemberVO memberVO) {
//	   문자열 소모값적게 적기위해 스트링빌더사용
      StringBuilder stringBuilder = new StringBuilder();
      String query = null;
//      디비버에서 입력될 문자열 입력
      stringBuilder.append("insert into tbl_member");
      stringBuilder.append("(member_email, member_password, member_name, member_age, member_gender)");
//      ?????은 prepsetString에서 편하게 작성하라고 만들어진 문법? 
      stringBuilder.append("values(?, ?, ?, ?, ?)");
//      모아서쿼리라는 변수에담음
      query = stringBuilder.toString();
      
      try {
//    	  데이터베이스와 연결
         connection = DBConnecter.getConnection();
//         쿼리문을 입력
         preparedStatement = connection.prepareStatement(query);
//         화면(메인)에서 입력할것을 쿼리문에 대입
         preparedStatement.setString(1, memberVO.getMemberEmail());
         preparedStatement.setString(2, memberVO.getMemberPassword());
         preparedStatement.setString(3, memberVO.getMemberName());
         preparedStatement.setInt(4, memberVO.getMemberAge());
         preparedStatement.setString(5, memberVO.getMemberGender().getValue());
//       갱신? 업데이트 
         preparedStatement.executeUpdate();
//         디비버와 연동해서 할때는 트라이캐치 필수라 담아둠
      } catch (SQLException e) {
         System.out.println("insert(MemberVO) SQL 오류");
         e.printStackTrace();
         
      } catch (Exception e) {
         e.printStackTrace();
//      무조건 연동을꺼야함으로 마지막순서부터 순서대로 끔 
      } finally {
         try {
//        	 널이아닐때만 검사하고 종료 
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
            
         } catch (SQLException e) {
            throw new RuntimeException();
         }
      }
   }
   
//   수정
//   수정된정보를 매개변수로받음 
   public void update(MemberVO memberVO) {
      String query = null;
      StringBuilder stringBuilder = new StringBuilder();
//      빌더사용
      stringBuilder.append("update tbl_member");
      stringBuilder.append("set member_password=?, member_name=?, member_age=?, member_gender=?, updated_date=current_timestamp()");
      stringBuilder.append("where id = ?");
//      쿼리문에담음 
      query = stringBuilder.toString();
      
      try {
//    	  입력받은값으로 세터를사용해서 데이터변경 
         connection = DBConnecter.getConnection();
         preparedStatement = connection.prepareStatement(query);
         
         preparedStatement.setString(1, memberVO.getMemberPassword());
         preparedStatement.setString(2, memberVO.getMemberName());
         preparedStatement.setInt(3, memberVO.getMemberAge());
         preparedStatement.setString(4, memberVO.getMemberGender().getValue());
         preparedStatement.setLong(5, memberVO.getId());
         
         preparedStatement.executeUpdate();
         
      } catch (SQLException e) {
         System.out.println("update(MemberVO) SQL문 오류");
         e.printStackTrace();
      } catch (Exception e) {
         e.printStackTrace();
//         위랑같음
      } finally {
         try {
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
            
         } catch (SQLException e) {
            throw new RuntimeException();
         }
      }
   }

//   삭제
   public void deleteSoft(Long id) {
      String query = null;
      StringBuilder stringBuilder = new StringBuilder();
//      스트링빌더에 멤버스테이터스를 disable로변경하는 쿼리문을담음 앞으로는 and member_status=able 등으로 구별해서사용가능
      stringBuilder.append("update tbl_member");
      stringBuilder.append("set member_status = disable");
      stringBuilder.append("where id = ?");
      
      query = stringBuilder.toString();
      
      try {
         connection = DBConnecter.getConnection();
         preparedStatement = connection.prepareStatement(query);
         
         preparedStatement.setLong(1, id);
         
         preparedStatement.executeUpdate();
//         위와동일 
      } catch (SQLException e) {
         System.out.println("deleteHard(Long) SQL문 오류");
         e.printStackTrace();
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         try {
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
            
         } catch (SQLException e) {
            throw new RuntimeException();
         }
      }
   }
   
   public void deleteHard(Long id) {
      String query = null;
      StringBuilder stringBuilder = new StringBuilder();
//      빌더에 테이블의 아이디를 삭제할 쿼리문을 작성
      stringBuilder.append("delete from tbl_member");
      stringBuilder.append("where id = ?");
      
      query = stringBuilder.toString();
      
      try {
         connection = DBConnecter.getConnection();
         preparedStatement = connection.prepareStatement(query);
         
         preparedStatement.setLong(1, id);
         
         preparedStatement.executeUpdate();
         
      } catch (SQLException e) {
         System.out.println("deleteHard(Long) SQL문 오류");
         e.printStackTrace();
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         try {
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
            
         } catch (SQLException e) {
            throw new RuntimeException();
         }
      }
   }
   
//   조회
   public Optional<MemberVO> selectOne(Long id) {
      MemberVO memberVO = null;
      String query = null;
//       빌더를사용해서 멤버에서 id를 매개변수로받아서 그정보를 조회하는 쿼리문작성해서 변수에담음
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("select ");
      stringBuilder.append("id, member_email, member_name, member_age, member_gender ");
      stringBuilder.append("from tbl_member ");
      stringBuilder.append("where id = ?");
      
      query = stringBuilder.toString();
      
      try {
         connection = DBConnecter.getConnection();
         preparedStatement =  connection.prepareStatement(query);
         preparedStatement.setLong(1, id);
         
         resultSet = preparedStatement.executeQuery();
//         행부터읽기위해 result next? 사용하여 반복문돌림 
         if(resultSet.next()) {
            MemberGender memberGender = null;
            memberVO = new MemberVO();
            memberVO.setId(resultSet.getLong("id"));
            memberVO.setMemberEmail(resultSet.getString("member_email"));
            memberVO.setMemberName(resultSet.getString("member_name"));
            memberVO.setMemberAge(resultSet.getInt("member_age"));
            memberVO.setMemberGender(resultSet.getString("member_gender"));
         }
         
      } catch (SQLException e) {
         System.out.println("selectOne(Long) SQL 오류");
         e.printStackTrace();
      } catch (Exception e) {
         e.printStackTrace();
//         위에꺼랑동일
      } finally {
         try {
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
            
         } catch (SQLException e) {
            throw new RuntimeException();
         }
      }
      return Optional.ofNullable(memberVO);
   }
   
//   전체 조회
//   		전체를조회하기위해 어레이리스트 배열에담음 
   public ArrayList<MemberVO> selectAll() {
      ArrayList<MemberVO> members = new ArrayList<MemberVO>();
      MemberVO memberVO = null;
      String query = null;
//     빌더를 사용해 테이블에있는 컬럼?을 모두 조회하는 쿼리문 작성
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("select ");
      stringBuilder.append("id, member_email, member_name, member_age, member_gender ");
      stringBuilder.append("from tbl_member ");
      
      query = stringBuilder.toString();
      
      try {
         connection = DBConnecter.getConnection();
         preparedStatement =  connection.prepareStatement(query);
         resultSet = preparedStatement.executeQuery();
//         모든 테이블조회해야하니 while문으로 전부조회 
         while(resultSet.next()) {
            MemberGender memberGender = null;
            memberVO = new MemberVO();
            memberVO.setId(resultSet.getLong("id"));
            memberVO.setMemberEmail(resultSet.getString("member_email"));
            memberVO.setMemberName(resultSet.getString("member_name"));
            memberVO.setMemberAge(resultSet.getInt("member_age"));
            memberVO.setMemberGender(resultSet.getString("member_gender"));
            
            members.add(memberVO);
         }
         
      } catch (SQLException e) {
         System.out.println("selectOne(Long) SQL 오류");
         e.printStackTrace();
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         try {
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
            
         } catch (SQLException e) {
            throw new RuntimeException();
         }
      }
      return members;
   }
}




















