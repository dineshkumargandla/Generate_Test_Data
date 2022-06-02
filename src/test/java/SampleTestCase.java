
import java.util.ArrayList;

import static com.bdd.framework.generateTestData.HelperClass.CSV.GenerateCSVLoginTestData.generateCSVLoginTestDataSet;
import static com.bdd.framework.generateTestData.HelperClass.CSV.GenerateCSVTestDataFile.generateCSVDataSet;
import static com.bdd.framework.generateTestData.constants.Parameters.*;

public class SampleTestCase {


    public static void testCSVData() {
        //generateTestDataFile(FileType.CSV_FILE_TYPE, 5);
        ArrayList values = new ArrayList();
        values.add(FIRST_NAME);
        values.add(LAST_NAME);
        values.add(FULL_NAME);
        values.add(COMPANY_NAME);
        values.add(PHONE_NUMBER);
        values.add(DESCRIPTION);
        values.add(USER_NAME);
        values.add(ADDRESS);
        values.add(FULL_ADDRESS);
        values.add(EMAIL);
        values.add(RANDOM_NUMBER);
        values.add(PRODUCT_NAME);
        values.add(CITY);
        values.add(STATE);
        values.add(ZIP_CODE);
        generateCSVDataSet(2, values);
    }

    public static void main(String arr[]) {
        testCSVData();
        generateCSVLoginTestDataSet(10000);
    }

}
