import java.util.*;
class Pen{
    private String color;
    private float price;
    private int arr[];

    Pen(String color , float price ){
        this.color=color;
        this.price=price;
        arr=new int[5];
    }
    void setColor(String color){

        this.color=color;
    }
    void setPrice(float price){
        this.price=price;
    }
    int getColor(){
        return this.color;
    }
    int getPrice(){
        return this.price;
    }
}
public class Constructer {
    public static void main(String[] args) {
    

        
    }
}