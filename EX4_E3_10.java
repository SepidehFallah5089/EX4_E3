import java.util.ArrayList;

// کلاس برای نمایش مشخصات یک آیتم
class Item {
    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return name + ": $" + price;
    }
}

// کلاس مدیریت صندوق پرداخت
class CashRegister {
    private ArrayList<Item> items;

    public CashRegister() {
        items = new ArrayList<>();
    }

    public void addItem(String name, double price) {
        Item item = new Item(name, price);
        items.add(item);
    }

    public void printReceipt() {
        System.out.println("Receipt:");
        for (Item item : items) {
            System.out.println(item);
        }
        System.out.println("Total: $" + getTotal());
    }

    private double getTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }
}

// کلاس اصلی برای اجرای برنامه
public class EX4_E3_10 {
    public static void main(String[] args) {
        CashRegister register = new CashRegister();
        register.addItem("Milk", 1.99);
        register.addItem("Bread", 2.49);
        register.addItem("Eggs", 3.79);

        register.printReceipt();
    }
}