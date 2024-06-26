import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class StartSelenium {
    WebDriver wd;

    @Test
    public void test(){
        wd =new ChromeDriver();
       // wd.get("http://telranedu.web.app/home");
        wd.navigate().to("http://telranedu.web.app/home");
        //wd.quit();
    }
}
