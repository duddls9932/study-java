package book;

public class Book {
    private String title;
    private String bookNumber;
    private String author;
    private boolean isRented;

    public Book() {
        // 기본 생성자
    }

    public Book(String title, String number, String author, boolean isRented) {
        super();
        this.title = title;
        this.bookNumber = number;
        this.author = author;
        this.isRented = isRented;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNumber() {
        return bookNumber;
    }

    public void setNumber(String number) {
        this.bookNumber = number;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isRented() {
        return isRented;
    }

    public void setRented(boolean isRented) {
        this.isRented = isRented;
    }

    public final static Book checkBookNum(Book arBook[][], int[] arCount, String bookNumber) {
        Book book = null;
        for (int i = 0; i < arBook.length; i++) {
            for (int j = 0; j < arCount[i]; j++) {
                if (arBook[i][j].getNumber().equals(bookNumber)) {
                    book = arBook[i][j];
                    break;
                }
            }
        }
        return book;
    }

    public static Book rental(Book[][] arBook, int[] arCount, String bookNumber) {
        Book user = checkBookNum(arBook, arCount, bookNumber);
        String rentalMessage = "렌탈 성공";
        String rentalFailMessage = "렌탈 실패";
        if (user != null) {
            if (user.bookNumber.equals(bookNumber)) {
                if (user.isRented()) {
                    System.out.println(rentalFailMessage + "이미 대여중");
                    return null;
                } else {
                    user.setRented(true);
                    System.out.println(rentalMessage + "책 번호:" + bookNumber);
                    return user;
                }
            }
        }
        System.out.println("책을못찾음");
        return null;
    }

    public static Book returnBook(Book[][] arBook, int[] arCount, String bookNumber) {
        Book user = checkBookNum(arBook, arCount, bookNumber);
        String renturnBookMessage = "반납 성공";
        String renturnBookFailMessage = "반납 실패";
        if (user != null) {
            if (user.bookNumber.equals(bookNumber)) {
                if (user.isRented()) {
                    user.setRented(false);
                    System.out.println(renturnBookMessage + " 책 번호:" + bookNumber);
                    return user;
                } else {
                    System.out.println(renturnBookFailMessage + " 이미 반납된 책입니다");
                    return null;
                }
            }
        }
        System.out.println("책을 못 찾음");
        return null;
    }
    public static Book findBook(Book[][] arBook, int[] arCount, String bookNumber) {
        for (int i = 0; i < arBook.length; i++) {
            for (int j = 0; j < arCount[i]; j++) {
                Book book = arBook[i][j];
                if (book != null && book.getNumber().equals(bookNumber)) {
                    String[] sectionNames = {"인문학", "과학", "소설"};
                    System.out.println("책 번호: " + bookNumber + "는 '" + sectionNames[i] + "' 섹션에 있습니다.");
                    return book;
                }
            }
        }
        System.out.println("해당 책 번호는 존재하지 않습니다.");
        return null;
    }
    	
    
//    public static Book displayBooks(Book[][] arBook, int[] arCount, String bookNumber) {
    	
//    }
    
}
