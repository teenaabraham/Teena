package com.ictak.script;



import org.testng.annotations.Test;

import com.ictak.homepage.Homepage;




public class TestClass extends TestBase {

	Homepage objhome;
	
	@Test
	
    public void verifyhomepage()
	{
   
		
    objhome = new Homepage(driver);
   
                                                                    //String username = Excelutility.getCellData(0, 0);
                                                                    //  String password = Excelutility.getCellData(0, 1);
                                                                 //  objLogin.setUserName(username);
                                                                //  objLogin.setPassword(password);
   //objhome.setHomef();
  //objhome.setCategories();
  // objhome.clickaboutus();
   objhome.clickprofile();
   //objhome.clickcontactus();
  // String expectedTitle =AutomationConstants.HOMEPAGETITLE;
//  String actualTitle =driver.getTitle();
 //  Assert.assertEquals(expectedTitle,actualTitle);
    }
	
	}
	

