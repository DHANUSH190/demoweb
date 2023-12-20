package shoppingcart;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.tricentis.genericutility.BaseClass;
import com.tricentis.genericutility.ListenerImplementation;
import com.tricentis.objectrepository.HomePage;


@Listeners(ListenerImplementation.class)

public class TC_DWS_004_TEST extends BaseClass{
	

	@Test(groups = "system")
	public void addToCart() {
		hp=new HomePage(driver);

		
	}
		
		

}
