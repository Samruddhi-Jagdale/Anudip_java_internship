public class MobilePhone {
    // Fields
    String brand;
    String model;
    int price;

    // Method to assign and display values
    void showDetails(String b, String m, int p) {
        brand = b;
        model = m;
        price = p;

        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: ₹" + price);
    }

    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone();
        phone.showDetails("Apple", "iPhone 14", 79999);
    }
}
