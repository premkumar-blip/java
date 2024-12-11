package javaprogram;
class Student{
	private String Name;
	private int Age;
	private int Rollnumber;
public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this. Name=Name;
	}
  public int getAge() {
	return Age;
}
  public void setAge(int Age) {
	  this.Age=Age;
  }
  public int getRollnumber() {
	  return Rollnumber;
  }
  public void setrollnumber(int Rollnumber) {
	  this.Rollnumber=Rollnumber;
  }
}

public class EncapsulationTask {
	public static void main(String[]args) {
		Student student=new Student();
		student.setName("prem");
		student.setAge(24);
		student.setrollnumber(5432678);
		System.out.println("Name:"+student.getName());
		System.out.println("Age:"+student.getAge());
		System.out.println("RollNumber:"+student.getRollnumber());
	}

}
