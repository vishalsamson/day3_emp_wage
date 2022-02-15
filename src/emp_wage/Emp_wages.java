package emp_wage;

public class Emp_wages {
	public static final int is_full_time=2;
	public static final int is_part_time=1;
	public static final int emp_rate_per_hour=20;
	public static final int num_of_working_days=20;
	public static final int max_hrs_in_month=10;
	
	public static void main(String[] args) {
		int emphrs=0,totalemphrs=0, totalworkingdays=0;
		while(totalemphrs<=max_hrs_in_month && totalworkingdays<num_of_working_days) {
			totalworkingdays++;
			int empcheck= (int) Math.floor(Math.random()*10)%3;
			switch (empcheck) {
			case is_part_time:
				emphrs=4;
				break;
			case is_full_time:
				emphrs=8;
				break;
			default:
				emphrs=0;

		    }
			totalemphrs+=emphrs;
			System.out.println("day#: " + totalworkingdays+ "emphrs" + emphrs);
		}
		int totalempwage=totalemphrs*emp_rate_per_hour;
		System.out.println("Total emp wage: "+totalempwage);
		
		
		
			
		
	}

}
