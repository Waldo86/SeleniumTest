package Test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstTest {
    private WebDriver driver;
    private final String BASE_URL = "https://www.facebook.com";


    @Before
    public void setUp(){
        driver = new FirefoxDriver();

    }

    @Test
    public void test(){
        driver.get(BASE_URL);

    }

    @After
    public void tearDown(){

    }

}
