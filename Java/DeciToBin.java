import java.util.*; 
//DecimalToBinary
// public class DeciToBin {
//     public static void main(String[] args) {
//         int num;
//         System.out.println("Enter the Decimal Number ");
//         num=new Scanner(System.in).nextInt();
//         int bin=0;
//         int pow=1;
//         while(num>0){
//             int rem=num%2;
//             bin=bin+rem*pow;
//             pow=pow*10;
//             num=num/2;

//         }
//         System.out.println(bin);
//     }
// }

// DecimalToOctal
// public class DeciToBin {
//     public static void main(String[] args) {
//         int num;
//         System.out.println("Enter the Decimal Number ");
//         num=new Scanner(System.in).nextInt();
//         int oct=0;
//         int pow=1;
//         while(num>0){
//             int rem=num%8;
//             oct=oct+rem*pow;
//             pow=pow*10;
//             num=num/8;

//         }
//         System.out.println(oct);
//     }
// }

// DecimalTo HexaDecimal
public class DeciToBin {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter the Hex Decimal Number ");
        num=new Scanner(System.in).nextInt();
        int hex=0;
        int pow=1;
        char s;
        String f="";
        while(num>0){
            int rem=num%16;
            if(rem<10) s=(char)(rem+'0');
            else s=(char)(rem-10+'A');
           
            pow=pow*10;
            num=num/16;
            f=s+f;

        }
        System.out.println(f);
    }
}
