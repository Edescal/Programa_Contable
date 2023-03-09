package contabilidad;
import java.awt.*;
import java.io.*;
import javax.swing.JOptionPane;
import org.apache.pdfbox.pdmodel.*;
import org.apache.pdfbox.pdmodel.font.*;
import org.apache.pdfbox.pdmodel.PDPageContentStream.*;

public class GenerarReporte {
    
    public void write(String[] text) {
    
        try {
            
            File membrete = new File(System.getProperty("user.dir") + "/Data/Plantilla.pdf");
            PDDocument doc = PDDocument.load(membrete);
            PDPage page = doc.getPage(0);
            
            PDPageContentStream s = new PDPageContentStream(doc, page, AppendMode.APPEND, true, true);
            
            s.beginText();

            s.newLineAtOffset(85, 560);
            
            s.setNonStrokingColor(Color.BLACK);
            s.setFont(PDType1Font.TIMES_ROMAN, 14);
            s.setLeading(1.5f*12);
            /*
            s.showText("CATÁLOGO DE CUENTAS: ");
            s.newLine();
            */
            for(int i = 0; i < text.length; i++) {
                s.showText(text[i]);
                s.newLine();
            }
            
            s.endText();
            s.close();
            
            String path = System.getProperty("user.dir") + "/Data/Reporte.pdf";
            doc.save(path);
            
        } catch(IOException e) {
            System.out.println("ERROR: "+e.getMessage());
        } catch(Exception e) {
            System.out.println("ERROR: "+e.getMessage());
        }
        
            
    }

    public void save(String text) {
        var path = System.getProperty("user.dir") + "/Data";
        try {
            Writer writer = new FileWriter(path+"//catalogo.csv");
            var sb = new StringBuilder();
            
            sb.append(text);
            
            writer.write(sb.toString());
            writer.close();
        } catch(IOException e) {
            System.out.println("ERROR: "+e.getMessage());
        }
    }
    
    public String readCSV(){
        var path = System.getProperty("user.dir") + "/Data/catalogo.csv";
        var text = "";
        try{
            var reader = new FileReader(path);
            var sb = new StringBuilder();
            
            int i = 0;
            while((i = reader.read()) != -1) {
                sb.append((char)i);
            }
            reader.close();
            
            text = sb.toString();
            
        } catch(Exception e) {
            
        }
        return text;
    }
}
