package objects;

import org.hibernate.annotations.Generated;

public class Customer {
    @Generated
    private long customerId;
    private String customerName, customerEmailAddress, customerAddress;

    public Customer(String customerName, String customerEmailAddress, String customerAddress) {
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerAddress = customerAddress;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return customerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        this.customerEmailAddress = customerEmailAddress;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", customerEmailAddress='" + customerEmailAddress + '\'' +
                ", customerAddress='" + customerAddress + '\'' +
                '}';
    }
}
