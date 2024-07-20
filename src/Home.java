import java.util.*;

public class Home {

	public static void main(String[] args) {
		int ch=0;
		do {
			Scanner sc = new Scanner(System.in); 
			Displays d = new Displays();
			Student st = new Student();
			Staff sf = new Staff();
			User u = new User();
			Administrate ad = new Administrate();
			d.display();
			int n=sc.nextInt();
			switch(n) {
			case 1:{
								ad.admin();
			}break;
			
			case 2: case 3:{
				
				u.Users();
			}break; 
				
			
			default :System.out.println("You are choosing wrong option");
			}
			ch++;
		}while(ch==0);

	}

}





