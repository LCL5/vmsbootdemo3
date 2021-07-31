package com.example.vmsbootdemo3.bean;

public class Scrap {
    private String Number;
    private String CarNumber;
    private String CarName;
    private String CarModel;
    private String ScrapDate;
    private String State;

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

    public String getScrapDate() {
        return ScrapDate;
    }

    public void setScrapDate(String scrapDate) {
        ScrapDate = scrapDate;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    @Override
    public String toString() {
        return "Scrap{" +
                "Number='" + Number + '\'' +
                ", CarNumber='" + CarNumber + '\'' +
                ", CarName='" + CarName + '\'' +
                ", CarModel='" + CarModel + '\'' +
                ", ScrapDate='" + ScrapDate + '\'' +
                ", State='" + State + '\'' +
                '}';
    }
}
