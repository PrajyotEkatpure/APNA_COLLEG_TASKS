import java.util.*; 
public class copy_constructor {
    public static void main(String[] args) {
        Demo d=new Demo();
        d.name="Hello";
        d.arr[0]=10;
        d.arr[1]=20;
        d.arr[2]=30;

        for(int i:d.arr){
            IO.println(i);
        }
        Demo d2=new Demo(d);
        d.arr[2]=99;
        for(int i:d2.arr){
            IO.println(i);
        }

         for(int i:d.arr){
            IO.println(i);
        }
        
    }
}

class Demo{
    String name;
    int arr[];
    
    Demo(){
        arr=new int[3];
        name="";
    }

    Demo(Demo d1){
        arr=new int[3];
        name=d1.name;
        // arr=d1.arr;              //Creates Shallow  Copy Menas changes in one object affects in other objects 
        for(int i=0;i<d1.arr.length;i++){
            this.arr[i]=d1.arr[i];
        }
        //Creates the deep copy so changes in one object does not affect other object
    }
}