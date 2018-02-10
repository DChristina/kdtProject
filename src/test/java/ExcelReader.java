import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook; - для нового формата xls

import java.io.File;
import java.io.FileInputStream;

public class ExcelReader {
    static HSSFWorkbook wb;//для xls
    static HSSFSheet sheet; // лист
    public static void setexcel(String path, int sheetnum) throws Exception
    {
        try
        {
            File src = new File(path);
            FileInputStream fis = new FileInputStream(src);
            wb = new HSSFWorkbook(fis);
            sheet = wb.getSheetAt(sheetnum);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    public static String getdata(int rownum, int cellnum)
    {

        String data = sheet.getRow(rownum).getCell(cellnum).getStringCellValue();

        return data;

    }
}
