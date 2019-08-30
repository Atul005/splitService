package logic;
/*
 * @author atulyadav on 2019-08-16 14:41
 */

public class FileRange {
    String filename;
    Long startOffset;
    Long endOffset;

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public Long getStartOffset() {
        return startOffset;
    }

    public void setStartOffset(Long startOffset) {
        this.startOffset = startOffset;
    }

    public Long getEndOffset() {
        return endOffset;
    }

    public void setEndOffset(Long endOffset) {
        this.endOffset = endOffset;
    }

    @Override
    public String toString() {
        return "FileRange{" +
                "filename='" + filename + '\'' +
                ", startOffset=" + startOffset +
                ", endOffset=" + endOffset +
                '}';
    }
}
