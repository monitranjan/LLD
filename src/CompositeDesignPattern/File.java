package CompositeDesignPattern;

public class File implements FileSystem{
    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("File :" +name);
    }
}
