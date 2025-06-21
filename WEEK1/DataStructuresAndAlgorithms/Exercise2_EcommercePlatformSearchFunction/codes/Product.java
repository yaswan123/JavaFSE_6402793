package WEEK1.DataStructuresAndAlgorithms.Exercise2_EcommercePlatformSearchFunction.codes;import java.util.*;
class Product {
    int productId;
    String productName;
    String category;
    Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }
    public String toString() {
        return productId + " - " + productName + " (" + category + ")";
    }
    public static Product linear(List<Product> products, int targetId) {
        for (Product p : products) {
            if (p.productId == targetId) return p;
        }
        return null;
    }
    public static Product binary(List<Product> products, int targetId) {
        int left = 0, right = products.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            Product p = products.get(mid);
            if (p.productId == targetId) return p;
            else if (p.productId < targetId) left = mid + 1;
            else right = mid - 1;
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine();
        List<Product> products = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for product " + (i + 1));
            System.out.print("Product ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Product Name: ");
            String name = sc.nextLine();
            System.out.print("Category: ");
            String category = sc.nextLine();
            products.add(new Product(id, name, category));
        }
        System.out.print("Enter product ID to search Linear Search: ");
        int linearId = sc.nextInt();
        Product res1 = linear(products, linearId);
        System.out.println(res1 != null ? res1 : "Product not found using linear search");
        products.sort(Comparator.comparingInt(p -> p.productId));
        System.out.print("Enter product ID to search Binary Search: ");
        int binaryId = sc.nextInt();
        Product res2 = binary(products, binaryId);
        System.out.println(res2 != null ? res2 : "Product not found using binary search");
        sc.close();
    }
}
