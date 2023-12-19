package FactoryDesignPattern;

public class FactoryDesignPattern {
	
	public static void main(String[] args) {
		
		Factory f1=new Factory();
		Os os=f1.getInstance("Open");
		os.spec();
	}

}
