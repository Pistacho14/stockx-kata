package edu.estatuas.item;

public class Bid implements Offer{

    String size;
    Integer value;

    public Bid(String size, Integer value){
        this.size = size;
        this.value = value;
    }

    public String getSize() {
        return this.size;
    }

    public Integer getValue() {
        return this.value;       
    }

    @Override
    public String toString() {
        return this.size + this.value.toString();
    }
}