package logic;
/*
 * @author atulyadav on 2019-08-16 14:43
 */

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;

public class SplitServiceImpl implements SplitService {

    private AtomicLong length = new AtomicLong();

    @Override
    public List<FileRange> getSplittedOutput(List<File> input, int n) {
        long totalLength = 0;
        for (File file : input) {
            totalLength += file.length;
        }

        ExecutorService executor = Executors.newFixedThreadPool(n);
        long load = totalLength / (long)n;

        executor.submit(() -> {
            length.decrementAndGet();
        });
        return null;
    }
}

