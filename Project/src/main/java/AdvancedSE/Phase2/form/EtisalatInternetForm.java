package AdvancedSE.Phase2.form;
import java.util.ArrayList;

public class EtisalatInternetForm extends Form {
public void createComp() {
	
		limited = true;
		
		name = "Etisalat internet Choose Your Subscription";
	
		String mapkey = "Number";
		String type = "I";
		String Message = "Enter your Number:>";
		boolean hasoptions = false;
	
	
		FormComponent c = new FormComponent(mapkey, type, Message, hasoptions);
	
		list1.add(c);
		
		
		
		options_Message = "-----------\n"+"Choose your subscription:>\n"+"1-140 GB for 50 EGP\n"+"2-180GB for 60EGP\n"+"3-220 GB for 100EGP";
		
		
		
		 mapkey = "subscription";
		 type = "I";
		 Message = "";
		 hasoptions = true;
		 
		 ArrayList<String> options = new ArrayList<String>();
		 options.add("140");
		 options.add("180");
		 options.add("220");
		 
		 
		 
		 
		FormComponent c2 = new FormComponent(mapkey, type, Message, hasoptions);
		c2.add_options(options);
		
		list1.add(c2);
		
		
		amount_options.add(50.0f);
		amount_options.add(60.0f);
		amount_options.add(100.0f);
		
		
}
}
