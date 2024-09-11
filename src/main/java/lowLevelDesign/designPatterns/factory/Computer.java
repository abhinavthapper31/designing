package lowLevelDesign.designPatterns.factory;

public abstract class Computer {

	// these methods will be implemented
	protected abstract int getRAM();

	protected abstract int getHDD();

	protected abstract String getColor();
	
	@Override
	public String toString(){
		return "RAM= "+this.getRAM()+", HDD="+this.getHDD()+", Color="+this.getColor();
	}

}
