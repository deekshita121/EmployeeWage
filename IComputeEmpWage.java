public interface IComputeEmpWage
{
  public void addCompanyEmpWage(String company, int rate, int maxDays, int maxHrs);
  public void computeEmpWage();
  public int getTotalWage(String company);
}
