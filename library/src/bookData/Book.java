package bookData;

import java.util.ArrayList;
import java.util.List;

public class Book {
    private String name;
    private String category;
    private int price;

    Book(String name, String category, int price) {
        this.name = name;
        this.category = category;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public String getCategory() {
        return category;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price){
        this.price =  price;
    }
    @Override
    public String toString() {
        return "제목 " + name + " 카테고리 " + category + "가격 " + price;
    }
}
