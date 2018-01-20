package archiwizacjadanychzip;

    import java.io.*;
    import java.util.logging.Level;
    import java.util.logging.Logger;
    import java.util.zip.*;

public class Archiwizacjadanychzip {
    
    public static final int BUFFOR = 1024;
    
    String [] tab = new String[]{"build.xml", "manifest.mf", "przyklad.txt"};

    public static void main(String[] args) 
    {
        byte tmpData[] = new byte[BUFFOR];
        
        try {
               ZipOutputStream zOutS  = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream("nazwa_mojego_zipa.zip"), BUFFOR));
               
               for (int i = 0; i < tab.length; i++)
               {
                    BufferedInputStream inS = new BufferedInputStream(new FileInputStream(tab[i]"), BUFFOR);

                    zOutS.putNextEntry(new ZipEntry("przyklad.txt"));
                     int counter;
                     while ((counter = inS.read(tmpData,0,BUFFOR)) != -1)
                     {
                         zOutS.write(tmpData, 0, counter);
                     }
                     zOutS.closeEntry();

                     inS.close();
               }     
                
                zOutS.close();
                
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
