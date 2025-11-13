import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

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
        WebElement body = wd.findElement(By.tagName("body"));
        WebElement body1 = wd.findElement(By.cssSelector("body"));

        WebElement body2 = wd.findElement(By.xpath("//body"));

        WebElement div = wd.findElement(By.tagName("div"));
        WebElement div1 = wd.findElement(By.cssSelector("div"));

        WebElement div2 = wd.findElement(By.xpath("//div"));

        WebElement h1 = wd.findElement(By.tagName("h1"));
        WebElement h1_1 = wd.findElement(By.cssSelector("h1"));

        WebElement h1_2 = wd.findElement(By.xpath("//h1"));

        WebElement a = wd.findElement(By.tagName("a"));
        WebElement a1 = wd.findElement(By.cssSelector("a"));

        WebElement a2 = wd.findElement(By.xpath("//a"));

        WebElement input = wd.findElement(By.cssSelector("input"));
        WebElement input1 = wd.findElement(By.tagName("input"));

        WebElement input2 = wd.findElement(By.xpath("//input"));

        WebElement form = wd.findElement(By.tagName("form"));
        WebElement form1 = wd.findElement(By.cssSelector("form"));

        WebElement form2 = wd.findElement(By.xpath("//form"));

        WebElement button = wd.findElement(By.tagName("button"));
        WebElement button1 = wd.findElement(By.cssSelector("button"));

        WebElement button2 = wd.findElement(By.xpath("//button"));



        //by class
        WebElement el = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement el1 = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));
        WebElement el9 = wd.findElement(By.xpath("//*[@class='navbar-component_nav__1X_4m']"));


        WebElement el3 = wd.findElement(By.className("container"));
        WebElement el2 = wd.findElement(By.cssSelector(".container"));
        WebElement el8 = wd.findElement(By.xpath("//*[@class='container']"));


        WebElement el4 = wd.findElement(By.className("login_login__3EHKB"));
        WebElement el5 = wd.findElement(By.cssSelector(".login_login__3EHKB"));
        WebElement el10 = wd.findElement(By.xpath("//*[@class='login_login__3EHKB']"));


        WebElement el6 = wd.findElement(By.className("active"));
        WebElement el7 = wd.findElement(By.cssSelector(".active"));
        WebElement el11 = wd.findElement(By.xpath("//*[@class='active']"));


        //by id
        WebElement i = wd.findElement(By.id("root"));
        WebElement i1 = wd.findElement((By.cssSelector("#root")));
        WebElement i2 = wd.findElement(By.xpath("//*[@id='root']"));


        //by attribute
        WebElement attr = wd.findElement(By.cssSelector("[href='/home']"));
        WebElement attr6 = wd.findElement(By.xpath("//*[@href='/home']"));

        WebElement attr1 = wd.findElement(By.cssSelector("[href='/about']"));
        WebElement attr7 = wd.findElement(By.xpath("//*[@href='/about']"));

        WebElement attr2 = wd.findElement(By.cssSelector("[aria-current='page']"));
        WebElement attr8 = wd.findElement(By.xpath("//*[@aria-current='page']"));

        WebElement attr3 = wd.findElement(By.cssSelector("[style='border: 1px solid black; background-color: black; color: white;']"));
        WebElement attr9 = wd.findElement(By.xpath("//*[@style='border: 1px solid black; background-color: black; color: white;']"));

        WebElement attr4 = wd.findElement(By.cssSelector("[placeholder='Password']"));
        WebElement attr10 = wd.findElement(By.xpath("//*[@placeholder='Password']"));

        WebElement attr5 = wd.findElement(By.cssSelector("[type='submit']"));
        WebElement attr11 = wd.findElement(By.xpath("//*[@type='submit']"));


        //by name
        WebElement n = wd.findElement(By.name("email"));
        WebElement n4 = wd.findElement(By.xpath("//*[@name='email']"));

        WebElement n1 = wd.findElement(By.cssSelector("[name='registration']"));
        WebElement n5 = wd.findElement(By.xpath("//*[@name='registration']"));

        WebElement n2 = wd.findElement(By.name("password"));
        WebElement n6 = wd.findElement(By.xpath("//*[@name='password']"));

        WebElement n3 = wd.findElement(By.cssSelector("[name='login']"));
        WebElement n7 = wd.findElement(By.xpath("//*[@name='login']"));



        //one of elements find by attribute ==> start & end & contains
        WebElement e = wd.findElement(By.linkText("HOME"));
        WebElement e1 = wd.findElement(By.linkText("ABOUT"));

//        //start
        WebElement e2 = wd.findElement(By.partialLinkText("LO"));
        WebElement e5 = wd.findElement(By.cssSelector("[placeholder^='Em']"));
//        //contains
        WebElement e3 = wd.findElement(By.partialLinkText("GI"));
        WebElement e6 = wd.findElement(By.cssSelector("[placeholder*='ma']"));
//        //end
        WebElement e4 = wd.findElement(By.partialLinkText("GIN"));
        WebElement e7 = wd.findElement(By.cssSelector("[placeholder$='il']"));

        WebElement password = wd.findElement(By.cssSelector("[placeholder = 'Password']"));
        WebElement password_xPath = wd.findElement(By.xpath("//input[@placeholder='Password']"));

        WebElement password1 = wd.findElement(By.cssSelector("[placeholder ^= 'Pass']"));
        WebElement password_xPath1 = wd.findElement(By.xpath("//input[starts-with(@placeholder,'Pass')]"));

        WebElement password2 = wd.findElement(By.cssSelector("[placeholder *= 'ss']"));
        WebElement password_xPath2 = wd.findElement(By.xpath("//*[contains(@placeholder,'ss')]"));

        WebElement password3 = wd.findElement(By.cssSelector("[placeholder $= 'word']"));
        WebElement password_xPath3 = wd.findElement(By.xpath("//*[contains(@placeholder,'word')]"));



    }

    @Test
    public void classwork() {
        //parent
    WebElement el = wd.findElement(By.xpath("//h1/.."));
    WebElement el1 = wd.findElement(By.xpath("//h1/parent::*"));
    WebElement el2 = wd.findElement(By.xpath("//h1/parent::div"));

    //ancestor
        WebElement el3 = wd.findElement(By.xpath("//h1/ancestor::*"));//all
        WebElement el4 = wd.findElement(By.xpath("//h1/ancestor::div"));//two options
        WebElement el5 = wd.findElement(By.xpath("//h1/ancestor::div[2]"));//one option

        //ancestor-or-self
        WebElement el6 = wd.findElement(By.xpath("//h1/ancestor-or-self::*"));
        List<WebElement> list = wd.findElements(By.xpath("//h1/ancestor-or-self::*"));

        //following-sibling
        List<WebElement> list1 = wd.findElements(By.xpath("//h1/following-sibling::a"));

        //preceding-sibling
        List<WebElement> list2 = wd.findElements(By.xpath("//a[last()]/preceding-sibling::*"));
        List<WebElement> list3 = wd.findElements(By.xpath("//a[3]/preceding-sibling::a[1]"));
    }

    @Test
    public void classwork1() {
        WebElement element = wd.findElement(By.cssSelector("[name='login']"));
        String text = element.getText();
        System.out.println(text);

        WebElement form = wd.findElement(By.xpath("//form"));
        String textForm = form.getText();
        System.out.println("*****************************************");
        System.out.println(textForm);

        WebElement html = wd.findElement(By.tagName("html"));
        String textAll = html.getText();
        System.out.println("*****************************************");
        System.out.println(textAll);

        WebElement br = wd.findElement(By.tagName("br"));
        System.out.println("text br-->"+br.getText());

    }

}
