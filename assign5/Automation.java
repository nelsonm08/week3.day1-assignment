package week3day1.assign5;

public class Automation extends MultipleLangauge implements Language,testtool {
	static String mn="Java";
	public void Java() {
		
	
		System.out.println("This Java method");
			
	}
	public void Selenium() {
		mn="Selenium";
		System.out.println("This is Selenium method");
		System.out.println("Static variables "+mn);
		this.ruby();
	}
		public void ruby() {
			System.out.println("This is Ruby method");
			System.out.println("The value of final variable"+finalvar);
			
		
	}
	
		public static void main(String[] args) {
			Automation Auto=new Automation();
			Auto.Java();
			Auto.Selenium();
			
		}
}
