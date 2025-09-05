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

import java.util.Objects;

public class Book {
	public Book() {;}
	private String name;
	private String author;
	private int page;
	public Book(String name, String author, int page) {
		super();
		this.name = name;
		this.author = author;
		this.page = page;
	}
	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", page=" + page + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(author, name, page);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(name, other.name) && page == other.page;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	
	
	

}
