import java.util.Scanner;

public class Complaint {
	int cid;
    String title;
    String descr;
    String status;
    int customer_id;
    
public void print_complain() {
	System.out.println("ID"+"\t"+"TITLE"+"\t"+"DESCRIPTION"+"\t"+"STATUS"+"\t"+"CUSTOMER ID");
	System.out.println(cid+"\t"+title+"\t"+descr+"\t\t"+status+"\t"+customer_id);
}	
public Complaint() {
	
}
    
	public Complaint(int cid, String title, String descr, String status, int customer_id) {
		super();
		this.cid = cid;
		this.title = title;
		this.descr = descr;
		this.status = status;
		this.customer_id = customer_id;
	}
	public Complaint(boolean take_input,int id,int cid) {
		if(take_input) {
			Scanner sc= new Scanner(System.in);
			
			this.cid=cid;
			System.out.print("Enter title: ");
			this.title = sc.nextLine();
			System.out.print("Enter description: ");
			this.descr = sc.nextLine();
			System.out.print("Enter status: ");
			this.status = sc.nextLine();
			this.customer_id = id;
			
		}
		
	}
	
	
}
