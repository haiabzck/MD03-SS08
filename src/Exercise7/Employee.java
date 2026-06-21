package Exercise7;

public class Employee {
    private String name;
    private String id;
    private double salary;

    public Employee() {
    }

    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getSalary() {
        return this.salary;
    }

    public void increaseSalary(double amount){
         salary = salary * amount;
    }

    @Override
    public String toString(){
        return "Tên nhân viên : " + name + ", Mã số nhân viên :" + id +  ", Lương :" +salary;
    }
}
