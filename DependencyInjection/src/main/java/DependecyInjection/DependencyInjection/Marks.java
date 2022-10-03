package DependecyInjection.DependencyInjection;

public class Marks {
	
	private int marks;
	
	private int getMarks() {
		return marks;
	}

	private void setMarks(int marks) {
		this.marks = marks;
	}

	public void display() {
		System.out.println("Marks = "+marks);	
	}
}
