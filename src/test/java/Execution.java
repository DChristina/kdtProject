public class Execution {
    public static void main(String args[]) throws Exception{
        ExcelReader.setexcel("C:\\Users\\Tihon\\Desktop\\Excel.xls",0);
        Comands com =new Comands();

        for (int rownum = 0; rownum< 5; rownum = rownum + 1) {
            String str = ExcelReader.getdata(rownum, 0);
            if (str.equals("OpenChrome")){
                com.OpenChrome();
            }
             else if (str.equals("EnterURL")){
                com.EnterURL(ExcelReader.getdata(rownum, 1));
            }
            else if (str.equals("EnterSearchField")){
                com.EnterSearchField(ExcelReader.getdata(rownum, 1));
            }
            else if (str.equals("ClickOnSearchButton")){
                com.ClickOnSearchButton();
            }
            else {
                com.GoTo3dLink();
            }
        }

        //System.out.println(str);// ExcelReader.getdata(1,1);


    }
}
