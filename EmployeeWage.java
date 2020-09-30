public class EmployeeWage implements IComputeEmpWage
{
  public static final int FULL_TIME=1;
  public static final int PART_TIME=2;

  private int numOfCompany=0;
  private CompanyEmpWage[] companyEmpWageArray;

  public EmployeeWage()
  {
    companyEmpWageArray=new CompanyEmpWage[5];
  }

  public void addCompanyEmpWage(String company, int rate, int maxDays, int maxHrs)
  {
    companyEmpWageArray[numOfCompany]=new CompanyEmpWage(company, rate, maxDays, maxHrs);
    numOfCompany++;
  }

  private void computeEmpWage()
  {
    for(int i=0;i<numOfCompany;i++)
    {
      companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
      System.out.println(companyEmpWageArray[i]);
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
    }
    return totalEmphrs * companyEmpWage.rate;
  }

  public static void main(String args[])
  {
    EmployeeWage obj=new EmployeeWage();
    obj.addCompanyEmpWage("DMart",20,20,100);
    obj.addCompanyEmpWage("Bigbazar",30,18,110);
    obj.computeEmpWage();
  }

}
