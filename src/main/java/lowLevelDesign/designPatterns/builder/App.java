package lowLevelDesign.designPatterns.builder;

import java.util.List;

public class App {


    /*
     * Problem : Contructor bomb when all the fields are not needed to construct an object
     * we would end up having a large number of constructors
     *
     * */
    public static void main(String[] args) {

        CustomerMessage.CustomerMessageBuilder builder = new CustomerMessage.CustomerMessageBuilder();
        builder.firstName("Thapper");
        builder.lastName("Abhinav");

        CustomerMessage customer = builder.build();
        System.out.println(customer);
    }
}
