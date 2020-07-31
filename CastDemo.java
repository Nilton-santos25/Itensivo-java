package intensivo;

public class CastDemo {
    public static void main(String[] args) {
        double x, y, d;
        long l;
        int i;
        byte b;
        char ch;
        
        l = 1020304050L;
        d = l;
        
        d = 10502030802.0;
        // l = d; Erro! 
        l = (long) d; // fazemdo um cast
        
        x = 10.0;
        y = 3.0;
        
        i = (int) (x / y);
        System.out.println(i);
        
        i = 100;
        b = (byte) i;
        System.out.println("Value of b: " + b);
        
        i = 257;
        b = (byte) i;
        System.out.println("Value of b: " + b);
        
        b = 88;
        ch = (char) b;
        System.out.println("ch : " + ch);
        
    }
    
}
