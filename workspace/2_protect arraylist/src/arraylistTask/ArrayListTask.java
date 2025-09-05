package arraylistTask;

import java.util.ArrayList;
import java.util.Arrays;
//ArrayList<String>을 만들고
//
//과일 이름 3개를 추가하고
//
//전체 출력하고
//
//특정 과일이 있는지 확인해보기

public class ArrayListTask {

	public static void main(String[] args) {
		ArrayList<String> fruits = new ArrayList<>(Arrays.asList("사과","바나나"));
		
//		fruits.add("사과");
//		fruits.add("바나나");
//		fruits.add("메론");
//		fruits.add("수박");
		System.out.println(fruits);
		String tagetFruit="사과";
		
		if (fruits.contains(tagetFruit)) {
			System.out.println(tagetFruit+"가 있습니다!");
		}
		else {
			System.out.println(tagetFruit+"가 없습니다 !");
		}
		
		
		
	}
}
