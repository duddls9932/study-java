package com.app.repogitory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.app.config.DBConnecter;
import com.app.domain.ReplyVO;
import com.app.domain.dto.ReplyDTO;


public class ReplyDAO {
	
	private Connection connection;
	   private PreparedStatement preparedStatement;
	   private ResultSet resultSet;

	//   추가
	   public void insert(ReplyVO replyVO) {
	      StringBuilder stringBuilder = new StringBuilder();
	      String query = null;

	      stringBuilder.append("insert into tbl_reply ");
	      stringBuilder.append("(reply_content,post_id, member_id) ");
	      stringBuilder.append("values(?, ?,?)");

	      query = stringBuilder.toString();

	      try {
	         connection = DBConnecter.getConnection();
	         preparedStatement = connection.prepareStatement(query);

	         preparedStatement.setString(1, replyVO.getReplyContent());
	         preparedStatement.setLong(2, replyVO.getPostId());
	         preparedStatement.setLong(3, replyVO.getMemberId());

	         preparedStatement.executeUpdate();

	      } catch (SQLException e) {
	         System.out.println("insert(replyVO) SQL 오류");
	         e.printStackTrace();

	      } catch (Exception e) {
	         e.printStackTrace();

	      } finally {
	         try {
	            if (preparedStatement != null) {
	               preparedStatement.close();
	            }
	            if (connection != null) {
	               connection.close();
	            }

	         } catch (SQLException e) {
	            throw new RuntimeException();
	         }
	      }
	   }

	//   수정
	   public void update(ReplyVO replyVO) {
	      String query = null;
	      StringBuilder stringBuilder = new StringBuilder();

	      stringBuilder.append("update tbl_reply ");
	      stringBuilder.append("set  reply_content = ?, updated_date=current_timestamp() ");
	      stringBuilder.append("where id = ?");

	      query = stringBuilder.toString();

	      try {
	         connection = DBConnecter.getConnection();
	         preparedStatement = connection.prepareStatement(query);

	         
	         preparedStatement.setString(1, replyVO.getReplyContent());
	         preparedStatement.setLong(2, replyVO.getId());

	         preparedStatement.executeUpdate();

	      } catch (SQLException e) {
	         System.out.println("update(ReplyVO) SQL문 오류");
	         e.printStackTrace();
	      } catch (Exception e) {
	         e.printStackTrace();
	      } finally {
	         try {
	            if (preparedStatement != null) {
	               preparedStatement.close();
	            }
	            if (connection != null) {
	               connection.close();
	            }

	         } catch (SQLException e) {
	            throw new RuntimeException();
	         }
	      }
	   }

	//   삭제(soft-delete)
	   public void deleteSoft(Long id) {
	      String query = null;
	      StringBuilder stringBuilder = new StringBuilder();

	      stringBuilder.append("update tbl_reply ");
	      stringBuilder.append("set reply_status = 'disable' ");
	      stringBuilder.append("where id = ?");

	      query = stringBuilder.toString();

	      try {
	         connection = DBConnecter.getConnection();
	         preparedStatement = connection.prepareStatement(query);

	         preparedStatement.setLong(1, id);

	         preparedStatement.executeUpdate();

	      } catch (SQLException e) {
	         System.out.println("delete(Long) SQL문 오류");
	         e.printStackTrace();
	      } catch (Exception e) {
	         e.printStackTrace();
	      } finally {
	         try {
	            if (preparedStatement != null) {
	               preparedStatement.close();
	            }
	            if (connection != null) {
	               connection.close();
	            }

	         } catch (SQLException e) {
	            throw new RuntimeException();
	         }
	      }
	   }
	   
