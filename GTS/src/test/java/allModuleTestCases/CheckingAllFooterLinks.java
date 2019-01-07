package allModuleTestCases;

import org.testng.annotations.Test;

import base.Base;
//import config.Configuration;
import mainPackageSingleton.MainPackage;

public class CheckingAllFooterLinks extends Base {
	
	@Test
	public static void checkingAllFooterLinks()
	{
		
		MainPackage.scrollDown();
		
		MainPackage.FooterAdvantages();
		MainPackage.back();
		MainPackage.scrollDown();
		
		MainPackage.process();
		MainPackage.back();
		MainPackage.scrollDown();
		
		MainPackage.WhyTreatment();
		MainPackage.back();
		MainPackage.scrollDown();
		
		MainPackage.WasteWaterTreatment();
		System.out.println("F1");
		MainPackage.back();
		MainPackage.scrollDown();
		
		MainPackage.Reuseforflushingshower();
		System.out.println("F2");
		MainPackage.back();
		MainPackage.scrollDown();
		
		MainPackage.BeautificationIrrigation();
		System.out.println("F3");
		MainPackage.back();
		MainPackage.scrollDown();
		
		MainPackage.EffluentPolishingRetrofitLagoon();
		System.out.println("F4");
		MainPackage.back();
		MainPackage.scrollDown();
		
		MainPackage.Commercial();
		System.out.println("F5");
		MainPackage.back();
		MainPackage.scrollDown();
		
		MainPackage.Residential();
		System.out.println("F6");
		MainPackage.back();
		MainPackage.scrollDown();
		
		MainPackage.CommunalSubdivision();
		System.out.println("F7");
		MainPackage.back();
		MainPackage.scrollDown();
		
		MainPackage.Development();
		System.out.println("F8");
		MainPackage.back();
		MainPackage.scrollDown();
		
		MainPackage.Farms();
		System.out.println("F9");
		MainPackage.back();
		MainPackage.scrollDown();
		
		MainPackage.SewerMining();
		System.out.println("F10");
		MainPackage.back();
		MainPackage.scrollDown();
		
		MainPackage.TemporaryCamps();
		System.out.println("F11");
		MainPackage.back();
		MainPackage.scrollDown();
		
		MainPackage.AboutUs();
		System.out.println("F12");
		MainPackage.back();
		MainPackage.scrollDown();
		
		MainPackage.MediaDownlod();
		System.out.println("F13");
		MainPackage.back();
		MainPackage.scrollDown();
		
		MainPackage.ourFollowUp();
		System.out.println("F14");
		MainPackage.back();
		MainPackage.scrollDown();
		
		MainPackage.QA();
		System.out.println("F15");
		MainPackage.back();
		MainPackage.scrollDown();
		System.out.println("F16");
		
	}

}
