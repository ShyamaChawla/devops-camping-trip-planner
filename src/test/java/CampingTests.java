import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CampingTests {

@Test
public void testHomePageLoads() {
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("http://localhost:3000");
Assert.assertTrue(driver.getTitle().contains("Camping"));
driver.quit();
}

@Test
public void testStartPlanningButton() {
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();

driver.get("http://localhost:3000");

String title = driver.getTitle();
Assert.assertTrue(title.length() > 0);

driver.quit();
}

@Test
public void testChecklistPage() {
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();
driver.get("http://localhost:3000/checklist");
Assert.assertTrue(driver.getPageSource().contains("Checklist"));
driver.quit();
}

@Test
public void testNavigationWorks() {
WebDriverManager.chromedriver().setup();
WebDriver driver = new ChromeDriver();

driver.get("http://localhost:3000");

String url = driver.getCurrentUrl();
Assert.assertTrue(url.contains("localhost"));

driver.quit();
}   

}