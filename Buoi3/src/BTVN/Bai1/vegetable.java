package BTVN.Bai1;

public class vegetable {

    private String id;
    private String name;
    private String unit;
    private int quantitySold;
    private int sale;
    private double price;
    private static int ID = 1;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getQuantitySold() {
        return quantitySold;
    }

    public void setQuantitySold(int quantitySold) {
        this.quantitySold = quantitySold;
    }

    public int getSale() {
        return sale;
    }

    public void setSale(int sale) {
        this.sale = sale;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public vegetable() {
    }

    public vegetable(String id, String name, String unit, int quantitySold, double price) {
        this.id = id;
        this.name = name;
        this.unit = unit;
        this.quantitySold = quantitySold;
        this.price = price;
    }

    public double getTotalRevenue() {
        return quantitySold * (price - price * sale / 100);
    }

    public void display() {
        System.out.printf("%-12s %-25s %-12s %-18d %-8d %-15f  %-20f", id, name, unit, quantitySold, sale, price, getTotalRevenue());
        System.out.println();
    }

}