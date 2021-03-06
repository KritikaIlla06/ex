package k;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class gridOC {
	public static void main(String[] args) throws InterruptedException, MalformedURLException 

	{
		System.setProperty("webdriver.chromedriver.driver", "D:/krithika/M4");
		
		   
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setBrowserName("chrome");
		capabilities.setCapability("webdriver.chromedriver.driver", "D:/Kavya Sri Gampala/m4(1)/chromedriver.exe");
		

		
		capabilities.setPlatform(Platform.WINDOWS);
		//capabilities.setVersion(version);
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:6666/wd/hub"), capabilities);
		try
		{
		driver.get("http://demo.opencart.com");
		Thread.sleep(1000);
		
        System.out.println("Execution is stopped for 10 seconds");
		boolean title=driver.getTitle().contains("Your Store");
		if(title)
		{
			System.out.println("Title matches");
		}
		else
		{
			System.out.println("Title not matches");
		}
		
        System.out.println("Waiting for the page to load");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
        java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
        
        int expectedlinks=73;
		 
		int actuallinks=links.size();
		
		if(expectedlinks==actuallinks)
		{
			System.out.println("No of links are equal to expected links " +actuallinks);
		}
		else
		{
			System.out.println("No of links are npot equal to expected links" +actuallinks);	
		}
		driver.findElement(By.linkText("My Account")).click();
		Thread.sleep(1000);
		System.out.println("My Account is clicked");
		
		driver.findElement(By.linkText("Register")).click();
		//Thread.sleep(1000);
		System.out.println("Register is clicked");
		
		driver.findElement(By.name("firstname")).sendKeys("Kriti");
		WebElement fname = driver.findElement(By.name("firstname"));
		String name = fname.getAttribute("value");
		if(Validate.ValidateName(name))
		{
			System.out.println("Valid fistname");
			driver.findElement(By.name("lastname")).sendKeys("illa");
			Thread.sleep(1000);
			WebElement last = driver.findElement(By.name("lastname"));
			String name1 = last.getAttribute("value");
			if(Validate.ValidateName(name1))
			{
				System.out.println("valid Last name");			
				driver.findElement(By.name("email")).sendKeys("illakri@gmail.com");
				Thread.sleep(1000);
				WebElement email = driver.findElement(By.name("email"));
				String mail = email.getAttribute("value");
				if(Validate.Validatemail(mail))
				{
					System.out.println("valid email");
					driver.findElement(By.name("telephone")).sendKeys("9876543210");
					Thread.sleep(1000);
					WebElement phone = driver.findElement(By.name("telephone"));
					String number = phone.getAttribute("value");
					if(Validate.ValidateNo(number))
					{
						System.out.println("valid phone number");
						driver.findElement(By.name("password")).sendKeys("kriti");
						Thread.sleep(1000);
						WebElement pwd = driver.findElement(By.name("password"));
						String pass = pwd.getAttribute("value");
						driver.findElement(By.name("confirm")).sendKeys("kriti");
						WebElement pwd1 = driver.findElement(By.name("confirm"));
						String pass1 = pwd1.getAttribute("value");
						if(pass.equals(pass1))
						{
							System.out.println("Password is matching");
						}
					}
					
				}
				
			}
		}
		driver.findElement(By.xpath(".//*[@id='content']/form/fieldset[3]/div/div/label[2]")).click();
		System.out.println("Clicked: No button");
		
		driver.findElement(By.name("agree")).click();
        driver.findElement(By.cssSelector("input[value='Continue']")).click();
		
		Thread.sleep(1500);
		boolean text4=driver.getPageSource().contains("Your Account Has Been Created!");
		if(text4)
		{
			System.out.println("Your Account Has Been Created! is present");
		}
		else
		{
			System.out.println("Your Account Has Been Created! is not present");
		}
		Thread.sleep(1500);
		driver.findElement(By.linkText("Phones & PDAs")).click();
		driver.findElement(By.linkText("HTC Touch HD")).click();
		boolean text5=driver.getPageSource().contains("HTC Touch HD");
		if(text5)
		{
			System.out.println("HTC Touch HD is present");
		}
		else
		{
			System.out.println("HTC Touch HD is not present");
		}
		Thread.sleep(1500);
		System.out.println("Execution is stopped for 15 secs");
		driver.navigate().back();
		
		System.out.println("Web page is navigating");
		driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[1]/div/div[2]/div[2]/button[1]")).click();
		System.out.println("Add to cart button is clicked");
		
		Thread.sleep(1500);
		boolean text6=driver.getPageSource().contains("Success: HTC Touch HD to your shopping cart!");
		if(text6)
		{
			System.out.println("Success:HTC Touch HD to your shopping cart! is present");
		}
		else
		{
			System.out.println("Success:HTC Touch HD to your shopping cart! is not present");
		}
		Thread.sleep(1500);
		driver.findElement(By.linkText("Brands")).click();
		
		boolean title1=driver.getTitle().contains("Find Your Favorite Brand");
		if(title1)
		{
			System.out.println("Title matches");
		}
		else
		{
			System.out.println("Title not matches");
		}
		driver.findElement(By.linkText("Canon")).click();
		boolean text7=driver.getPageSource().contains("Canon");
		if(text7)
		{
			System.out.println("Canon is present");
		}
		else
		{
			System.out.println("Canon is not present");
		}
		
		driver.findElement(By.xpath(".//*[@id='content']/div[2]/div[1]/div/div[2]/div[2]/button[2]")).click();
		System.out.println("Clicked on add to wishlist icon");
		
		Thread.sleep(1000);
		boolean text8=driver.getPageSource().contains("Success:wish list!");
		if(text8)
		{
			System.out.println("Success:wish list! is present");
		}
		else
		{
			System.out.println("Success:wish list! is not present");
		}
		
		driver.findElement(By.xpath("html/body/footer/div/div/div[4]/ul/li[3]/a")).click();
		
		boolean title2=driver.getTitle().contains("List");
		if(title2)
		{
			System.out.println("Title matches");
		}
		else
		{
			System.out.println("Title not matches");
		}
		
		Thread.sleep(1500);
		
		driver.findElement(By.xpath(".//*[@id='content']/div[2]/div/a")).click();
		driver.close();
		driver.close();
		}
		catch(Exception e)
		{
			System.out.println("Hello");
		}
		driver.close();

	}

		
}
