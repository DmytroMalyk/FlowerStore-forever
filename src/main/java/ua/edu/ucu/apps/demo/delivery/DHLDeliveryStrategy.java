package ua.edu.ucu.apps.demo.delivery;

public class DHLDeliveryStrategy implements Delivery {
    private String adress;

    @Override
    public String getAddress() {
        return this.adress;
    }

    @Override
    public void setAddress(String address) {
        this.adress = address;
    }

    @Override
    public String getdeliveryNotification() {
        return "Delivered with DHL";
    }
    
}
