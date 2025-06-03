public class Employee {
    private static int idCounter = 1;
    private int id;
    private String fio;
    private int dept;
    private double salary;

    public Employee(String fio, int dept, double salary) {
        this.id = idCounter++;
        this.fio = fio;
        this.dept = dept;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFio() {
        return fio;
    }

    public int getDept() {
        return dept;
    }

    public double getSalary() {
        return salary;
    }

    public void setDept(int dept) {
        this.dept = dept;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDetails() {
        return "Employee{id=" + id + ", fio='" + fio + "', dept=" + dept + ", salary=" + salary + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                dept == employee.dept &&
                Double.compare(employee.salary, salary) == 0 &&
                fio.equals(employee.fio);
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + id;
        result = 31 * result + fio.hashCode();
        result = 31 * result + dept;
        result = 31 * result + Double.hashCode(salary);
        return result;
    }
}