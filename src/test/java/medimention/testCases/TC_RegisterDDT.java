package medimention.testCases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import medimention.PageObject.AccountPage;
import medimention.PageObject.ActionsEle;
import medimention.PageObject.EntryPage;
import medimention.PageObject.HomePage;
import medimention.PageObject.RegisterPage;
import medimention.utilities.DataProviders;

public class TC_RegisterDDT extends BaseClass{

	@Test(dataProvider="RegisterData", dataProviderClass=DataProviders.class)
	public void acc_Reg(String email, String Bname, String Uname, String pass, String confPass) throws InterruptedException
	{
		EntryPage ep=new EntryPage(driver);
		HomePage hp=new HomePage(driver);
		RegisterPage rp=new RegisterPage(driver);
		AccountPage ap=new AccountPage(driver);
		ActionsEle ae=new ActionsEle(driver);
//		String pass=randomString()+randomNumber();
//		String name=randomString();
//		String username= randomString()+randomNumber();
//		String email= randomString()+"@aol.com";
		
		ae.Buttonpress(ep.HomeBtn);
		ae.Buttonpress(hp.regBtn);
		ae.Buttonpress(rp.grpDrop);
		ae.Buttonpress(rp.options.get(1));
		ae.enterText(rp.Name, Bname);
		ae.enterText(rp.Uname, Uname);
		ae.enterText(rp.Uemail, email);
		ae.enterText(rp.Upass, pass);
		ae.enterText(rp.Uconfpass, confPass);
		ae.Buttonpress(rp.agree);
		ae.Buttonpress(rp.regButton);
		ae.Buttonpress(ap.Drop);
		ae.Buttonpress(ap.logout);
		ae.Buttonpress(hp.MediHead);
		
//		System.out.println(name+"\t"+username+"\t"+email+"\t"+pass);
		System.out.println(ap.headAcc());
		Thread.sleep(4000);
//		System.out.println(ap.headAcc().toLowerCase());
//		System.out.println(ap.headAcc().toLowerCase().contains(name.toLowerCase()));
		Assert.assertTrue(ap.headAcc().toLowerCase().contains(Bname.toLowerCase()));
		Assert.assertEquals(ap.BName().toLowerCase(), Bname.toLowerCase());
		
	}
}
