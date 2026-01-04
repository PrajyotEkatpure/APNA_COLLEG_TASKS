import java.util.*; 
//Bin to Decimal
// public class BinaryToDeci {
//     public static void main(String[] args) {
//         int num=101;
//         double deci=0;
//         double po=1;
//         while(num>0){
//             int rem=num%10;
//             deci=deci+rem*po;
//             po=po*2;
//             num=num/10;   
//         }
//         System.out.println(deci);
        
//     }
// }

//Octal to Decimal
// public class BinaryToDeci {
//     public static void main(String[] args) {
//         int num=101;
//         double oct=0;
//         double po=1;
//         while(num>0){
//             int rem=num%10;
//             oct=oct+rem*po;
//             po=po*8;
//             num=num/10;   
//         }
//         System.out.println(oct);
        
//     }
// }

//Hexa to Decimal
public class BinaryToDeci {
    public static void main(String[] args) {
        int num=101;
        double deci=0;
        double po=1;
        while(num>0){
            int rem=num%10;
            deci=deci+rem*po;
            po=po*16;
            num=num/10;   
        }
        System.out.println(deci);
        
    }
}