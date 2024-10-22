package CompositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystem{
    String name;
    private List<FileSystem> children = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(FileSystem fs){
        children.add(fs);
    }

    public void remove(FileSystem fs){
        children.remove(fs);
    }

    @Override
    public void display() {
        System.out.println("Folder :"+ name);
        for(FileSystem fs: children){
            fs.display();
        }
    }
}