	//   삭제(hard-delete)
	   public void deleteHard(Long id) {
	      String query = null;
	      StringBuilder stringBuilder = new StringBuilder();

	      stringBuilder.append("delete from tbl_reply ");
	      stringBuilder.append("where id = ?");

	      query = stringBuilder.toString();

	      try {
	         connection = DBConnecter.getConnection();
	         preparedStatement = connection.prepareStatement(query);

	         preparedStatement.setLong(1, id);

	         preparedStatement.executeUpdate();

	      } catch (SQLException e) {
	         System.out.println("delete(Long) SQL문 오류");
	         e.printStackTrace();
	      } catch (Exception e) {
	         e.printStackTrace();
	      } finally {
	         try {
	            if (preparedStatement != null) {
	               preparedStatement.close();
	            }
	            if (connection != null) {
	               connection.close();
	            }

	         } catch (SQLException e) {
	            throw new RuntimeException();
	         }
	      }
	   }

	//   조회
	   public ReplyDTO selectOne(Long id) {
	      ReplyDTO replydto = null;
	      String query = null;
	      StringBuilder stringBuilder = new StringBuilder();
	      stringBuilder.append("select ");
	      stringBuilder.append("r.id, r.reply_content, m.member_name, r.created_date, r.updated_date ");
	      stringBuilder.append("from tbl_reply r join tbl_member m ");
	      stringBuilder.append("on  r.member_id= m. id where r.id = ? and r.reply_status = 'enable'");

	      query = stringBuilder.toString();

	      try {
	         connection = DBConnecter.getConnection();
	         preparedStatement = connection.prepareStatement(query);

	         preparedStatement.setLong(1, id);

	         resultSet = preparedStatement.executeQuery();

	         if (resultSet.next()) {
	           replydto = new ReplyDTO();

	            replydto.setId(resultSet.getLong("id"));
	            replydto.setReplyContent(resultSet.getString("reply_content"));
	            replydto.setMemberName(resultSet.getString("member_name"));
	            
	            replydto.setCreatedDate(resultSet.getString("created_date"));
	            replydto.setUpdatedDate(resultSet.getString("updated_date"));
	         }

	      } catch (SQLException e) {
	         System.out.println("selectOne(Long) SQL 오류");
	         e.printStackTrace();
	      } catch (Exception e) {
	         e.printStackTrace();
	      } finally {
	         try {
	            if (resultSet != null) {
	               resultSet.close();
	            }
	            if (preparedStatement != null) {
	               preparedStatement.close();
	            }
	            if (connection != null) {
	               connection.close();
	            }

	         } catch (SQLException e) {
	            throw new RuntimeException();
	         }
	      }

	      return replydto;
	   }
	   
	//   전체 조회
	   public ArrayList<ReplyDTO> selectAll() {
	      ArrayList<ReplyDTO> replys = new ArrayList<ReplyDTO>();
	      ReplyDTO replyDTO = null;
	      String query = null;
	      StringBuilder stringBuilder = new StringBuilder();
	      stringBuilder.append("select ");
	      stringBuilder.append("r.id, r.reply_content, m.member_name, r.created_date, r.updated_date ");
	      stringBuilder.append("from tbl_reply r join tbl_member m ");
	      stringBuilder.append("on  r.member_id= m. id and r.reply_status = 'enable'");

	      query = stringBuilder.toString();

	      try {
	         connection = DBConnecter.getConnection();
	         preparedStatement = connection.prepareStatement(query);
	         resultSet = preparedStatement.executeQuery();

	         while (resultSet.next()) {
	            replyDTO = new ReplyDTO();

	            replyDTO.setId(resultSet.getLong("id"));
	            replyDTO.setReplyContent(resultSet.getString("reply_content"));
	            replyDTO.setMemberName(resultSet.getString("member_name"));
	            
	            replyDTO.setCreatedDate(resultSet.getString("created_date"));
	            replyDTO.setUpdatedDate(resultSet.getString("updated_date"));
	            
	            replys.add(replyDTO);
	         }

	      } catch (SQLException e) {
	         System.out.println("selectOne(Long) SQL 오류");
	         e.printStackTrace();
	      } catch (Exception e) {
	         e.printStackTrace();
	      } finally {
	         try {
	            if (resultSet != null) {
	               resultSet.close();
	            }
	            if (preparedStatement != null) {
	               preparedStatement.close();
	            }
	            if (connection != null) {
	               connection.close();
	            }

	         } catch (SQLException e) {
	            throw new RuntimeException();
	         }
	      }

	      return replys;
	   }
	}
	


