package solid-master.openclosed;

public class HeadEmployee extends Employee {
    
    public  String EmployeeBranch;


    public HeadEmployee(String EmployeeBranch) {
        this.EmployeeBranch = EmployeeBranch;
    }


    public String getEmployeeBranch() {
        return this.EmployeeBranch;
    }

    public void setEmployeeBranch(String EmployeeBranch) {
        this.EmployeeBranch = EmployeeBranch;
    }


    @Override
    public String toString() {
        return "{" +
            " EmployeeBranch='" + getEmployeeBranch() + "'" +
            "}";
    }

}
