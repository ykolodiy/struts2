package mypackage;

import servicepackage.tutorialservice;

public class tutorialaction {

	// lets create class member variable to use it in jsp later. and yes u need geters and setters for this :)))))
	// here you can set ir line 27 and in jsp get it using strut taglib 
	
	private String s;
	private String lang;
	
	// using in get request http://localhost:5555/C/gettutorial.action?lang=java2
	public String getLang() {
		return lang;
	}


	public void setLang(String lang) {
		this.lang = lang;
	}


	public String getS() {
		return s;
	}


	public void setS(String s) {
		this.s = s;
	}


	public String execute () {
		
		//tutorialservice tinstance = new tutorialservice ();
		//System.out.println(tinstance.getbesttutorial(getLang()));
		//System.out.println(getLang());
		//setS(tinstance.getbesttutorial(getLang()));
		
		return "success";
		}
	
	public String somemethod() {
		System.out.println("some other methods");
		return "success";

	}
	

}


//http://localhost:5555/C/gettutorial.action