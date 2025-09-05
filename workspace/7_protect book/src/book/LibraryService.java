package book;
//해야 할 기능 (메소드)

//책 등록 (ISBN 중복 체크, 예외 처리)
//
//ISBN으로 책 대출하기 (가능하면 대출 처리, 불가능하면 메시지 출력)
//
//ISBN으로 책 반납하기 (반납 처리)
//
//특정 저자 책 목록 조회 (Stream filter 사용)
//
//대출 가능한 책 목록 조회 (Stream filter 사용)
//
//도서관에 있는 전체 책 수 출력
//
//ISBN으로 책 삭제
//
//가장 많이 대출된 책 반환 (대출 횟수 필드 추가해서 추적)
//
//책 제목으로 검색해서 포함하는 책들 반환 (부분 일치 검색)
//
//모든 책 제목 리스트를 출력 (Stream map 사용)
//

import java.util.ArrayList;



public class LibraryService {
	ArrayList<Book> books = new ArrayList<Book>();

//  책 등록 (ISBN 중복 체크, 예외 처리)
	public ArrayList<Book> addBook(String title1, String author1, int isbn1, boolean isAvailable1) {
		if (title1 == null || title1.isEmpty()) {
			throw new IllegalArgumentException("책 제목은 비어 있을 수 없습니다.");
		}
		for (Book book : books) {
			if (book.getIsbn() == isbn1) {
				throw new IllegalStateException("이미 존재하는 ISBN입니다: " + isbn1);
			}
		}
		Book newBook = new Book(title1, author1, isbn1, isAvailable1);
		books.add(newBook);
		return books;
	}

	// ISBN으로 책 대출하기 (가능하면 대출 처리, 불가능하면 메시지 출력)
//		결과값은 맞게 출력될꺼같은데 리턴을 이런식으로 사용하는게 맞는가 ?
	public Book borrowBookByIsbn(int isbn) {
		for (Book book : books) {
			if (isbn == book.getIsbn()) {
				if (book.isAvailable()) {
					System.out.println(isbn + "번 책 대출완료!");
					book.setAvailable(false);
					return book;

				} else {
					System.out.println("해당 번호의 책은 대출중입니다.");
					return null;
				}
			} 

		}
		System.out.println("해당 번호의 책은없습니다");
		return null;
	}
	
//	ISBN으로 책 반납하기 (반납 처리)
	public Book returnBookByIsbn(int isbn) {
		for (Book book: books) {
			if(isbn==book.getIsbn()) {
				if (!book.isAvailable()) {
					System.out.println(isbn+ "번 책 반납완료!");
					book.setAvailable(true);
					return book;
				}
				else {
					System.out.println("해당 번호의 책은 도서관에있습니다");
					return null;
				}
			}
		}
		System.out.println("해당 번호의 책은없습니다");
		return null;
	}
	
//	특정 저자 책 목록 조회 (Stream filter 사용)
	
//	public ArrayList<Book> inPutAuthorfindTitle(String inPutAuthor){
//		ArrayList<Book> findBook = (ArrayList<Book>)books.stream().filter()
//	}
	


}
