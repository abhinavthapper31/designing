package lowLevelDesign.designPatterns.factory;

public class PC extends Computer {

	private int HDD;
	private int RAM;
    private String color;

	PC(int HDD, int RAM, String color) {
		this.color = color;
		this.HDD = HDD;
		this.RAM = RAM;
	}

	@Override
	public int getRAM() {
		return this.RAM ;
	}

	@Override
	public int getHDD() {
		// TODO Auto-generated method stub
		return this.HDD;
	}

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return this.color;
	}

}
