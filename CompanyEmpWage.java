public class CompanyEmpWage
{
 public final String company;
 public final int rate;
 public final int maxDays;
 public final int maxHrs;
 public int totalEmpWage;

 public CompanyEmpWage(String company, int rate, int maxDays, int maxHrs)
 {
  this.company=company;
  this.rate=rate;
  this.maxDays=maxDays;
  this.maxHrs=maxHrs;
 }
 public void setTotalEmpWage(int totalEmpWage)
 {
 this.totalEmpWage=totalEmpWage;
 }
 public String toString()
 {
 return "Total EmpWage for Company " +company+" is "+totalEmpWage;
 }
}
