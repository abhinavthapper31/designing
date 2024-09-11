package lowLevelDesign.designPatterns.factory;

public class ComputerFactory {
	
	
	public static Computer getInstance(String type, int HDD, int RAM, String color) {
		
		switch(type) {
			case "PC":
				return new PC(HDD, RAM, color) ;
			case "Server":
				return new Server(HDD, RAM, color) ;
			default:
				return null ;
		}
		
			
	}

}
