package Admin.MasterData;

import admin.MasterData.addressType;
import admin.MasterData.baseClassForAdmin;
import admin.MasterData.login;

public class mainClassRun {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		baseClassForAdmin base = new baseClassForAdmin();
		base.launchBrowser("Chrome");
		
		login log = new login();
		log.loginToAdmin(); 
		
		addressType add = new addressType();
		add.AddressType();
		

	}

}
