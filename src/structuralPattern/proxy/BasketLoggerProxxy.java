package structuralPattern.proxy;

import java.util.List;

public class BasketLoggerProxxy implements Basket {
    public BasketLoggerProxxy(RealBasket realBasket) {
    }

    @Override
    public void addProduct(Product product) {

    }

    @Override
    public void removeProduct(Product product) {

    }

    @Override
    public List<Product> getProduct() {
        return null;
    }
}
