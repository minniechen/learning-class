package com.minnie.learning.seleniun;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaiduTest {

    private WebDriver driver;
    private String baseUrl;
    private StringBuffer verficationErrors= new StringBuffer();

    @Before
    public void setUp() throws Exception{
        driver= new ChromeDriver();
        baseUrl= "http://www.baidu.com/";
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
    }

    @Test
    public void testCase() throws Exception {

        driver.get(baseUrl+"/");
        driver.findElement(By.id("kw")).clear();
        driver.findElement(By.id("kw")).sendKeys("maven test");
        driver.findElement(By.id("su")).click();
        Thread.sleep(2000);
        String title=driver.getTitle();
        assertEquals(title,"maven test_百度搜索");
    }
    @After
    public void tearDown() throws Exception{
        driver.quit();
        String verificationErrorString=verficationErrors.toString();
        if(!"".equals(verificationErrorString)){
          fail(verificationErrorString);
        }
    }

}
