package Test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstTest {
    private WebDriver driver;
    private final String BASE_URL = "http://localhost/clickmebaby.php";


    @Before
    public void setUp(){
        driver = new FirefoxDriver();

    }

    @Test
    public void test(){
        driver.get(BASE_URL);
        Assert.assertEquals("0", driver.findElement(By.id("clicks")).getText());
        Assert.assertEquals("klikov", driver.findElement(By.className("description")).getText());

        for (int i = 1; i < 11; i++) {
            driver.findElement(By.id("clickMe")).click();
            Assert.assertEquals(String.valueOf(i), driver.findElement(By.id("clicks")).getText());
            if (i==1){
                Assert.assertEquals("klik", driver.findElement(By.className("description")).getText());
            }
            if (i==2 && i<=4){
                Assert.assertEquals("kliky", driver.findElement(By.className("description")).getText());
            }
            if (i>4){
                Assert.assertEquals("klikov", driver.findElement(By.className("description")).getText());
            }
        }

    }

    @After
    public void tearDown(){

    }

}
