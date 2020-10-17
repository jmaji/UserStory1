import java.util.Scanner;
public class User {

	public User() {
		// TODO Auto-generated constructor stub
	}

	public static void main_menu(Database DB) {
			System.out.println(" ");
			System.out.println("\tWELCOME TO CUSTOMER CARE SYSTEM");
			System.out.println("PLEASE SELECT OPTION NUMBER TO MOVE AHEAD");
			System.out.println("\t[1] VIEW CUSTOMER NAME");
			System.out.println("\t[2] VIEW ALL COMPLAINTS");
			System.out.println("\t[3] VIEW COMPLAINT STATUS");
			System.out.println("\t[4] FILE A NEW COMPLAINT");
			System.out.print("Enter your selection: ");
			launch_menu(DB);
		
	
	}
	
	public static void launch_menu(Database DB) {
		
		Scanner sc= new Scanner(System.in);
		int ch=sc.nextInt();
				
		switch(ch)
		{
		case 1:
			System.out.print("Enter Customer Id: ");
			int keyid_1 = sc.nextInt();
			for(int i=0;i<3;i++)
			{	Person customer_temp = DB.customerDB[i];
				if(customer_temp.id==keyid_1) {
					System.out.println("Name of customer: "+customer_temp.name);
				}
			}
			main_menu(DB);
			break;
		case 2:
			System.out.print("Enter Customer Id: ");
			int keyid_2 = sc.nextInt();
			for(int i=0;i<3;i++) {
				Person customer_temp = DB.customerDB[i];
				if(customer_temp.id==keyid_2) {
					Complaint[] temp = customer_temp.c_list;
					for(int j=0;j<temp.length;j++) {
						temp[j].print_complain();
					}
				}
			}
			main_menu(DB);
			break;
		case 3:
			System.out.print("Enter Customer Id: ");
			int keyid_3 = sc.nextInt();
			System.out.print("Enter Complaint Id: ");
			int cid_1  = sc.nextInt();
			for(int i=0;i<3;i++) {
				Person customer_temp = DB.customerDB[i];
				if(customer_temp.id==keyid_3) {
					Complaint[] temp = customer_temp.c_list;
					for(int j=0;j<temp.length;j++) {
						if(temp[j].cid==cid_1) {
							System.out.println("Status of complaint: "+temp[j].status);
						}
					}
				}
			}
			
			main_menu(DB);
			break;
		case 4:
			System.out.print("Enter Customer Id: ");
			int keyid_4 = sc.nextInt();
			for(int i=0;i<3;i++) {
				Person customer_temp = DB.customerDB[i];
				if(customer_temp.id==keyid_4) {
					Complaint[] temp = customer_temp.c_list;
					Complaint temp_1 = customer_temp.launchComplaint(keyid_4,temp[temp.length-1].cid+1); 
					Complaint[] new_c = new Complaint[temp.length+1];
					for(int a=0;a<temp.length;a++) {
						new_c[a]=temp[a];
					}
					new_c[temp.length]=temp_1;
					DB.customerDB[i].c_list = new_c;
				}
			}
		
			main_menu(DB);
			break;
		}
	
		
	}
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Database DB = new Database();
			main_menu(DB);
			
	}
}
