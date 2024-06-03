package lowLevelDesign.designPatterns.factory;


public class SelfServePropertiesFactory {

    public static SelfServePropService getSelfServePropService(String checkinSource) {
        switch (checkinSource) {
            // Usually Enum
            case "APPFOLIO":
                return new AppfolioPropertiesService();
            case "BOOKER":
                return new BookerPropertiesService();
            default:
                return null;
        }
    }
}
