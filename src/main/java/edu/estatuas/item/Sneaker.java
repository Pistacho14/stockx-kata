package edu.estatuas.item;

public class Sneaker implements Item{

    private final String style;
    private final String name;
    private int sale;
    private int ask;
    private int bid;
    
    
    public Sneaker(String style, String name) {
        this.style = style;
        this.name = name;
    }

    public String getStyle(){
        return this.style;
    }

    @Override
    public int getBid() {
        return 0;
    }

    @Override
    public int getAsk() {
        return 0;
    }

    @Override
    public int getSale() {
        return 0;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return getName() + "\n\t\t" + getStyle();
    }
}