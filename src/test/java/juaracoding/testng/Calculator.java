package juaracoding.testng;

public class Calculator {
    public static int add(int a, int b) {
        return a + b;

    }

    public static int subtract(int a, int b) {
        return  a - b;
    }

    public static int multiply(int a, int b){
        int hasil = 0;
        for (int i = 0; i<b; i++){
            hasil = add(hasil,a);
        }
        return  hasil;
    }
}