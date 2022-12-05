package Employee_List.entities;

public class EmployeeList {

    private final Integer id;
    private final String name;
    private Double salary;
    public EmployeeList(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void increaseSalary(double percent){
        salary += salary * percent / 100.0;
    }

    @Override
    public String toString() {
        return id + ", " + name + ", " + String.format("%.2f", salary);
    }
}
