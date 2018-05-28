package pojo;

public class Company
{
    private String compid;

    private Employees[] employees;

    public String getCompid ()
    {
        return compid;
    }

    public void setCompid (String compid)
    {
        this.compid = compid;
    }

    public Employees[] getEmployees ()
    {
        return employees;
    }

    public void setEmployees (Employees[] employees)
    {
        this.employees = employees;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [compid = "+compid+", employees = "+employees+"]";
    }
}