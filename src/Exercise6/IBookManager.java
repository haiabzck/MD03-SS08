package Exercise6;

public interface IBookManager {
    void addBook(Book book); // Thêm một quyển sách mới
    void removeBook(String isbn); // Xóa một quyển sách theo mã ISBN
    void displayBooks(); // Hiển thị danh sách các quyển sách
}
