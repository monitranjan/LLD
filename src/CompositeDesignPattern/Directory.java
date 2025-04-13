package CompositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
    String name;
    private List<FileSystem> children = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void add(FileSystem fs) {
        children.add(fs);
    }

    public void remove(FileSystem fs) {
        children.remove(fs);
    }

    @Override
    public void ls() {
        System.out.println("Directory :" + name);
        for (FileSystem fs : children) {
            fs.ls();
        }
    }

    @Override
    public void lsShallow() {
        System.out.println("Directory: " + name);
        for (FileSystem fs : children) {
            if (fs instanceof File) {
                fs.ls();
            } else if (fs instanceof Directory) {
                System.out.println("Directory: " + ((Directory) fs).name);
            }
        }
    }

}
