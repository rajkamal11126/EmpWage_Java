public class EmpWage
{
        public static void main(String args[])
        {
                final int isFullTime=1;
                final double randomValue=Math.floor(Math.random()*10)%2;
		int empRatePerHr=20;
		int salary;
		int empHrs;

                if(randomValue==isFullTime)
                {
                	System.out.println("Employee is Present");
			empHrs=8;

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

