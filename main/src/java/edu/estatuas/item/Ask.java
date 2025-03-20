package edu.estatuas.item;

public class Ask implements Offer{
    
    String size;
    Interger ask;

    public Ask(String size, Interger ask) {
        this.size = size;
        this.ask = ask;
    }

    public Interger getAsk() {
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
