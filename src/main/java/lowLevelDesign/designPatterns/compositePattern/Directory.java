package lowLevelDesign.designPatterns.compositePattern;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {

    private String directoryName;
    private List<FileSystem> objectList;

    public Directory(String name) {
        this.directoryName = name;
        objectList = new ArrayList<>();
    }

    public void add(FileSystem fileSystemObj) {
        objectList.add(fileSystemObj);
    }


    public String getDirectoryName() {
        return directoryName;
    }

    public void setDirectoryName(String directoryName) {
        this.directoryName = directoryName;
    }

    public List<FileSystem> getObjectList() {
        return objectList;
    }

    public void setObjectList(List<FileSystem> objectList) {
        this.objectList = objectList;
    }

    public void ls() {
        System.out.println("Directory name " + directoryName);

        for (FileSystem fileSystemObj : objectList) {
            fileSystemObj.ls();
        }
    }


}
