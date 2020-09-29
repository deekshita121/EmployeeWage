public class EmployeeWage
{
 public static final int FULL_TIME=1;
 public static final int PART_TIME=2;

 private final String company;
 private final int rate;
 private final int maxHrs;
 private final int maxDays;
 private int totalEmpWage;

 public EmployeeWage(String company, int rate, int maxDays, int maxHrs)
 {
  this.company=company;
  this.rate=rate;
  this.maxDays=maxDays;
  this.maxHrs=maxHrs;
 }
 public void computeEmpWage( )
 {
  int totalEmphrs=0;
  int emphrs=0;
  int days=0;
  while(emphrs<maxHrs && days<maxDays)
  {
   days++;
   int check=(int)Math.floor(Math.random()*10) % 3;
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
  totalEmpWage = totalEmphrs * rate;
 }

 public String toString()
 {
  return "Total employee wage for company "+company+" is "+totalEmpWage;
 }

 public static void main(String args[])
 {
  EmployeeWage obj1=new EmployeeWage("DMart",20,20,100);
  EmployeeWage obj2=new EmployeeWage("Bigbazar",30,18,110);
  obj1.computeEmpWage();
  System.out.println(obj1);
  obj2.computeEmpWage();
  System.out.println(obj2);
 }

}
