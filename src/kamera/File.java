package kamera;

public class File {

    private int size;
    private long creationDate;
    private String name;

    private File(int size, String name) {
        this.size = size;
        this.name = name;
        this.creationDate = System.currentTimeMillis();
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }
}
