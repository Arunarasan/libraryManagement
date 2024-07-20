import java.util.ArrayList;

class staffdetails{
	int staffid;
	String name;
	public staffdetails(int staffid, String name) {
		super();
		this.staffid = staffid;
		this.name = name;
	}
	@Override
	public String toString() {
		return "[staffid=" + staffid + ", name=" + name + "]";
	}}
	
public class Staff{
		ArrayList<staffdetails> staff=new ArrayList<>();

		public void existingstaff() {
		staff.add(new staffdetails(201,"suresh"));
		staff.add(new staffdetails(202,"ramesh"));
		staff.add(new staffdetails(203,"maari"));
		staff.add(new staffdetails(202,"ragu"));
		staff.add(new staffdetails(202,"selva"));
		staff.add(new staffdetails(202,"kumar"));
		}
		
		public void addnewstaff(int staffid,String name) {
			staff.add(new staffdetails(staffid,name));
		}
			
		
	public boolean check(int stafid,String name) {
		boolean flag=false;
		for(int i=0;i<staff.size();i++) {
		if(stafid == staff.get(i).staffid && staff.get(i).name.equalsIgnoreCase(name)) {
			flag=true;
			break;
		}	
		}
		return flag;
	}
	public void displaystaffdetails() {
		System.out.println("*************************Registerd staff details*****************************");
		for(int j=0;j<staff.size();j++) {
		System.out.println(staff.get(j));

		}
		}

		}
	

