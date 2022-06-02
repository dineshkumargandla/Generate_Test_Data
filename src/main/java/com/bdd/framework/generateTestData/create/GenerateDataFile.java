package com.bdd.framework.generateTestData.create;

import com.bdd.framework.generateTestData.HelperClass.CSV.GenerateCSVTestDataFile;

import java.util.ArrayList;

import static com.bdd.framework.generateTestData.HelperClass.CSV.GenerateCSVTestDataFile.generateCSVDataSet;
import static com.bdd.framework.generateTestData.constants.FileType.CSV_FILE_TYPE;

public class GenerateDataFile {


    public static void main(String arr[]) {
        String fileType = null;
        int rowSize = 0;
        Object data1 = null;
        Object data2 = null;
        Object data3 = null;
        Object data5 = null;
        Object data4 = null;
        Object data6 = null;
        Object data7 = null;
        Object data8 = null;
        Object data9 = null;
        Object data10 = null;
        ArrayList parameterList = new ArrayList();
//        generateTestDataFile(fileType, rowSize,data1,data2,data3,data4,data5,data6,data7,data8,data9,data10);
//        generateTestDataFile(fileType, rowSize);
//        //generateTestDataFile(fileType, rowSize,data1,data2,data3,data4,data5,data6,data7,data8,data9);
        generateTestDataFile(fileType,rowSize,parameterList);
    }

    private static void generateTestDataFile(String fileType, int rowSize, ArrayList parameterList) {
        if (fileType.equalsIgnoreCase(CSV_FILE_TYPE)) {
            generateCSVDataSet(rowSize,parameterList);
            //generateCSVDataSet(rowSize,data1,data2,data3,data4,data5,data6,data7,data8,data9);
        }
    }

    private static void generateTestDataFile(String fileType, int rowSize, Object data1, Object data2, Object data3, Object data4, Object data5, Object data6, Object data7, Object data8, Object data9, Object data10) {
        if (fileType.equalsIgnoreCase(CSV_FILE_TYPE)) {
           //generateCSVDataSet(rowSize,data1,data2,data3,data4,data5,data6,data7,data8,data9,data10);
           //generateCSVDataSet(rowSize,data1,data2,data3,data4,data5,data6,data7,data8,data9);
        }
    }

    public static void generateTestDataFile(String fileType, int rowSize) {
        //setFileType(fileType,rowSize);
    }
}
