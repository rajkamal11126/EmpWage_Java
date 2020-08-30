public class EmpWage
{
        public static void main(String args[])
        {
		int empRatePerHr=20;
		int salary;
		int empHrs;
		int workingDays=20;
		int totalSalary=0;

		for(int i=0; i<=workingDays; i++){
		int randomValue=(int)Math.floor(Math.random()*10)%3;
		switch(randomValue)
		{
                case 1:
			empHrs=8;
			break;

		case 2:
                        empHrs=4;
			break;
                default :
			empHrs=0;
           	}
		salary=empRatePerHr*empHrs;
		totalSalary=totalSalary+salary;
	}
		System.out.println("Total Salary="+totalSalary);
        }
}

