package com.example.hw4;

public class Currency {
    public int drawable;
    public String abrivationName;
    public String detaildName;
    public String sellPrice;
    public String buyPrice;

    public Currency(int image, String abrivationName, String detaildName, String sellPrice, String buyPrice) {
        this.drawable = image;
        this.abrivationName = abrivationName;
        this.detaildName = detaildName;
        this.sellPrice = sellPrice;
        this.buyPrice = buyPrice;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "abrivationName='" + abrivationName + '\'' +
                ", detaildName='" + detaildName + '\'' +
                ", sellPrice='" + sellPrice + '\'' +
                ", buyPrice='" + buyPrice + '\'' +
                '}';
    }
}
