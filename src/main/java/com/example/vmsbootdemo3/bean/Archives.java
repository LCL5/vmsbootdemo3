package com.example.vmsbootdemo3.bean;

public class Archives {
    private String Number;
    private String CarNumber;
    private String CarName;
    private String CarModel;
    private String CarBrand;
    private String PurchaseDate;
    private String CarPrice;

    @Override
    public String toString() {
        return "Archives{" +
                "Number='" + Number + '\'' +
                ", CarNumber='" + CarNumber + '\'' +
                ", CarName='" + CarName + '\'' +
                ", CarModel='" + CarModel + '\'' +
                ", CarBrand='" + CarBrand + '\'' +
                ", PurchaseDate='" + PurchaseDate + '\'' +
                ", CarPrice='" + CarPrice + '\'' +
                '}';
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public String getCarNumber() {
        return CarNumber;
    }

    public void setCarNumber(String carNumber) {
        CarNumber = carNumber;
    }

    public String getCarName() {
        return CarName;
    }

    public void setCarName(String carName) {
        CarName = carName;
    }

    public String getCarModel() {
        return CarModel;
    }

    public void setCarModel(String carModel) {
        CarModel = carModel;
    }

    public String getCarBrand() {
        return CarBrand;
    }

    public void setCarBrand(String carBrand) {
        CarBrand = carBrand;
    }

    public String getPurchaseDate() {
        return PurchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        PurchaseDate = purchaseDate;
    }

    public String getCarPrice() {
        return CarPrice;
    }

    public void setCarPrice(String carPrice) {
        CarPrice = carPrice;
    }
}
