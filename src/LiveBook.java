import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

class LiveBookDetails{
	int id,isbn,fine;
	String bname,aname,borname,bortime;
	public LiveBookDetails(int id, int isbn, String bname, String aname, String borname, String bortime,int fine) {
		super();
		this.id = id;
		this.isbn = isbn;
		this.bname = bname;
		this.aname = aname;
		this.borname = borname;
		this.bortime = bortime;
		this.fine=fine;
	}
	@Override
	public String toString() {
		return " [id=" + id+ ", borname="+ borname  +", isbn=" + isbn + ", bname=" + bname + ", aname=" + aname + ", bordate=" + bortime + "]";
	}
}

public class LiveBook{
	ArrayList<LiveBookDetails> lbd = new ArrayList<>();
	public void borrowBook(int isbn,String bname,String aname,int id, String name) {
		Books b = new Books();
		int p = b.SrchBook(isbn, bname, aname);
		if(p != -1) {
			b.booksRack();
		int bq =b.books.get(p).bookQuantity;
		if( bq > 0) {
			bq--;
			b.setBook(isbn, bname, aname, bq, p);
			
			LocalDate bodate = LocalDate.now();
			DateTimeFormatter ex = DateTimeFormatter.ofPattern("dd-MM-YYYY");
			String bdate = bodate.format(ex);
			int fine=0;
			lbd.add(new LiveBookDetails(id,isbn,bname,aname,name,bdate,fine));
			System.out.println(lbd);
		}else {
			System.out.println("Sorry books not available!!");
		}
	}else {
		System.out.println("Sorry books not available!!");
	}
		
}
	public String GetDate(int isbn) {
		String ch="2024-01-10";
		for(int i=0;i<lbd.size();i++) {
			if(lbd.get(i).isbn == isbn) {
				ch = lbd.get(i).bortime;
				System.out.println(ch);
				break;
			}
		}
		return ch;
	}
	public int SearchreturnBook(int isbn) {
		int i=-1;
		for( i=0;i<lbd.size();i++) {
			if(lbd.get(i).isbn == isbn) {
				
				System.out.println(lbd.get(i));
				
				break;
			}
		}
		return i;
	}
	

	    void returnb(int isbn, String bookname1,String author ,int quantity,int id,String name, String date ) {
	           LocalDate date1= LocalDate.now();
	           DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	           LocalDate localDate = LocalDate.parse(date,formatter);
	           Period diff = Period.between(localDate, date1);
	           int a= diff.getDays();
	           if(a<=15) {
	        	   int p = SearchreturnBook(isbn);
	        	   if(p>=0) {
	        	   lbd.remove(p);}
	        	   System.out.println("submitted on time");
	           }
	           else {
	        	   int b=5*(a-15);
	        	   System.out.println("MR "+name+" id: "+id+" Your fine amount is Rs"+b);
	           	}
	           Books p=new Books();
	           int bk=p.SrchBook(isbn,bookname1,author);
	           int nm=p.getquantity(isbn);
	           p.booksRack();
	           if(bk >=0){
	        	   nm++;
	        	   p.setBook(isbn,bookname1,author,nm,bk);
	        	   
	           	}
	           else
	           {
	           		System.out.println("It's not our book");
	           	}
	           }
	   
	    boolean todayreturns1(String date2) {
	    LocalDate datenow = LocalDate.now();
	    LocalDate localdate1=LocalDate.parse(date2);
	    Period diff =Period.between(localdate1, datenow);
	    int b=diff.getDays();
	    if (b>=15) {
	    	return true;
	    }else {
	    return false;
	    }}
	    void returndaate(int isbn) {
	    	 int p = SearchreturnBook(isbn);
	    	 String date =lbd.get(p).bortime;
	    	 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	         LocalDate localDate = LocalDate.parse(date,formatter);
	         LocalDate datenow = LocalDate.now();
	         Period diff =Period.between(localDate, datenow);
	         int d = diff.getDays();
	         Calendar cal = Calendar.getInstance();
	         Date dt = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
	         cal.setTime( dt);
	         int dit = (15-d);
	         cal.add(Calendar.DAY_OF_MONTH, dit);
	         SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyy");
	         String rturndate = ft.format(cal.getTime());
	         System.out.println(rturndate);
	         
	    }


}

