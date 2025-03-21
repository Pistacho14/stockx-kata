package edu.estatuas.item;

public class Ask implements Offer{
    
    String size;
    Integer ask;

    public Ask(String size, Integer ask) {
        this.size = size;
        this.ask = ask;
    }

    public Integer getAsk() {
        return this.ask;
    }

    public String getSize() {
        return this.size;
    }

    @Override
    public String toString() {
        return this.size + this.ask.toString();
    }
}
