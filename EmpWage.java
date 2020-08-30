public class EmpWage
{
        public static void main(String args[])
        {
                final int isFullTime=1;
                final double randomValue=Math.floor(Math.random()*10)%2;
                if(randomValue==isFullTime)
                {
                        System.out.println("Employee is Present");

                }
                else
                {
                        System.out.println("Employee is Absent");
                }
        }
}
