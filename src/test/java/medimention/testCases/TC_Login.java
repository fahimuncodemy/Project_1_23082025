package medimention.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import medimention.PageObject.AccountPage;
import medimention.PageObject.ActionsEle;
import medimention.PageObject.EntryPage;
import medimention.PageObject.HomePage;
import medimention.PageObject.LoginPage;
import medimention.PageObject.RegisterPage;

public class TC_Login extends BaseClass{

	@Test
	public void acc_Reg() throws InterruptedException
	{
		EntryPage ep=new EntryPage(driver);
		HomePage hp=new HomePage(driver);
		LoginPage lp=new LoginPage(driver);
		AccountPage ap=new AccountPage(driver);
		ActionsEle ae=new ActionsEle(driver);
		
		ae.Buttonpress(ep.HomeBtn);
		ae.Buttonpress(hp.logBtn);
		ae.enterText(lp.username, "k1fa07l466");
		ae.enterText(lp.password, "kxovigqm0h");
		ae.Buttonpress(lp.logbtn);
		
		
		System.out.println(ap.headAcc());
		Thread.sleep(4000);
//		System.out.println(ap.headAcc().toLowerCase());
//		System.out.println(ap.headAcc().toLowerCase().contains(name.toLowerCase()));
		
		
	}
}
