public class Employee {
//private fields for code
    private String name;
    private int employeeId;
    String department;
    private double hourlyWage;
    private double hoursworked;
//constructor
    public Employee(String name, int employeeId, String department, double hourlyWage, double hoursworked) {
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
        this.hourlyWage = hourlyWage;
        this.hoursworked = hoursworked;

    }
    //getter and setter
    public String getName() {
        return name;

    }
    public int getEmployeeId() {
        return employeeId;
    }
    public String getDepartment() {
        return department;

    }
    public double getHourlyWage() {
        return hourlyWage;

    }
    public double getHoursworked() {
        return hoursworked;

    }
    public void setName(String name) {
        this.name = name;

    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public void setDepartment(String department) {
        this.department = department;

    }
    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }
    public void setHoursworked(double hoursworked) {
        this.hoursworked = hoursworked;
    }

}



