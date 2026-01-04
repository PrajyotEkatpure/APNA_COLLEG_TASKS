import java.util.*; 
class Pen{
     
    private String color;
    private float price;
    public Pen(){
        color="";
        price=0.0f;
    }
   public void changeColor(String color){
        this.color=color;

    }
        

    public void changePrice(float price){
        this.price=price;
        
    }
    void showDetails(){
        IO.println("Color :"+color);
        IO.println("Price :"+price);
    }
}
 class classAndObject{
    void main(String[] args) {
        // IO.print("Hello");
        Pen obj=new Pen();
        obj.showDetails();
        obj.changeColor("Yellow");
        obj.changePrice(78.98f);
        obj.showDetails();
    }
}