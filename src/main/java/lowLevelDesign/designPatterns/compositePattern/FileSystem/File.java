package lowLevelDesign.designPatterns.compositePattern.FileSystem;

public class File implements FileSystem {
    private String fileName;

    public File(String name) {
        this.fileName = name;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void ls() {
        System.out.println(this.fileName + " ");
    }
}
