package hello.itemservice.item;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class Item {

    private Long id;
    private String itemName;
    private Integer price; //null 값도 받을 수 있도록 int가 아니가 Integer로
    private Integer quantity;

    public Item() {
    }

    public Item(String itemName, Integer price, Integer quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}
