public class EmpWage
{
        public static void main(String args[])
        {
                final int isFullTime=1;
		final int isPartTime=2;
                int randomValue=(int)Math.floor(Math.random()*10)%3;
		int empRatePerHr=20;
		int salary;
		int empHrs;
		switch(randomValue)
		{
                case 1:
                        System.out.println("Employee is FullTime Present");
			empHrs=8;
			break;

		case 2:
			System.out.println("Employee is PartTime Present");
                        empHrs=4;
			break;
                default :
                        System.out.println("Employee is Absent");
			empHrs=0;
           	}
		salary=empRatePerHr*empHrs;
		System.out.println("salary="+salary);
        }
}

