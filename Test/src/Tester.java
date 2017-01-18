
public class Tester {
	//
	protected String name;
	protected int age;
	protected String gender;

	public Tester(String name, int age, String gender){
		this.name = name;
	    this.age = age;
	    this.gender = gender;
	}
	public String toString(){
		    return name + ", age: " + age + ", gender: " + gender;
	}
}