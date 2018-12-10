package com.example.demo1;

/**
 * @ClassName: OutputHelper
 * @description:
 * @author:
 * @create: 2018-12-10 01:25
 **/
public class OutputHelper
{
    IOutputGenerator outputGenerator;

    public OutputHelper(){
        outputGenerator = new CsvOutputGenerator();
    }

    public void generateOutput(){
        outputGenerator.generateOutput();
    }

}