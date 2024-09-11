package lowLevelDesign.designPatterns.factory;

public class App {

	// Factory pattern -> Conditional creation of objects.

	public static void main(String args[]) {
		Computer pc = ComputerFactory.getInstance("PC", 10, 4, "Black");
		Computer server = ComputerFactory.getInstance("Server", 100, 8, "Blue");
		
		System.out.println(pc);
		System.out.println(server);


		
		

		

	}

}
