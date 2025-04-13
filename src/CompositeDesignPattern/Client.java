package CompositeDesignPattern;

public class Client {
    public static void main(String[] args) {
        FileSystem file1 = new File("File1.txt");
        FileSystem file2 = new File("File2.txt");
        FileSystem file3 = new File("File3.txt");

        //Folder
        Directory directory1 = new Directory("Folder1");
        Directory directory2 = new Directory("Folder2");

        directory1.add(file1);
        directory1.add(file3);

        directory2.add(file2);
        directory2.add(directory1);

        System.out.println("Displaying Folder2 Structure");
        directory2.ls();

        System.out.println("\nDisplaying Folder2 shallow Structure");
        directory2.lsShallow();
    }
}
