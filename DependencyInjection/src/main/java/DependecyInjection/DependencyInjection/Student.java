package DependecyInjection.DependencyInjection;

public class Student {
	
	private int id;
	private String name;
	private String address;
	private Marks marks;
	
	private Marks getMarks() {
		return marks;
	}
	private void setMarks(Marks marks) {
		this.marks = marks;
	}
	private int getId() {
		return id;
	}
	private void setId(int id) {
		this.id = id;
	}
	private String getName() {
		return name;
	}
	private void setName(String name) {
		this.name = name;
	}
	private String getAddress() {
		return address;
	}
	private void setAddress(String address) {
		this.address = address;
	}
	
	public void display() {
		System.out.println("id = "+id);
		System.out.println("name = "+name);
		System.out.println("marks = "+marks);
		System.out.println("address = "+address);
		marks.display();
	
	}
}
