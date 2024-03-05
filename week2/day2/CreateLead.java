package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		//Launch the browser
				ChromeDriver driver = new ChromeDriver();
				
				//To load the url
				driver.get("http://leaftaps.com/opentaps/");
				
				//To maximize the window
				driver.manage().window().maximize();
				
				// Locate the Username field
				//Datatype variable = value
				WebElement username = driver.findElement(By.id("username"));// ctrl+2, l --> shortcut to assign into a variable
				
				//Enter the username as Demosalesmanager
				username.sendKeys("Demosalesmanager");
				
				//Locate the password field and enter the password as crmsfa
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				
				//locate the login button and click
				driver.findElement(By.className("decorativeSubmit")).click();
				
				//Locate the CRM/SFA link and click
				driver.findElement(By.linkText("CRM/SFA")).click();

				//Locate the leads tab and click
				driver.findElement(By.linkText("Leads")).click();
				
				//Locate the create lead link and click
				driver.findElement(By.linkText("Create Lead")).click();
				
				//Locate the companyname and enter the company name
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
				
				//Locate the first name filed and enter the first name
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Gokul");
				
				//Locate the last name filed and enter the last name
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sekar");
				
				//Handle dropdown by using Select class 
				//step1 - Locate the source WE dropdown
				WebElement sourceWE = driver.findElement(By.id("createLeadForm_dataSourceId"));
				
				//Step2 - Create a object for Select Class and pass dropdown WebElement into the Constructor
				Select sourceDD = new Select(sourceWE);
				
				//Steps 3 - choose value by using selectByIndex
				sourceDD.selectByIndex(7);// Select value by using index and index will starts from zero(0)
				
				
				//Locate the Marketing campgin we
				WebElement marketingCampaignIdWE = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
				
				Select marketingCampaignIdDD = new Select(marketingCampaignIdWE);
				
				marketingCampaignIdDD.selectByVisibleText("Demo Marketing Campaign");//select value from dropdown by using text
				
				//Locate the createLeadForm_industryEnumId
				WebElement industryWE = driver.findElement(By.id("createLeadForm_industryEnumId"));
				
				Select industryDD = new Select(industryWE);
				industryDD.selectByValue("IND_SOFTWARE");// select value by using value attribute
				
					
				//Locate and click the Create lead button
				driver.findElement(By.name("submitButton")).click();
				
				//Locate the leadId 
				WebElement leadIdWE = driver.findElement(By.id("viewLead_companyName_sp"));
				String cName_LeadId = leadIdWE.getText();
				System.out.println(cName_LeadId);
				//By using replaceAll --> to get only number use regular expression [^0-9]
				String leadId = cName_LeadId.replaceAll("[^0-9]", "");
				String cName = cName_LeadId.replaceAll("[^a-zA-Z]", "");
				System.out.println("leadId : "+leadId);
				System.out.println("cName : " +cName);
				
				// To get the title of the WebPage
				String viewLeadTitle = driver.getTitle();
				if(viewLeadTitle.contains("View Lead")) {
					System.out.println("Lead created successfully");
				}else {
					System.out.println("failed to create a lead");
				}
				
				driver.close();
				
				
	}

}
