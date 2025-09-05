package protect;

import java.util.Arrays;
import java.util.List;

public class Protect11 {

	public static void main(String[] args) {
//		List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
//		names.forEach((name)->{System.out.println(name);});
//		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//		numbers.stream().map((number)->number*number).forEach((number)->{System.out.println(number);});
//		
//		List<Integer> numbers1 = Arrays.asList(10, 15, 20, 25, 30);
//		numbers1.stream().filter((number)->number%2==0).forEach((number)->{System.out.println(number);});
		
		
//		문제 2: 학생 점수에 따른 합격자만 출력
//		문제
//		학생들의 점수 리스트가 있을 때, 60점 이상인 학생만 "합격: [점수]" 형식으로 출력하세요.
//
//		java
//		복사
//		편집
//		List<Integer> scores = Arrays.asList(45, 67, 89, 32, 75, 58);
//		출력 예시:
//
//		makefile
//		복사
//		편집
//		합격: 67
//		합격: 89
//		합격: 75
//		힌트:
//
//		filter()로 합격자 필터
//
//		map()으로 문자열로 가공
//
//		forEach()로 출력
//
//		✅ 문제 3: 상품 가격 출력 (포맷팅 포함)
//		문제
//		상품 가격 리스트가 아래와 같을 때, 각각 "가격: 00,000원" 형식으로 출력하세요.
//
//		java
//		복사
//		편집
//		List<Integer> prices = Arrays.asList(12000, 5500, 33000, 19800);
//		출력 예시:
//
//		makefile
//		복사
//		편집
//		가격: 12,000원
//		가격: 5,500원
//		가격: 33,000원
//		가격: 19,800원
//		힌트:
//
//		map()에서 String.format() 또는 NumberFormat 사용
//
//		forEach()로 출력


		
		
		
//		아래 이름 리스트 중에서, 이름 길이가 4 이하인 사람들만 필터링하여 대문자로 출력하세요.
		List<String> names = Arrays.asList("Tom", "Elizabeth", "Amy", "John", "Ann");
		names.stream().map((name)->name.toUpperCase()).filter((name)->name.length()<5).forEach((name)->{System.out.println(name);});
		
		
		List<Integer> scores = Arrays.asList(45, 67, 89, 32, 75, 58);
//		scores.stream().filter((score)>59).map(score -> "합격: " + score).forEach??????????????
		
		List<Integer> prices = Arrays.asList(12000, 5500, 33000, 19800);
		prices.stream().map(price->String.format("가격: %,d원",price)).forEach((price)->{System.out.println(price);});
		
		

	}

}
