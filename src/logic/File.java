package logic;
/*
 * @author atulyadav on 2019-08-16 14:41
 */

public class File {

    String name;
    long length;

    public File(String name, long length) {
        this.name = name;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "FileRange{" +
                "name='" + name + '\'' +
                ", length=" + length +
                '}';
    }
}
