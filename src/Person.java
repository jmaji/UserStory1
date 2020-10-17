import java.util.Arrays;

public class Person implements Customer {
	int id;
    String name;
	Complaint[] c_list;
	
	public Person() {
		
	}

	public Person(int person_id, String name,Complaint[] c_list) {
	// TODO Auto-generated constructor stub
	super();
	this.id = person_id;
	this.name = name;
	this.c_list = c_list;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", c_list=" + Arrays.toString(c_list) + "]";
	}

	@Override
	public Complaint launchComplaint(int id,int cid) {
		// TODO Auto-generated method stub
			Complaint c = new Complaint(true,id,cid);
			return c;
	}



}
