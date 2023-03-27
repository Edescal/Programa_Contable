package contabilidad;
import java.awt.*;
import java.io.*;
import java.util.*;
import org.apache.pdfbox.pdmodel.*;
import org.apache.pdfbox.pdmodel.font.*;
import org.apache.pdfbox.pdmodel.PDPageContentStream.*;

public class GenerarReporte {
    
    private final String path = System.getProperty("user.dir") + "/Data/Reporte.pdf";
    private final String catalogo = System.getProperty("user.dir") + "/Data/catalogo.csv";
    private final PDFont font = PDType1Font.TIMES_ROMAN;
    private final float fontSize = 12;
    private final float leading = 1f * fontSize;

    public boolean generarReporte(String[] cuentas) {
        
        try {
            //PDDocument doc = new PDDocument();
            //PDPage page = new PDPage();
            //doc.addPage(page);
            
            File file = new File(System.getProperty("user.dir")+"/Data/Plantilla.pdf");
            PDDocument doc = PDDocument.load(file);
            PDPage page = doc.getPage(0);
            
            var stream = new PDPageContentStream(doc, page, AppendMode.APPEND, true, true);
            
            //Configurar tamaño y fuente
            stream.setNonStrokingColor(Color.BLACK);
            stream.setFont(font, fontSize);
            stream.setLeading(leading);
            stream.beginText();
            
            //Escribir texto
            stream.newLineAtOffset(80, page.getMediaBox().getHeight() - (14 * leading));
            stream.showText("CATÁLOGO DE CUENTAS:");

            stream.newLineAtOffset(0, -2*leading);
            stream.showText("Código");
            stream.newLineAtOffset(70, 0);
            stream.showText("Nombre");
            stream.newLineAtOffset(200, 0);
            stream.showText("Saldo");
            stream.newLineAtOffset(-270, -leading);
        
            for(String s: cuentas) {
                var split = s.split(",");
                stream.showText(split[0]);
                stream.newLineAtOffset(70, 0);
                stream.showText(split[1]);
                stream.newLineAtOffset(200, 0);
                stream.showText(split[2]);
                stream.newLineAtOffset(-270, -leading);
                
                //stream.showText(s);
                //stream.newLine();
            }
            
            
            
            stream.endText();
            stream.close();
            doc.save(path);
            doc.close();
            
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
