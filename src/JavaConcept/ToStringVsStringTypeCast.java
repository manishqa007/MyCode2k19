package JavaConcept;

class Demo{
	String name;
	int roll;
	public Demo(String name,int roll) {
		this.name=name;
		this.roll=roll;
	}
	public String toString() {
		return this.name;
	}
}

class student extends Demo{
	String fname;
	public student(String name, int roll,String fname){
		super(name,roll);
		this.fname=fname;
	}
	
	public String toString() {
		return this.fname+this.roll+this.name;
	}
}
public class ToStringVsStringTypeCast {

	public static void main(String[] args) {
		
		Demo d1=new Demo("ravindara",36);
		System.out.println(d1);
		
		student s1=new student("test",34,"father name");
		Object d2=(Object)s1;
		
		
		System.out.println(d2);
		
		
		
		
	}

}
