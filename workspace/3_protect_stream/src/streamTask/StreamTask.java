package streamTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

//✅ 예제 1: 1~100까지 중 3의 배수이면서 5의 배수인 수만 출력
//✅ 예제 2: 문자열 리스트를 길이 순으로 정렬해서 출력
//✅ 예제 3: Product 리스트에서 재고가 100 이상인 상품의 이름만 출력
//✅ 예제 4: Product의 총합(전체 상품 금액 합계) 계산
//예제 5: 1~100까지 중 짝수만 리스트에 담고 출력

public class StreamTask {

	public static void main(String[] args) {
		//✅ 예제 1: 1~100까지 중 3의 배수이면서 5의 배수인 수만 출력
		ArrayList<Integer> datas = new ArrayList<Integer>();
		IntStream.range(1, 101).filter((number)->number%5==0&&number%3==0).forEach((number)->{datas.add(number);});
		
		System.out.println(datas);
		
		//✅ 예제 2: 문자열 리스트를 길이 순으로 정렬해서 출력
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("딱딱한복숭아");
		fruits.add("바나나");
		fruits.add("사과");
		fruits.sort(Comparator.comparingInt(String ::length));
		System.out.println(fruits);
		
		//✅ 예제 3: Product 리스트에서 재고가 100 이상인 상품의 이름만 출력
		
		Product[] arProduct = {
		new Product("핸드폰", 900_000, 14),
		new Product("게임기", 250_000, 132),
		new Product("칫솔", 3_000, 1523)
		};
		ArrayList<Product> products = new ArrayList<Product>(Arrays.asList(arProduct));
		
//		products.stream().filter(product -> product.getStock() >= 100).forEach(product -> System.out.println(product.getName()));
		//✅ 예제 4: Product의 총합(전체 상품 금액 합계) 계산
		products.stream().map((product)->product.getPrice() * product.getStock()	).forEach((product)->{System.out.println(product);});
//		products.stream().map((product) -> product.getPrice() * product.getStock()).forEach(System.out::println);
		
	
		
		
	}
		
	

}
