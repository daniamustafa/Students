import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyClass {

	public static void main(String[] args) throws IOException {

		WebDriver driver;

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("http://127.0.0.1:5500/index.html");

		List<WebElement> myStudents = driver.findElements(By.tagName("option"));

		for (int i = 3; i < myStudents.size(); i=i+4) {


				myStudents.get(i).click();

			driver.findElement(By.xpath("//*[@id=\"remove\"]")).click();

		}

	}

} 
