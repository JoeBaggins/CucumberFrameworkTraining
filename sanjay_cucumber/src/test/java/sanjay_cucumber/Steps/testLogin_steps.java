package sanjay_cucumber.Steps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sanjay_cucumber.Actions.HandleDataTables;
import sanjay_cucumber.Properties.BrowserConnect;

public class testLogin_steps {
	
	BrowserConnect browserCon;

	
	public testLogin_steps(BrowserConnect browserCon) {
		
		this.browserCon = browserCon;
	}

	@Given("User navigates to PE Login Page")
	public void user_navigates_to_pe_login_page() {
		System.out.println("This is the browser: " + browserCon.browserName);
		System.out.println("User is ON Login Page");
		
		/*System.setProperty("webdriver.gecko.driver", "C:\\SELENIUM\\Drivers\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.navigate().to("http://www.facebook.com");*/
		
		/*System.setProperty("webdriver.chrome.driver", "C:\\SELENIUM\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
//		driver.navigate().to("http://www.facebook.com");*/
		
		if (browserCon.browserName == "IE") {
		/*System.setProperty("webdriver.ie.driver", "C:\\SELENIUM\\Drivers\\IEDriverServer.exe");
		WebDriver driver= new InternetExplorerDriver();
		driver.get("https://www.makemytrip.com/");*/
		System.out.println("This is IE browser");
		}
		
		else if (this.browserCon.browserName == "Chrome") {
		System.out.println("Opening CHROME browser");
		}
		else {
			System.out.println("This is FIREFOX browser");
		}
		/*WebElement username = driver.findElement(By.name("email"));
		username.sendKeys("sanjaypradhan80@gmail.com");
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("Ladakh@2012");
		WebElement submit = driver.findElement(By.by("/html/body/div[1]/div/footer/div[1]/div/ul[1]/li[3]/a"));
		submit.click();*/
		
	}

	//*** THIS IS A VERY IMPORTANT METHOD FOR PARAMETERIZATION ***	
	@Given("User enters valid Username {string} and Password {string}")
	public void user_enters_valid_username_and_password(String username, String password) {
		System.out.println("User enters valid Username '" + username +"'and Password '"+ password +"'");
	}

	@When("User clicks the Submit button")
	public void user_clicks_the_submit_button() {
		System.out.println("User clicks the Submit button");
		
		}
	
	@When("User clicks the Sign-Up button")
	public void user_clicks_the_sign_up_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("User clicks the Sign-up button");

	}

	@When("User enters the below information")
	public void user_enters_the_below_information(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		
		/*
		List<List<String>> obj = dataTable.asLists();
		System.out.print(obj.get(0).get(0) + " ");
		System.out.println(obj.get(0).get(1) + " ");
		System.out.print(obj.get(1).get(0) + " ");
		System.out.println(obj.get(1).get(1) + " ");
		*/
	    
	
	
		//HandleDataTables dTable = new HandleDataTables();
		io.cucumber.datatable.DataTable dTable = dataTable;
		int rowNUmber = 0;
		int columnNumber = 0;
		HandleDataTables.passDataTableValues(dataTable, rowNUmber, columnNumber);
		HandleDataTables.passDataTableValues(dataTable, 0, 1);
		
	}
		

	@Then("User should should be able to sign up")
	public void user_should_should_be_able_to_sign_up() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("User is signed-up");
	}
	

	@Then("User should be able to login to PE")
	public void user_should_be_able_to_login_to_pe() {
		System.out.println("User is able to login");
	}

	@Then("User should see the Main page")
	public void user_should_see_the_main_page() {
		System.out.println("User is able to see the Main Page");
	}
		
	@Then("User should NOT see the Main page")
	public void user_should_not_see_the_main_page() throws IOException {
	System.out.println("NOT LOGGED IN");
	


	
	
	
	//*** using 'instanceof' we can check whether an object is an instance of another class ***
	testLogin_steps steps = new testLogin_steps(browserCon);
	System.out.println("Checking 'instanceof':" + (steps instanceof testLogin_steps));
	System.out.println();
	
	Properties prop = new Properties();
	FileInputStream fis = new FileInputStream("C:\\SELENIUM\\SELENIUM WORKSPACES\\sanjay_cucumber\\Utilities\\Config.properties");
	prop.load(fis);
	System.out.println();
	System.out.println(prop.getProperty("url"));
	
	}


}
