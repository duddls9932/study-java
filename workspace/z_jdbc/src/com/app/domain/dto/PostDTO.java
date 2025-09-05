package com.app.domain.dto;

import java.util.Objects;

import com.app.domain.PostVO;
import com.app.domain.status.PostStatus;

public class PostDTO {
   private Long id;
   private String postTitle;
   private String postContent;
   private int postReadCount;
   private String memberName;
   private PostStatus postStatus;
   private String createdDate;
   private String updatedDate;
   
   public PostDTO() {;}

public PostDTO(Long id, String postTitle, String postContent, int postReadCount, String memberName,
		PostStatus postStatus, String createdDate, String updatedDate) {
	super();
	this.id = id;
	this.postTitle = postTitle;
	this.postContent = postContent;
	this.postReadCount = postReadCount;
	this.memberName = memberName;
	this.postStatus = postStatus;
	this.createdDate = createdDate;
	this.updatedDate = updatedDate;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getPostTitle() {
	return postTitle;
}

public void setPostTitle(String postTitle) {
	this.postTitle = postTitle;
}

public String getPostContent() {
	return postContent;
}

public void setPostContent(String postContent) {
	this.postContent = postContent;
}

public int getPostReadCount() {
	return postReadCount;
}

public void setPostReadCount(int postReadCount) {
	this.postReadCount = postReadCount;
}

public String getMemberName() {
	return memberName;
}

public void setMemberName(String memberName) {
	this.memberName = memberName;
}

public PostStatus getPostStatus() {
	return postStatus;
}

public void setPostStatus(PostStatus postStatus) {
	this.postStatus = postStatus;
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

@Override
public int hashCode() {
	return Objects.hash(createdDate, id, memberName, postContent, postReadCount, postStatus, postTitle, updatedDate);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	PostDTO other = (PostDTO) obj;
	return Objects.equals(createdDate, other.createdDate) && Objects.equals(id, other.id)
			&& Objects.equals(memberName, other.memberName) && Objects.equals(postContent, other.postContent)
			&& postReadCount == other.postReadCount && postStatus == other.postStatus
			&& Objects.equals(postTitle, other.postTitle) && Objects.equals(updatedDate, other.updatedDate);
}

@Override
public String toString() {
	return "PostDTO [id=" + id + ", postTitle=" + postTitle + ", postContent=" + postContent + ", postReadCount="
			+ postReadCount + ", memberName=" + memberName + ", postStatus=" + postStatus + ", createdDate="
			+ createdDate + ", updatedDate=" + updatedDate + "]";
}

public PostVO toVO() {
	PostVO postVO = new PostVO();
	postVO.setId(id);
	postVO.setPostTitle(postTitle);
	postVO.setPostContent(postContent);
	postVO.setPostReadCount(postReadCount);
	postVO.setCreatedDate(createdDate);
	postVO.setUpdatedDate(updatedDate);
	
	return postVO;
}
   
   
   
   


 
}
