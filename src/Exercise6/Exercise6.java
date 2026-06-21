package Exercise6;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookManager bookManager = new BookManager();
        while (true){
            System.out.println("====== MENU ======");
            System.out.println("1. Thêm sách ");
            System.out.println("2. Hiển thị sách");
            System.out.println("3. Xóa sách");
            System.out.println("4. Thoát");
            System.out.print("Chọn chức năng :");

            int choie = Integer.parseInt(scanner.nextLine());

            switch (choie){
                case 1:
                    System.out.print("Nhập tiêu đề :");
                    String titel = scanner.nextLine().trim();
                    System.out.print("Nhập tác giả :");
                    String name = scanner.nextLine().trim();
                    System.out.print("Nhập ISBN :");
                    String isbn = scanner.nextLine().trim();
                    System.out.print("Nhập năm xuất bản :");
                    int year = Integer.parseInt(scanner.nextLine());
                    bookManager.addBook(new Book(titel,name,isbn,year));
                    System.out.println("Thêm thành công");
                    break;
                case 2:
                    System.out.println("Danh sách sách :");
                    bookManager.displayBooks();
                    break;
                case 3:
                    System.out.print("Nhập ISBN cần xóa :");
                    String isbnRemove = scanner.nextLine();
                    bookManager.removeBook(isbnRemove);
                    break;
                case 4:
                    System.out.println("Thoát chương trình !");
                    return;
                default:
                    System.out.println("Chọn sai chức năng . Vui lòng chọn (1-4)");
            }

        }
    }
}
