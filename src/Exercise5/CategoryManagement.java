package Exercise5;

public class CategoryManagement implements ICRUD {
    Category[] categories = new Category[100];
    private int count = 0;

    @Override
    public Category[] findAll() {
        Category[] result = new Category[count];
        System.arraycopy(categories, 0, result, 0, count);
        return result;
    }
    @Override
    public void addCategory(Category category) {
        if (count < categories.length) {
            categories[count] = category;
            count++;
        } else {
            System.out.println("Mảng đã đầy, không thể thêm danh mục..");
        }
    }

    @Override
    public void updateCategory(Category category) {
        for (int i = 0; i < count; i++) {
            if (categories[i].getId() == category.getId()) {
                categories[i] = category;
                return;
            }
        }
        System.out.println("Không tìm thấy danh mục với ID: " + category.getId());
    }

    @Override
    public void deleteById(int id) {
        for (int i = 0; i < count; i++) {
            if (categories[i].getId() == id)
            {
                for (int j = i; j < count - 1; j++) {
                    categories[j] = categories[j + 1];
                }
                categories[count - 1] = null;
                count--;
                System.out.println("Xóa danh mục thành công.");
                return;
            }
        }
        System.out.println("Không tìm thấy danh mục với ID: " + id);
    }
}
