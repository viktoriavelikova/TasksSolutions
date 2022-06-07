import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogBuilder;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = null;
        try {
            String path = "C:\\Users\\vikto\\Desktop\\Book1.xlsx";
            fileInputStream = new FileInputStream(path);
            XSSFWorkbook xssfWorkbook = new XSSFWorkbook(fileInputStream);
            XSSFSheet sheet = (XSSFSheet) xssfWorkbook.getSheet("Sheet1");
            XSSFRow row = sheet.getRow(0);
            System.out.println(row.getCell(0));

        } catch (Exception ex) {
            System.out.println("Exception: " + ex);
        } finally {
            fileInputStream.close();
        }
        System.setProperty("log4j.configurationFile", "./path_to_the_log4j2_config_file/log4j2.xml");

       // Logger log;
        //log = LogManager.getLogger(java.util.logging.Logger.class.getName());
    }

}
