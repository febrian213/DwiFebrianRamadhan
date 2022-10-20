package juaracoding.testng;

import static org.testng.Assert.*;
import org.testng.annotations.*;

public class TestCalculator {

    @Test
    public void multiplyTest(){
        int a= 2;
        int b= 3;
        int actual = Calculator.multiply(a, b);

        int expected = 6;
        System.out.println("Menguji method multyply().");
        assertEquals(actual, expected, "Kalkulator tidak dapat menghitung perkalian dengan benar.");
    }
    @Test
    public void addTest(){
        int a= 12;
        int b= 34;
        int actual = Calculator.add(a, b);

        int expected = 46;
        System.out.println("Menguji method add().");
        assertEquals(actual, expected, "Kalkulator tidak dapat menghitung penjumlahan dengan benar.");
    }

    @Test
    public void subtractTest(){
        int a= 12345;
        int b= 5678;
        int actual = Calculator.subtract(a,b);

        int expected = -4444;
        System.out.println("Menguji method subtract().");
        assertEquals(actual, expected, "Kalkulator tidak dapat menghitung pengurangan dengan benar.");
    }

    @BeforeMethod
    public  void  beforeMethod(){
        System.out.println("Menjalankan Before Method");
    }

    @AfterMethod
    public  void  afterMethod(){
        System.out.println("Menjalankan After Method");
    }

    @BeforeClass
    public  void  beforeClass(){
        System.out.println("Menjalankan Before Class");
    }

    @AfterClass
    public  void  afterClass(){
        System.out.println("Menjalankan After Class");
    }

    @BeforeTest
    public  void  beforeTest(){
        System.out.println("Menjalankan Before Test");
    }

    @AfterTest
    public  void  afterTest(){
        System.out.println("Menjalankan After Test");
    }

    @BeforeSuite
    public  void  beforeSuite(){
        System.out.println("Menjalankan Before Suite");
    }

    @AfterSuite
    public  void  afterSuite(){
        System.out.println("Menjalankan after Suite");
    }
}
