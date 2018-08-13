package structuralPattern.proxy;

import java.sql.PreparedStatement;
import java.util.List;

public class BacketLogerProxy implements Basket{
    private final RealBasket realBasket;

    public BacketLogerProxy(RealBasket realBasket) {
        this.realBasket = realBasket;
    }


    @Override
    public void addProduct(Product product) {
        System.out.println("uzytkownik usunal produkt" + product);
    }

    @Override
    public void removeProduct(Product product) {
        System.out.println("uzytkownik usunal produkt " + product);
    }

    @Override
    public List<Product> getProduct() {
        return null;
    }
}
