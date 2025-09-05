package book;

import java.util.Random;
import java.util.Scanner;

//import bank.Bank;
//import bank.Kakao;
//import bank.Kookmin;
//import bank.Shinhan;

//도서관에는 3개의 섹션이 있다:
//
//인문학
//
//과학
//
//소설
//
//모든 책 정보는 다음을 포함한다:
//
//책 제목
//
//책 번호 (중복 불가, 랜덤 6자리)
//
//저자
//
//대여 여부 (빌렸는지 여부)
//
//1. 도서 등록
//2. 도서 대여
//3. 도서 반납
//4. 도서 조회
//5. 책 번호로 책 찾기
//6. 종료
//
//모든 도서는 2차원 배열로 저장: Book[][] books = new Book[3][100];
//(books[0] = 인문학 / books[1] = 과학 / books[2] = 소설)
//
//각 섹션당 최대 100권의 책이 존재할 수 있음.
//
//책 번호는 랜덤 6자리로 자동 생성되며 중복 불가.
//
//대여 시 이미 대여된 책이면 실패 처리.
//
//반납 시, 이미 반납된 책이면 실패 처리.

public class Main {
	public static void main(String[] args) {
		Book [][] arrBook = new Book [3][100];
		int [] arCount= new int [arrBook.length];
		String[] arBookName = { "인문학", "과학", "소설" };
		
		String menu = "1. 도서 등록\n2. 도서 대여\n3. 도서 반납\n4. 도서 조회\n5. 책번호로 책 찾기\n6. 종료";
		int choice=0;
		String bookNumber=null;
		String bookTypeMessage="등록할책의 종류를 적어주세요 1.인문학\n2.과학\n3.소설";
		int bookTypeNum=0;
		Book book=null;
		String title=null;
		boolean isRented = false;
		String author=null;
		 
		 
		Scanner sc = new Scanner(System.in);
		 Random random = new Random();
		 String bookNumberMessage= "책 번호를 입력해주세요";
		
		 
		
		while (true) {
			System.out.println(menu);
			choice=sc.nextInt();
			if (choice==6) {
				break;
			}
			switch(choice) {
			case 1:
				Book[] arBook ={new Humanity(), new Science(), new Novel()};	
				System.out.println(bookTypeMessage);
				bookTypeNum=sc.nextInt();
				bookTypeNum--;
				while(true) {
					bookNumber= String.valueOf(random.nextInt(900000)+100000);
					if(Book.checkBookNum(arrBook, arCount, bookNumber)==null) {
						System.out.println(bookNumber);
						break;
	                  }
					
	               }
				book = arBook[bookTypeNum];
				
//				book.setTitle(title)
	            book.setNumber(bookNumber);
//	            book.setAuthor(author);
//	            book.setRented(isRented);
				
				
				
				arrBook[bookTypeNum][arCount[bookTypeNum]++]=book;
//				System.out.println(1);
				
				break;
			case 2:
				System.out.println(bookNumberMessage);
				bookNumber=sc.next();
				Book.rental(arrBook, arCount, bookNumber);
				break;
			case 3:
				System.out.println(bookNumberMessage);
				bookNumber=sc.next();
				Book.returnBook(arrBook, arCount, bookNumber);
				break;
			case 4:
				System.out.println();
				
				
			case 5:
				System.out.println(bookNumberMessage);
				bookNumber=sc.next();
				Book.findBook(arrBook, arCount, bookNumber);
				break;
				
				
				
				
				
				
				
			
			}
			
			
			
		}
	}
	
}


