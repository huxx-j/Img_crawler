import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Crawler {
        public static void main(String args[])
        {
            WebDriver driver;
            System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
            driver = new ChromeDriver();

            driver.get("http://cafe.naver.com/temadica/711035"); // 대상 페이지 URL
            driver.switchTo().frame("cafe_main"); // 소스중에 cafe_main이라는 frame으로 이동시키는 코드
            WebElement tbody = driver.findElement(By.id("tbody")); // 태그중에 id 가 "tbody"인걸 찾아서 그 태그만 잘라서 가져오는 코드
            List<WebElement> imgList = tbody.findElements(By.tagName("img")); // 위에서 짤라온 소스중에 tagName이 "img"인걸 잘라서 가져오는 코드

            for (WebElement element : imgList) {
                System.out.println(element.getAttribute("src")); // img 태그 안에 "src" 속성값을 가져오는 코드
            }

            driver.quit(); // 웹브라우져 닫음
        }
    }

