package com.app.domain;

import java.util.Objects;

import com.app.domain.member.MemberGender;
import com.app.domain.status.MemberStatus;

public class MemberVO {
   private Long id;
   private String memberEmail;
   private String memberPassword;
   private String memberName;
   private int memberAge;
   private MemberGender memberGender;
   private MemberStatus memberStatus;
   private String createdDate;
   private String updatedDate;
   
   public MemberVO() {;}

public MemberVO(Long id, String memberEmail, String memberPassword, String memberName, int memberAge,
		MemberGender memberGender, MemberStatus memberStatus, String createdDate, String updatedDate) {
	super();
	this.id = id;
	this.memberEmail = memberEmail;
	this.memberPassword = memberPassword;
	this.memberName = memberName;
	this.memberAge = memberAge;
	this.memberGender = memberGender;
	this.memberStatus = memberStatus;
	this.createdDate = createdDate;
	this.updatedDate = updatedDate;
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getMemberEmail() {
	return memberEmail;
}

public void setMemberEmail(String memberEmail) {
	this.memberEmail = memberEmail;
}

public String getMemberPassword() {
	return memberPassword;
}

public void setMemberPassword(String memberPassword) {
	this.memberPassword = memberPassword;
}

public String getMemberName() {
	return memberName;
}

public void setMemberName(String memberName) {
	this.memberName = memberName;
}

public int getMemberAge() {
	return memberAge;
}

public void setMemberAge(int memberAge) {
	this.memberAge = memberAge;
}

public MemberGender getMemberGender() {
	return memberGender;
}

public void setMemberGender(String value) {
	this.memberGender = MemberGender.getEnum(value);
}

public MemberStatus getMemberStatus() {
	return memberStatus;
}

public void setMemberStatus(MemberStatus memberStatus) {
	this.memberStatus = memberStatus;
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
	return Objects.hash(createdDate, id, memberAge, memberEmail, memberGender, memberName, memberPassword, memberStatus,
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
	MemberVO other = (MemberVO) obj;
	return Objects.equals(createdDate, other.createdDate) && Objects.equals(id, other.id)
			&& memberAge == other.memberAge && Objects.equals(memberEmail, other.memberEmail)
			&& memberGender == other.memberGender && Objects.equals(memberName, other.memberName)
			&& Objects.equals(memberPassword, other.memberPassword) && memberStatus == other.memberStatus
			&& Objects.equals(updatedDate, other.updatedDate);
}

@Override
public String toString() {
	return "MemberVO [id=" + id + ", memberEmail=" + memberEmail + ", memberPassword=" + memberPassword
			+ ", memberName=" + memberName + ", memberAge=" + memberAge + ", memberGender=" + memberGender
			+ ", memberStatus=" + memberStatus + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + "]";
}
   
   

   

}




