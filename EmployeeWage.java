import java.util.*;
public class EmployeeWage implements IComputeEmpWage
{
  public static final int FULL_TIME=1;
  public static final int PART_TIME=2;

  private LinkedList<CompanyEmpWage> companyEmpWageList;
  private Map<String,CompanyEmpWage> companyToEmpWageMap;

  public EmployeeWage()
  {
    companyEmpWageList=new LinkedList<>();
    companyToEmpWageMap=new HashMap<>();
  }

  public void addCompanyEmpWage(String company, int rate, int maxDays, int maxHrs)
  {
    CompanyEmpWage companyEmpWage=new CompanyEmpWage(company, rate, maxDays, maxHrs);
    companyEmpWageList.add(companyEmpWage);
    companyToEmpWageMap.put(company, companyEmpWage);
  }

  public void computeEmpWage()
  {
    for(int i=0;i<companyEmpWageList.size();i++)
    {
      CompanyEmpWage companyEmpWage=companyEmpWageList.get(i);
      companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
      System.out.println(companyEmpWage);
    }
  }

  private int computeEmpWage(CompanyEmpWage companyEmpWage)
  {
    int totalEmphrs=0;
    int emphrs=0;
    int days=0;
    while(emphrs<companyEmpWage.maxHrs && days<companyEmpWage.maxDays)
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
      int empWage=emphrs * companyEmpWage.rate;
      System.out.println("Wage for day "+days+" is "+empWage);
    }
    return totalEmphrs * companyEmpWage.rate;
  }
  public int getTotalWage(String company)
  {
    return companyToEmpWageMap.get(company).totalEmpWage;
  }

  public static void main(String args[])
  {
    IComputeEmpWage employeeWage=new EmployeeWage();
    employeeWage.addCompanyEmpWage("DMart",20,20,100);
    employeeWage.addCompanyEmpWage("Bigbazar",30,18,110);
    employeeWage.computeEmpWage();
    System.out.println("Total Wage for DMart Company: "+employeeWage.getTotalWage("DMart"));
  }

}
