package logic;
/*
 * @author atulyadav on 2019-08-16 14:43
 */

import java.util.List;

public interface SplitService {

    List<FileRange> getSplittedOutput(List<File> input, int n);

}
