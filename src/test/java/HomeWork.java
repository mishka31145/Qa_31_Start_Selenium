import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomeWork {

    WebDriver wd;

    @BeforeClass
    public void setUp() {
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/login");
    }

    @Test
    public void locators() {

        //by tagName
        WebElement tn = wd.findElement(By.tagName("a"));
        WebElement tn1 = wd.findElement(By.cssSelector("input"));
        WebElement tn3 = wd.findElement(By.tagName("button"));


        //by class
        WebElement c = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement c1 = wd.findElement(By.cssSelector(".container"));
        WebElement c2 = wd.findElement(By.className("login_login__3EHKB"));
        WebElement c3 = wd.findElement(By.cssSelector(".active"));


        //by id
        WebElement i = wd.findElement(By.id("root"));
        WebElement i1 = wd.findElement((By.cssSelector("#root")));


        //by attribute
        WebElement a = wd.findElement(By.cssSelector("[href='/home']"));
        WebElement a1 = wd.findElement(By.cssSelector("[aria-current='page']"));
        WebElement a2 = wd.findElement(By.cssSelector("[style='border: 1px solid black; background-color: black; color: white;']"));
        WebElement a3 = wd.findElement(By.cssSelector("[placeholder='Password']"));
        WebElement a4 = wd.findElement(By.cssSelector("[type='submit']"));

        //by name
        WebElement n = wd.findElement(By.name("email"));
        WebElement n1 = wd.findElement(By.cssSelector("[name='registration']"));
        WebElement n2 = wd.findElement(By.name("password"));
        WebElement n3 = wd.findElement(By.cssSelector("[name='login']"));


        //one of elements find by attribute ==> start & end & contains
        WebElement e = wd.findElement(By.linkText("HOME"));
        WebElement e1 = wd.findElement(By.linkText("ABOUT"));
//        //start
        WebElement e2 = wd.findElement(By.partialLinkText("LO"));
//        //contains
        WebElement e3 = wd.findElement(By.partialLinkText("GI"));
//        //end
        WebElement e4 = wd.findElement(By.partialLinkText("GIN"));
    }

}
