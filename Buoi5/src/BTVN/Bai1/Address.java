package BTVN.Bai1;

import java.util.Scanner;

public class Address {
    private String commune;
    private String district;
    private String city;

    public Address() {
    }

    public Address(String commune, String district, String city) {
        this.commune = commune;
        this.district = district;
        this.city = city;
    }

    public String getCommune() {
        return commune;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter commune name: ");
        commune = scanner.nextLine();
        System.out.print("Enter district name: ");
        district = scanner.nextLine();
        System.out.print("Enter city name: ");
        city = scanner.nextLine();
    }

    public void output() {
        System.out.println("Commune: " + commune);
        System.out.println("District: " + district);
        System.out.println("City: " + city);
        System.out.println("---------------------");
    }
}
