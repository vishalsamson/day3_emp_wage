package emp_wage;

public class Emp_wages {
	public static void main(String[] args) {
		int is_full_time=1;
		double empcheck=Math.floor(Math.random()*10)%2;
		if (empcheck==is_full_time)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is absent");
			
		
	}

}
