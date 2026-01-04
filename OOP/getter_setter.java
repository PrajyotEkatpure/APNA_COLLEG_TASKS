import java.util.*; 
public class getter_setter {
    public static void main(String[] args) {
        int[] vect={10,20,30,40,50};

    Demo d=new Demo();
    d.setName("Prajyot");
    d.setVal(10.2f);
    d.setVector(vect);

    System.out.println("Name :"+d.getName());
    IO.println("Value :"+d.getVal());
    d.getVector();
        
    }
}
class Demo{
    private String name;
    private int vect[];
    private float val;
    public void setName(String name){
        this.name=name;
    }
     public void setVal(float val){
        this.val=val;

    }
     public void setVector(int[] vect){
       
            this.vect=vect;
        

    }

    public void getVector(){
        for(int i:vect)
        IO.print("["+i+"] ");

    }
    public String getName(){
        return name;
        // return this.name;

    }
    public float getVal(){
        return this.val;

    }
}