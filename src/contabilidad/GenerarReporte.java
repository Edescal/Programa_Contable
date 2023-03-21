package contabilidad;
import java.awt.*;
import java.io.*;
import javax.swing.JOptionPane;
import org.apache.pdfbox.pdmodel.*;
import org.apache.pdfbox.pdmodel.font.*;
import org.apache.pdfbox.pdmodel.PDPageContentStream.*;

public class GenerarReporte {
    
    private final String path = System.getProperty("user.dir") + "/Data/Reporte.pdf";
    private final String catalogo = System.getProperty("user.dir") + "/Data/catalogo.csv";
    private final PDFont font = PDType1Font.TIMES_ROMAN;
    private final float fontSize = 14;
    private final float leading = 1f * fontSize;

    public boolean generarReporte(String[] cuentas) {
        
        try {
            PDDocument doc = new PDDocument();
            PDPage page = new PDPage();
            doc.addPage(page);
            
            var stream = new PDPageContentStream(doc, page, AppendMode.APPEND, true, true);
            
            //Configurar tamaño y fuente
            stream.setNonStrokingColor(Color.BLACK);
            stream.setFont(font, fontSize);
            stream.setLeading(leading);
            stream.beginText();
            stream.newLineAtOffset(60, page.getMediaBox().getHeight() - (8*leading));
            //Escribir texto

            stream.showText("CATÁLOGO DE CUENTAS:");
            stream.newLineAtOffset(0, -2*leading);
            
            for(String s: cuentas) {
                stream.showText(s);
                stream.newLine();
            }
            
            stream.endText();
            stream.close();
            doc.save(path);
            
        } catch(Exception e) {
            
        }
        
        
        
        
        
        return false;
    }
  
    public void abrirReporte() throws IOException {

        File file = new File(path);
        if (file.exists()) {
            //Si el archivo existe se abre
            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().open(file);
            }
        }
    }

    
    public void write(String[] text) {
    
        try {
            
            File membrete = new File(System.getProperty("user.dir") + "/Data/Plantilla.pdf");
            
            PDDocument doc = PDDocument.load(membrete);
            PDPage page = doc.getPage(0);
            
            
            
            PDDocument reporte = new PDDocument();
            reporte.addPage(new PDPage());
            reporte.addPage(new PDPage());
            
            PDPageContentStream s = new PDPageContentStream(reporte, reporte.getPage(0), AppendMode.APPEND, true, true);
            
            s.beginText();

            s.newLineAtOffset(85, 560);
            
            s.setNonStrokingColor(Color.BLACK);
            s.setFont(PDType1Font.TIMES_ROMAN, 14);
            s.setLeading(1.5f*12);
            /*
            s.showText("CATÁLOGO DE CUENTAS: ");
            s.newLine();
             */
            for (String t : text) {
                s.showText(t);
                s.newLine();
            }
            
            s.endText();
            s.close();
            
            reporte.save(path);
            
        } catch(IOException e) {
            System.out.println("ERROR: "+e.getMessage());
        } catch(Exception e) {
            System.out.println("ERROR: "+e.getMessage());
        }
        
            
    }

    public void save(String text) {
        try {
            Writer writer = new FileWriter(catalogo);
            var sb = new StringBuilder();
            
            sb.append(text);
            
            writer.write(sb.toString());
            writer.close();
        } catch(IOException e) {
            System.out.println("ERROR: "+e.getMessage());
        }
    }
    
    public String readCSV(){
        var text = "";
        try{
            var reader = new FileReader(catalogo);
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
