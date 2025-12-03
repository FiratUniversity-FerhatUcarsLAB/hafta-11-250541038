public class Multadd {

    public static void main(String[] args) {
        
        System.out.println("Multadd Testi (1, 2, 3): " + multadd(1.0, 2.0, 3.0));

        
        double sinVal = Math.sin(Math.PI / 4);
        double cosVal = Math.cos(Math.PI / 4) / 2;
        double result1 = multadd(1.0, sinVal, cosVal); 
        System.out.println("Sin/Cos İşlemi Sonucu: " + result1);

        System.out.println("Log İşlemi Sonucu: " + logResult);

        double x = 2.0;
        System.out.println("expSum(" + x + ") Sonucu: " + expSum(x));
    }

    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }

    
    public static double expSum(double x) {
        double eNegX = Math.exp(-x);
        double sqrtPart = Math.sqrt(1.0 - eNegX);
        
    
        return multadd(x, eNegX, sqrtPart);
    }
}
