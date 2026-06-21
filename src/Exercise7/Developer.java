package Exercise7;

public class Developer extends Employee{
    private String programmingLanguage;

    public Developer() {
    }

    public Developer(String name, String id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public double getSalary(){
        return super.getSalary();
    }
    @Override
    public String toString(){
        return "Tên nhân viên : " + getName() + ", Mã số nhân viên :" + getId() + ", Lương cơ bản : " + getSalary() + ", Ngôn ngữ  :" + programmingLanguage;
    }
}
