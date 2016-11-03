package com.china.hello;

/**
 * Created by haixing on 2016/11/2.
 */
public class Computer implements  W3C{
    private int id;
    private String brand;
    private double price;

    public Computer(int id, String brand,double price) {
        this.price = price;
        this.id = id;
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Computer computer = (Computer) o;

        return id == computer.id;

    }

    @Override
    public int hashCode() {
        try {
            return id;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("putIfabsent");
        }

        return id;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
