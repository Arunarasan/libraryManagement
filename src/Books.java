import java.util.ArrayList;

class BookDetails{
	int isbn,bookQuantity;
	String bookName,authorName;
	public BookDetails(int isbn, int bookQuantity, String bookName, String authorName) {
		super();
		this.isbn = isbn;
		this.bookQuantity = bookQuantity;
		this.bookName = bookName;
		this.authorName = authorName;
	}

	@Override
	public String toString() {
		return "[isbn=" + isbn + ", bookQuantity=" + bookQuantity + ", bookName=" + bookName
				+ ", authorName=" + authorName + "]";
	}
}

public class Books {
  
	ArrayList<BookDetails> books = new ArrayList<>();
	public void booksRack() {
		addBooks(101,"c++","Arul",10);
		addBooks(102,"C", "Arun",15);
		addBooks(103,"Python", "Dhanush",5);
		addBooks(104,"Java","Ilam",20);
	}
	public void addBooks(int isbn , String bookname,String authorname,int bq) {
		books.add(new BookDetails(isbn,bq,bookname,authorname));	
	}
	public int SrchBook(int bn,String name ,String aname) {
		int i=-1;
		for( i=0;i<books.size();i++) {
			if(bn == books.get(i).isbn && books.get(i).bookName.equalsIgnoreCase(name) && books.get(i).authorName.equalsIgnoreCase(aname)) {
				System.out.println(books.get(i));
				break;
			}
		}
		return i;
	}
	public void setBook(int isbn , String bookname,String authorname,int bq,int p) {
		books.set(p,new BookDetails(isbn,bq,bookname,authorname));
	}
	public void bookDisp() {
		for(int i=0;i<books.size();i++) {
			System.out.println(books.get(i));
		}
	}
	public int getquantity(int isbn) {
		int ch=0;
		for(int i=0;i<books.size();i++) {
			if(books.get(i).isbn == isbn) {
				ch = books.get(i).bookQuantity;
				break;
			}
		}
		return ch;
	}
	
	
}
