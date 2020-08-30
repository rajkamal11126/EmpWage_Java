public class EmpWage
{
        public static void main(String args[])
        {
                final int isFullTime=1;
		final int isPartTime=2;
                final double randomValue=Math.floor(Math.random()*10)%3;
		int empRatePerHr=20;
		int salary;
		int empHrs;

                if(randomValue==isFullTime)
                {
                        System.out.println("Employee is FullTime Present");
			empHrs=8;

                }
		else if(randomValue==isPartTime)
		{
			System.out.println("Employee is PartTime Present");
                        empHrs=4;

		}
                else
                {
                        System.out.println("Employee is Absent");
			empHrs=0;
                }
		salary=empRatePerHr*empHrs;
		System.out.println("salary="+salary);
        }
}

