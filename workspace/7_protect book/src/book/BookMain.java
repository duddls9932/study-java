package book;

public class BookMain {

	public static void main(String[] args) {
		Book book = new Book();
		LibraryService service = new LibraryService();
		service.addBook("제목1", "작가1", 0, false);
		service.addBook("제목2", "작가1", 1, true);
		service.addBook("제목3", "작가2", 2, false);
		service.addBook("제목4", "작가2", 3, false);
		service.addBook("제목5", "작가2", 4, true);
		service.addBook("제목6", "작가3", 5, true);
		service.addBook("제목7", "작가4", 6, true);
		service.addBook("제목8", "작가5", 7, false);
		service.addBook("제목9", "작가5", 8, false);
		
//		System.out.println(service.books);
		
//		service.borrowBookByIsbn(6);
		service.borrowBookByIsbn(6);
		System.out.println(service.books);
//		service.returnBookByIsbn(8);
		
		
	
	
	
	
	}
}
