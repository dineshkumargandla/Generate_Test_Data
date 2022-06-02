package com.bdd.framework.generateTestData.HelperClass.CSV;

import com.bdd.framework.generateTestData.constants.Parameters;

import java.io.*;
import java.util.ArrayList;

public class GenerateCSVTestDataFile {


    public static void generateCSVDataSet(int columnSize) {

    }

    public static void generateCSVDataSet(int rowSize, ArrayList parameterList) {
        writeCSVFile(rowSize, parameterList);
    }

    private static void writeCSVFile(int rowSize, ArrayList parameterList) {
        String whereWrite = "D:\\Dinesh\\Data\\GenerateDummyTestData\\Generate_Dummy_TestData\\src\\main\\resources/audit.csv";
        StringBuilder sb = new StringBuilder();
        try {
            FileWriter fw = new FileWriter(whereWrite, false);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            System.out.println(parameterList);
            for (int i =1 ; i < rowSize; i++){
                    for(Object parameter : parameterList){
                        sb.append(parameter+",");
                    }
                pw.println(sb.deleteCharAt(sb.length()-1));
                    sb.setLength(0);
            }

            pw.flush();
            pw.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
