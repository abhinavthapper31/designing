package Java.OOPS;
public class Encapsulation {

	/*
	 * 
	 * This is a private instance, which is hidden and only accessible by getter and
	 * setters *
	 */
	private String name;

	public void setInstanceValue(String str) {
		this.name = str;
	}

	public String getName() {
		return this.name;
	}
}
