import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Index {
    WebDriver wd;
    @BeforeClass
    public void setUp(){
        wd = new ChromeDriver();
        wd.get("http://telranedu.web.app/login");
    }
    @Test
    public void cssLocators(){
        WebElement  home = wd.findElement(By.cssSelector("[href='/home']"));
        System.out.println("[href='/home']");


        WebElement button = wd.findElement(By.tagName("button"));

    }

}
