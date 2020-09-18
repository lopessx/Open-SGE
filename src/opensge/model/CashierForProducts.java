/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opensge.model;

/**
 *
 * @author emanuel
 */
public class CashierForProducts {
    
    //Attributes
    private int idProduct, idCashier, id, quantityProducts;
    private double total_price;

    //Constructor
    public CashierForProducts() {
    }

    //Getters
    public int getId() {
        return id;
    }

    public int getIdCashier() {
        return idCashier;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public int getQuantityProducts() {
        return quantityProducts;
    }

    public double getTotal_price() {
        return total_price;
    }

    //Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setIdCashier(int idCashier) {
        this.idCashier = idCashier;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public void setQuantityProducts(int quantityProducts) {
        this.quantityProducts = quantityProducts;
    }

    public void setTotal_price(double total_price) {
        this.total_price = total_price;
    }
    
    
    
}
