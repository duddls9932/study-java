package book;
//목표:

//
//책 정보를 입력받고,
//
//특정 작가의 책 목록 반환,
//
//가장 많은 페이지 수를 가진 책 반환,
//
//모든 책의 평균 페이지 수 계산 후 리턴하는 메소드들을 만들자.
//
//조건
//
//void 메소드보다는 리턴값을 많이 받는 메소드 위주로
//
//인터페이스/추상클래스 없이, 그냥 클래스와 메소드만 활용

import java.util.ArrayList;

public class BookService {
	 private ArrayList<Book> books = new ArrayList<Book>();
	 
	 public Book addBook(String name, String author, int page) {
	        if (page < 0) {
//	            throw new IllegalArgumentException("페이지 수는 0 이상이어야 합니다.");
	        	System.out.println("페이지 수는 0 이상이어야 합니다.");
	        }
	        Book newBook = new Book(name, author, page);
	        books.add(newBook);
	        return newBook;
	 }
	 public ArrayList<Book> getBooks() {
		    return books;
		}
	//가장 많은 페이지 수를 가진 책 반환,
	 public Book getMaxPageBook() {
		 	Book maxBook = books.get(0);
		    for(Book b:books) {
		    if(b.getPage()>maxBook.getPage())
		    	maxBook=b;
		    }
		    return maxBook;
		}
//	 //특정 작가의 책 목록 반환,
	public ArrayList<Book> findBookInputAuthor(String author) {
			ArrayList<Book> taget = new ArrayList<Book>();
		for (Book b:books) {
			if (author.equals(b.getAuthor())) {
				taget.add(b);
			}
		}
		return taget;
	}
	
//	//모든 책의 평균 페이지 수 계산 후 리턴하는 메소드들을 만들자.
	public double getAverage() {
		int total =0;
		double average =0;
		for (Book b :books){
			 total+=b.getPage();
		}
		average=(double)total/books.size();
		return average;
		
		
	}
	

}
