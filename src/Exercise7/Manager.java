package Exercise7;

public class Manager extends Employee{
    private double bonus;

    public Manager() {
    }

    public Manager(String name, String id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    @Override
    public double getSalary(){
        return super.getSalary() + this.bonus ;
    }
    @Override
    public String toString(){
        return "Tên nhân viên : " + getName() + ", Mã số nhân viên :" + getId() + ", Lương cơ bản : " + super.getSalary() + ", Thưởng :" + bonus;
    }

}
