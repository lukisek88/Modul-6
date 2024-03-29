package com.kodilla.good.patterns.food2door;

public class GlutenFreeProduct extends Product {
    private String productDescription;

    public GlutenFreeProduct(String productName, String productDescription) {
        super(productName);
        this.productDescription = productDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        GlutenFreeProduct that = (GlutenFreeProduct) o;

        return productName.equals(that.productName);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + productDescription.hashCode();
        return result;
    }
}