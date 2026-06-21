package Exercise8;

public class Exercise8 {
    public static void main(String[] args) {
        Product product = new Product("Iphone",1000);
        Electronics electronics = new Electronics("Máy sấy tóc",800);
        Clothing clothing =  new Clothing("Áo thun Adiddass",500);
        Food food = new Food("Bún Cá",100);

        System.out.println("Giá của các sản phẩm sau khi chiết khấu :");
        System.out.println(product.getName()+ " :" +product.getFinalPrice());
        System.out.println(electronics.getName()+" :" +electronics.getFinalPrice());
        System.out.println(clothing.getName()+" :" +clothing.getFinalPrice());
        System.out.println(food.getName()+" :" +food.getFinalPrice());

        int stock = 15;
        System.out.println("Giá của các sản phẩm sau khi chiết khấu đựa trên số lượng :"+ stock);
        System.out.println(product.getName()+ " :" +product.getFinalPrice(stock));
        System.out.println(electronics.getName()+" :" +electronics.getFinalPrice(stock));
        System.out.println(clothing.getName()+" :" +clothing.getFinalPrice(stock));
        System.out.println(food.getName()+" :" +food.getFinalPrice(stock));

        stock = 120;
        System.out.println("Giá của các sản phẩm sau khi chiết khấu đựa trên số lượng :"+ stock);
        System.out.println(product.getName()+ " :" +product.getFinalPrice(stock));
        System.out.println(electronics.getName()+" :" +electronics.getFinalPrice(stock));
        System.out.println(clothing.getName()+" :" +clothing.getFinalPrice(stock));
        System.out.println(food.getName()+" :" +food.getFinalPrice(stock));
    }
}
