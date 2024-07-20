import java.util.Scanner;

public class Administrate {
	public void admin() {
		Displays d1 = new Displays();
		Scanner scn = new Scanner(System.in);
		Student st = new Student();
		Staff sf = new Staff();
		Books bk = new Books();
		LiveBook lb = new LiveBook();
		String password;
		do {
			System.out.print("Enter the password:");
			password = scn.next();
		if(password.equalsIgnoreCase("Admin123")) {
			d1.adminDisplay();
			bk.booksRack();
			st.firstStudent();
			sf.existingstaff();
			int n=scn.nextInt();
			do {
			switch(n) {
			case 1:{
				
				bk.bookDisp();
			}break;
			case 2:{
				
			}break;
			case 3:{
				
				st.displayStudentDetails();
			}break;
			case 4:{
				
				sf.displaystaffdetails();
			}break;
			case 5:{
				System.out.print("Enter the rollno:");
				int rn = scn.nextInt();
				System.out.print("Enter the Name:");
				scn.nextLine();
				String name = scn.nextLine();
				st.addStudent(rn, name);
			}break;
			case 6:{
				System.out.print("Enter the StaffId:");
				int rn = scn.nextInt();
				System.out.print("Enter the Name:");
				scn.nextLine();
				String name = scn.nextLine();
				sf.addnewstaff(rn, name);
				
			}break;	
            case 7:{
            	 System.out.println("Enter the ISBN:");
            	 int isbn = scn.nextInt();
            	 System.out.println("Enter the Book Name:");
            	 String bname = scn.next();
            	 System.out.println("Enter the Author Name:");
            	 String aname = scn.next();
            	 System.out.println("Quantity of Book:");
            	 int bq = scn.nextInt();
            	 bk.addBooks(isbn, bname, aname, bq);
			}break;
			case 8:{
				System.out.println("Enter the ISBN:");
		    	 int isbn = scn.nextInt();
		    	 System.out.println("Enter the Book Name:");
		    	 String bname = scn.next();
		    	 System.out.println("Enter the Author Name:");
		    	 String aname = scn.next();
		    	 lb.returndaate(isbn);			
		    	 }break;
			default:{
				System.out.println("Enter The correct option");
						}
			}n = scn.nextInt();	
			}while(n!=0);
			
		}else {
			System.out.println("Password Incorrect");
		}
	}while(!password.equalsIgnoreCase("Admin123"));

}}
