package com.app.domain.member;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum MemberGender {
   MAN("남"), WOMAN("여"), NONE("선택안함");
   
   private String value;

   private static final Map<String, MemberGender> VALUE_MAP = 
		   Stream.of(MemberGender.values()).collect(Collectors.toMap(MemberGender::getValue, (enumeration) -> enumeration));
   
   public static MemberGender getEnum(String value) {
	   return VALUE_MAP.get(value);
   }
   
   private MemberGender(String value) {
      this.value = value;
   }

   public String getValue() {
      return value;
   }
   
   @Override
   public String toString() {
      return value;
   }
   
}
