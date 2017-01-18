//
public class TesterSub extends Tester{
	private String occupation;
	private double salary;
	private double spouseIncome;
	private boolean isMarried;
	private double householdIncome;
	public TesterSub(String name, int age, String gender, double salary, double spouseIncome, boolean isMarried){
		//
		super(name, age, gender);
		this.salary = salary;
		this.spouseIncome = spouseIncome;
		this.isMarried = isMarried;
		householdIncome = 0;
	}
	public double calculateHouseholdIncome(){
		if (isMarried == true)
		householdIncome = salary + spouseIncome;
		return householdIncome;
	}
	//
	public String toString(){
	    //
		return super.toString() +", occupation: " + occupation + ", household income: " + householdIncome;
	}
}
