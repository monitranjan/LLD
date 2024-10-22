package CompositeDesignPattern;

public class Client {
    public static void main(String[] args) {
        FileSystem file1 = new File("File1.txt");
        FileSystem file2 = new File("File2.txt");
        FileSystem file3 = new File("File3.txt");

        //Folder
        Folder folder1 = new Folder("Folder1");
        Folder folder2 = new Folder("Folder2");

        folder1.add(file1);
        folder1.add(file3);

        folder2.add(file2);
        folder2.add(folder1);

        System.out.println("Displaying Folder2 Structure");
        folder2.display();
    }
}
