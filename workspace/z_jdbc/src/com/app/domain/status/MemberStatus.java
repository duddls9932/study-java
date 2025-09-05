package com.app.domain.status;

public enum MemberStatus {
//	enum 상수 정의 시 생성자 호출
	ENABLE("enable"),DISABLE("disable");
	
//	이넘객체의 필드
	private String value;
	
	


//	이넘객체의 필드 초기화
	private MemberStatus(String value) {
		this.value = value;
	}



	public String getValue() {
		return value;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return value;
	}
	
}
