public class EmpWage
{
        public static void main(String args[])
        {
		int empRatePerHr=20;
		int salary;
		int empHrs;
		int workingDays=20;
		int totalSalary=0;
		int maxHrsInMonth=100;
		int totalHours=0;
		int totalWorkingDays=0;
	while (totalHours<maxHrsInMonth && totalWorkingDays < workingDays ){
		totalWorkingDays++;
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
		totalHours=totalHours+empHrs;
		totalSalary=empRatePerHr*totalHours;
	}
		System.out.println("Total Salary="+totalSalary);
        }
}

