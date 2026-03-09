package product.org;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ProductDTO {
    private String name;
    private int price;
    private LocalDate mfd;

    public ProductDTO(String name,int price,LocalDate mfd){
        this.mfd = mfd;
        this.name = name;
        this.price = price;
    }

}
