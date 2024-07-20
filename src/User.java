import java.util.*;
public class User {

public  void Users() {
   Displays d1=new Displays();
   Books bl=new Books();
   Student st = new Student();
   LiveBook lb = new LiveBook();
   Staff ad=new Staff();
   Scanner sc =new Scanner(System.in);
   st.firstStudent();
   ad.existingstaff();
   bl.booksRack();
   int a;
   String b;
   do {
   System.out.print("Enter  your id:");
   a=sc.nextInt();
   System.out.print("Enter your name:");
   sc.nextLine();
   b=sc.nextLine();
   if(ad.check(a,b) || st.checkStud(a, b) ) {
      d1.sDisplay();
     int h=sc.nextInt();
     do {
     
     switch(h) {
     case 1:{
       bl.bookDisp();
    }break;
     case 2:{
        System.out.print("Enter the isbn:");
        int isbn =sc.nextInt();
        System.out.print("Enter the book name:");
        sc.nextLine();
        String bkname=sc.nextLine();
        System.out.print("Enter the author:");
        String author=sc.nextLine();
        bl.SrchBook(isbn,bkname,author);

     }break;
     case 3:{
    	 System.out.println("Enter the ISBN:");
    	 int isbn = sc.nextInt();
    	 System.out.println("Enter the Book Name:");
    	 String bname = sc.next();
    	 System.out.println("Enter the Author Name:");
    	 String aname = sc.next();
    	 lb.borrowBook(isbn, bname, aname, a, b);
         }break;
     case 4:{
    	 System.out.println("Enter the ISBN:");
    	 int isbn = sc.nextInt();
    	 System.out.println("Enter the Book Name:");
    	 String bname = sc.next();
    	 System.out.println("Enter the Author Name:");
    	 String aname = sc.next();
    	 String d = lb.GetDate(isbn);
    	 int bk = bl.getquantity(isbn);
    	 lb.returnb(isbn, bname, aname, bk, a, b, d);
    	 
    	 
     }break;
     case 5:{
    	 System.out.println("Enter the ISBN:");
    	 int isbn = sc.nextInt();
    	 System.out.println("Enter the Book Name:");
    	 String bname = sc.next();
    	 System.out.println("Enter the Author Name:");
    	 String aname = sc.next();
    	 lb.returndaate(isbn);
    	 
     }break;
     default :{
    	 System.out.println("Enter The correct option");
     }
     }h=sc.nextInt();
}while(h!=0);}
else {
System.out.println("your haven't registered your details ,so Please update your information in the database");
}

}while(ad.check(a,b) && st.checkStud(a, b));

}}