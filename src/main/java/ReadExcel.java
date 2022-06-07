import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcel {
    String path="C:\\Users\\vikto\\Desktop\\Book1.xlsx";
    FileInputStream fileInputStream=new FileInputStream(path);
    XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fileInputStream);
    XSSFSheet sheet= (XSSFSheet) xssfWorkbook.getSheet("Sheet1");
    XSSFRow row= sheet.getRow(0);



    public ReadExcel() throws IOException {
    }

}

