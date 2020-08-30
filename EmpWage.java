public class EmpWage {

        private String companyName;
        private int empRate;
        private int numOfWorkingDays;
        private int maxHrsInMonth;


        public EmpWage(final String companyName, final int empRate, final int numOfWorkingDays, final int maxHrsInMonth)
        {
                this.companyName = companyName;
                this.empRate = empRate;
                this.numOfWorkingDays = numOfWorkingDays;
                this.maxHrsInMonth = maxHrsInMonth;
        }

        public static void main(String[] args) {
        final EmpWage ewSamsung = new EmpWage("Samsung", 20, 20, 100);
        final int totalSamEmpWages = ewSamsung.computeEmpWage();
        final EmpWage ewWipro = new EmpWage("Wipro", 25, 15, 100);
        final int totalWiproEmpWages = ewWipro.computeEmpWage();
	final EmpWage ewAmazon = new EmpWage("Amazon", 25, 10, 200);
        final int totalAmazonEmpWages = ewAmazon.computeEmpWage();

        System.out.println("Total Emp Wage of Samsung: "+totalSamEmpWages);
        System.out.println("Total Emp Wage of Wipro: "+totalWiproEmpWages);
	System.out.println("Total Emp Wage of Amazon: "+totalAmazonEmpWages);

        }

        /*
         calculate employee daily wages based on type of employee
         */
        public int computeEmpWage() {
                int totalWage = 0;
                int totalEmpHrs = 0;
                int totalWorkingDays = 0;
                while(totalEmpHrs < maxHrsInMonth && totalWorkingDays < numOfWorkingDays){
                        totalWorkingDays++;

                        final int empHrs = getEmpHrs();
                        final int empWage = empHrs*empRate;
                        totalEmpHrs+=empHrs;
                        totalWage+=empWage;
                        //System.out.println("Emp DAY : "+totalWorkingDays+" wages : "+empWage);
                }
                return totalWage;
                //System.out.println("Total emp wage : "+ totalWage);
	}
 	public int getEmpHrs() {

                final int isFullTime = 1;
                final int isPartTime = 2;
                int empHrs = 0;

                final double randomValue = Math.floor(Math.random()*10)%3;

                switch((int)randomValue) {

                        case isFullTime:
                                empHrs = 8;
                                //System.out.println("Emp is present for full time.");
                                break;
                        case isPartTime:
                                empHrs = 4;
                                //System.out.println("Emp is present for part time.");
                                break;
                        default:
                                //System.out.println("Emp is absent");
                                break;
                }
                return empHrs;
        }
}

