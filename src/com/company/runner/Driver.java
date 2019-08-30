package com.company.runner;
/*
 * @author atulyadav on 2019-08-16 14:38
 */

import logic.File;
import logic.FileRange;
import logic.SplitService;
import logic.SplitServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Driver {
    public static void main(String[] args) {

        File file = new File("File1", 200);
        File file2 = new File("File2", 500);
        File file3 = new File("File3", 800);

        List<File> input = new ArrayList<>();
        input.add(file);
        input.add(file2);
        input.add(file3);

        SplitService splitService = new SplitServiceImpl();
        List<FileRange> splittedOutput = splitService.getSplittedOutput(input, 2);

    }
}
