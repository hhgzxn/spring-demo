package com.example.spring.demo1;

/**
 * @ClassName: OutputHelper
 * @description:
 * @author:
 * @create: 2018-12-10 01:25
 **/
public class OutputHelper {

    IOutputGenerator outputGenerator;

    public OutputHelper() {
        outputGenerator = new CsvOutputGenerator();
    }

    public void generateOutput() {
        outputGenerator.generateOutput();
    }

    public void setOutputGenerator(IOutputGenerator outputGenerator) {
        this.outputGenerator = outputGenerator;
    }
}