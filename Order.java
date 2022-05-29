
package projectoop;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Scanner;


public class Order {
    public String codeOrder;
    public String idStaff;
    public String nameOfCustomer;
    public String phoneOfCustomer;
    public SimpleDateFormat Date;
    public int numOfProducts;
    public String status;
    public long totalOrder;
        
    public String getCodeOrder() {
        return codeOrder;
    }

    public void setCodeOrder(String codeOrder) {
        this.codeOrder = codeOrder;
    }

    public String getIdStaff() {
        return idStaff;
    }

    public void setIdStaff(String idStaff) {
        this.idStaff = idStaff;
    }

    public String getNameOfCustomer() {
        return nameOfCustomer;
    }

    public void setNameOfCustomer(String nameOfCustomer) {
        this.nameOfCustomer = nameOfCustomer;
    }

    public String getPhoneOfCustomer() {
        return phoneOfCustomer;
    }

    public void setPhoneOfCustomer(String phoneOfCustomer) {
        this.phoneOfCustomer = phoneOfCustomer;
    }

    public SimpleDateFormat getDate() {
        return Date;
    }

    public void setDate(SimpleDateFormat Date) {
        this.Date = Date;
    }

    public int getNumOfProducts() {
        return numOfProducts;
    }

    public void setNumOfProducts(int numOfProducts) {
        this.numOfProducts = numOfProducts;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public long getTotalOrder() {
        return totalOrder;
    }

    public void setTotalOrder(long totalOrder) {
        this.totalOrder = totalOrder;
    }
    

    
    public void createOrder(){
    }


}
