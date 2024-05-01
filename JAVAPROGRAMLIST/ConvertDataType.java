public class ConvertDataType {
    public static void main(String[] args){  
        byte x = 7;    
        short y = x;  
        int z = x;
        short a =(short)z; //int cannot be converted to short dirextly
        long b = z;
        float c = b;
        int d = (int)c;
        System.out.println(x);  
        System.out.println(y);  
        System.out.println(z);  
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);



    }  

}
