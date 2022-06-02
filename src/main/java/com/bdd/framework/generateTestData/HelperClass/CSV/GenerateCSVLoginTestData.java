package com.bdd.framework.generateTestData.HelperClass.CSV;

import com.bdd.framework.generateTestData.generateData.GenerateTestData;

import java.io.*;
import java.util.ArrayList;

import static com.bdd.framework.generateTestData.constants.Parameters.EMAIL;
import static com.bdd.framework.generateTestData.constants.Parameters.PASSWORD;


public class GenerateCSVLoginTestData {
    public static void generateCSVLoginTestDataSet(int rowSize) {
        writeCSVFile(rowSize);
    }

    private static void writeCSVFile(int rowSize) {
        String whereWrite = "D:\\Dinesh\\Data\\GenerateDummyTestData\\Generate_Dummy_TestData\\src\\main\\resources/Login_Test_Data.csv";
        StringBuilder sb = new StringBuilder();
        try {
            FileWriter fw = new FileWriter(whereWrite, false);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            for (int i =0 ; i <=rowSize; i++){
                pw.println(GenerateTestData.getEmail()+","+ GenerateTestData.getRandomPassword());
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
