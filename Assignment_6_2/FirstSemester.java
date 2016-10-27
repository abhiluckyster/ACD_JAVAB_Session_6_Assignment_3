package Assignment_6_2;

public class FirstSemester extends Student implements Result{
	 String sub1,sub2;
	 float mark1,mark2;
	public FirstSemester(int rollNo, int regNo, String name) {
		super(rollNo, regNo, name);
		// TODO Auto-generated constructor stub
	}
	public void getSubject() {
		// TODO Auto-generated method stub
	sub1="Computational Organization";
	sub2="Theory of Automta";
	}

	public void showResult() {
		System.out.println("\nName: " + name + "\nRoll = " + rollNo + "\nRegistration no: " + regNo + "\n" + sub1 + "   marks: " + mark1+ "\n" + sub2 + "   marks: " + mark2 + "\npercentage marks: " + calpercentage());
	}
	
	public void setMarks(float mark1, float mark2) {
		// TODO Auto-generated method stub
		this.mark1=mark1;
		this.mark2=mark2;
	}

	public float calpercentage() {
		// TODO Auto-generated method stub
		float per=(mark1+mark2)/2;
		return per;
	}

}
