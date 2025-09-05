package com.app.domain.dto;

import java.util.Objects;

import com.app.domain.status.ReplyStatus;

public class ReplyDTO {
	
	   private Long id;
	   private String replyContent;
	   private Long memberId;
	   private Long postId;
	   private ReplyStatus replyStatus;
	   private String createdDate;
	   private String updatedDate;
	   private String memberName;
	   private String postName;
	   public ReplyDTO() {;}
	public ReplyDTO(Long id, String replyContent, Long memberId, Long postId, ReplyStatus replyStatus,
			String createdDate, String updatedDate, String memberName, String postName) {
		super();
		this.id = id;
		this.replyContent = replyContent;
		this.memberId = memberId;
		this.postId = postId;
		this.replyStatus = replyStatus;
		this.createdDate = createdDate;
		this.updatedDate = updatedDate;
		this.memberName = memberName;
		this.postName = postName;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getReplyContent() {
		return replyContent;
	}
	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}
	public Long getMemberId() {
		return memberId;
	}
	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}
	public Long getPostId() {
		return postId;
	}
	public void setPostId(Long postId) {
		this.postId = postId;
	}
	public ReplyStatus getReplyStatus() {
		return replyStatus;
	}
	public void setReplyStatus(ReplyStatus replyStatus) {
		this.replyStatus = replyStatus;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public String getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getPostName() {
		return postName;
	}
	public void setPostName(String postName) {
		this.postName = postName;
	}
	@Override
	public String toString() {
		return "ReplyDTO [id=" + id + ", replyContent=" + replyContent + ", memberId=" + memberId + ", postId=" + postId
				+ ", replyStatus=" + replyStatus + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate
				+ ", memberName=" + memberName + ", postName=" + postName + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(createdDate, id, memberId, memberName, postId, postName, replyContent, replyStatus,
				updatedDate);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ReplyDTO other = (ReplyDTO) obj;
		return Objects.equals(createdDate, other.createdDate) && Objects.equals(id, other.id)
				&& Objects.equals(memberId, other.memberId) && Objects.equals(memberName, other.memberName)
				&& Objects.equals(postId, other.postId) && Objects.equals(postName, other.postName)
				&& Objects.equals(replyContent, other.replyContent) && replyStatus == other.replyStatus
				&& Objects.equals(updatedDate, other.updatedDate);
	}
	   
	   

}
