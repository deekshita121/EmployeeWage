public class EmployeeWage
{
 public static final int FULL_TIME=1;
 public static final int PART_TIME=2;

 public static int computeEmpWage(String company, int rate, int maxHrs, int maxDays)
 {
  int totalEmphrs=0;
  int emphrs=0;
  int days=0;
  while(emphrs<maxHrs && days<maxDays)
  {
   days++;
   int check=(int)Math.floor(Math.random()*10 % 3);
   switch(check)
   {
    case FULL_TIME:
    emphrs=8;
    break;
    case PART_TIME:
    emphrs=4;
    break;
    default:
    emphrs=0;
   }
   totalEmphrs +=emphrs;
   System.out.println("Day : "+days+" Emp hr : "+emphrs);
  }
  int totalEmpwage = totalEmphrs * rate;
  System.out.println("Total employee wage for company : "+company+" is "+totalEmpwage);
  return totalEmpwage;
 }

 public static void main(String args[])
 {
   computeEmpWage("DMart", 20, 100, 20);
   computeEmpWage("BigBazar", 30, 110, 18);
 }

}
