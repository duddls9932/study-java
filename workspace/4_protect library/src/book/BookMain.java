package book;

import java.util.ArrayList;

public class BookMain {
	
	public static void main(String[] args) {
		BookService service = new BookService();
		service.addBook("홍길동전", "작가 1", 68);
		service.addBook("콩쥐팥쥐", "작가 2", 85);
		service.addBook("별님달님", "작가 1", 25);
		service.addBook("백설공", "작가 3", 116);
		service.addBook("심청이", "작가 1", 83);
		
//		ArrayList<Book> bookList = service.getBooks();
//		for (Book b : bookList) {
//		    System.out.println(b);
//		}
		
//		System.out.println(bookList);
		System.out.println(service.getMaxPageBook());
		System.out.println(service.findBookInputAuthor("작가 1"));
		System.out.println(service.getAverage());
		
		
		
		
		
	}
	

}
