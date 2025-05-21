package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RemoveItemInCart {
	WebDriver driver;
	WebDriverWait wait;
	//constructeur
	public RemoveItemInCart(WebDriver driver) {
		this.driver=driver;
		wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	}
//locators
	private final By btnbackhome=By.cssSelector("#back-to-products");
	private final By btncart=By.className("shopping_cart_link");
	//functions
	public void removeItem() {
		//driver.findElement(btncart).click();
		driver.findElement(btnbackhome).click();
	// test commit
	}
}
