package Test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstTest {
    WebDriver driver;


    @Before
    public void setUp(){
        driver = new FirefoxDriver();

    }

    @Test
    public void test(){
        driver.get("https://www.facebook.com/");

    }

    @After
    public void tearDown(){

    }

}
