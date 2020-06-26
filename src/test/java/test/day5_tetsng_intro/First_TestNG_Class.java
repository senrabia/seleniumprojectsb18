package test.day5_tetsng_intro;
//16:30
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class First_TestNG_Class {
    @BeforeMethod
    public void setUp(){
        System.out.println("Before Metod Runing");
    }
    @Test
    public void test1(){
        System.out.println("test1 is running...");

    }
    @Test
    public void test2(){
        System.out.println("test2 is running...");
    }
}
