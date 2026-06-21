package Exercise7;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Employee employee = new Employee("Hải","E01",2000);
        Manager manager = new Manager("Hiền","M01",3000,200);
        Developer developer = new Developer("Toàn", "D01",1500,"PHP");

        System.out.println("Lương của nhân viên :" + employee.getSalary());
        System.out.println("Lương của quản lý :" + manager.getSalary());
        System.out.println("Lương của lập trình viên :" + developer.getSalary());

        System.out.println(employee);
        System.out.println(manager);
        System.out.println(developer);

        developer.increaseSalary(1.5);
        System.out.println("Thông tin nhân viên được tăng lương :");
        System.out.println(developer);

    }
}
