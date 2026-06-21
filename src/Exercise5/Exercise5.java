package Exercise5;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CategoryManagement categoryManagement = new CategoryManagement();

        while (true) {
            System.out.println("======== MENU ========");
            System.out.println("1. Thêm danh mục");
            System.out.println("2. Hiển thị danh mục");
            System.out.println("3. Cập nhật danh mục");
            System.out.println("4. Xóa danh mục");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch(choice){
                case 1:
                    System.out.println("Thêm danh mục");
                    System.out.print(" Nhập ID danh mục: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.print(" Nhập tên danh mục: ");
                    String name = scanner.nextLine();
                    System.out.print(" Nhập mô tả danh mục: ");
                    String description = scanner.nextLine();
                    categoryManagement.addCategory(new Category(id, name, description));
                    System.out.println("Danh mục đã được thêm ");
                    break;
                case 2:
                    Category[] categories = categoryManagement.findAll();
                    if(categories.length == 0) {
                        System.out.println("Danh sách danh mục trống.");
                        break;
                    }
                    System.out.println("Hiển thị danh mục");
                    for (Category c : categories) {
                        System.out.println(c);
                    }
                    break;
                case 3:
                    categories = categoryManagement.findAll();
                    if(categories.length == 0) {
                        System.out.println("Danh sách danh mục trống.");
                        break;
                    }
                    System.out.println("Cập nhật danh mục");
                    System.out.println(" Nhập ID danh mục cần cập nhật: ");
                    int updateId = Integer.parseInt(scanner.nextLine());
                    System.out.println(" Nhập tên danh mục mới: ");
                    String newName = scanner.nextLine();
                    System.out.println(" Nhập mô tả danh mục mới: ");
                    String newDescription = scanner.nextLine();
                    categoryManagement.updateCategory(new Category(updateId, newName, newDescription));
                    System.out.println("Danh mục đã được cập nhật.");
                    break;
                case 4:
                    categories = categoryManagement.findAll();
                    if(categories.length == 0) {
                        System.out.println("Danh sách danh mục trống.");
                        break;
                    }
                    System.out.println("Xóa danh mục");
                    System.out.println(" Nhập ID danh mục cần xóa: ");
                    int deleteId = Integer.parseInt(scanner.nextLine());
                    categoryManagement.deleteById(deleteId);
                    break;
                case 5:
                    System.out.println("Thoát chương trình.");
                    System.exit(0);
                    return;
                default:
                    System.out.println("Chức năng không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }
}
