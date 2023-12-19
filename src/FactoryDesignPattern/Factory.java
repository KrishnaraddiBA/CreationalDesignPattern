package FactoryDesignPattern;

public class Factory {
	
	
	public Os getInstance(String s) {
		if (s.equals("Open")) {
			return  new AndroidOs();
		}
		else if (s.equals("Closed")) {
			return  new IosOs();
		}
		else {
			return new WindowsOs();
		}
		}

}
