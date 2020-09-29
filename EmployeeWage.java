public class EmployeeWage
{
 public static final int FULL_TIME=1;
 public static final int PART_TIME=2;
 public static final int MAX_DAYS=20;
 public static final int MAX_HRS=100;
 public static final int RATE=20;

 public static int computeEmpWage()
 {
  int totalEmphrs=0;
  int emphrs=0;
  int days=0;
  while(emphrs<MAX_HRS && days<MAX_DAYS)
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
  int totalEmpwage = totalEmphrs * RATE;
  System.out.println("Total employee wage is "+totalEmpwage);
  return totalEmpwage;
 }

 public static void main(String args[])
 {
   computeEmpWage();
 }

}
