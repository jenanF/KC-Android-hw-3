package com.example.myhw3;

public class Products {

    private String proName;
    private double proPrice;
    private int proImage;

    public Products (String proName, double proPrice, int proImage){

        this.proName=proName;
        this.proPrice=proPrice;
        this.proImage=proImage;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public double getProPrice() {
        return proPrice;
    }

    public void setProPrice(double proPrice) {
        this.proPrice = proPrice;
    }

    public int getProImage() {
        return proImage;
    }

    public void setProImage(int proImage) {
        this.proImage = proImage;
    }
}
