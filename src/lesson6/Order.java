package lesson6;

import java.util.Date;

public class Order {

    long id;
    int price;
    Date dateCreated;
    boolean isConfirmed;
    boolean confirmed;
    Date dateConfirmed;
    String city;
    String country;
    String type;

    public Order(int price, Date dateCreated, boolean isConfirmed, Date dateConfirmed, String city, String country, String type) {
        this.price = price;
        this.dateCreated = dateCreated;
        this.isConfirmed = isConfirmed;
        this.dateConfirmed = dateConfirmed;
        this.city = city;
        this.country = country;
        this.type = type;
    }

    public Order() {

    }

   public void confirmOrder() {

        if (isConfirmed == false) {
            isConfirmed = true;
            dateConfirmed = new Date();
        }

    }

    public boolean checkPrice() {
        return price > 1000 ? true : false;
    }

    public boolean isValidType() {
        if (type == "Buy" || type == "Sale")
            return true;
        else
            return false;
    }
}
