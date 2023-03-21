package contabilidad;

import java.awt.Color;
import java.util.List;
import java.io.*;
import java.util.ArrayList;

import org.apache.pdfbox.pdmodel.*;
import org.apache.pdfbox.pdmodel.font.*;
import org.apache.pdfbox.pdmodel.PDPageContentStream.*;
import org.apache.pdfbox.pdmodel.common.PDRectangle;

/* Esta clase es solo para probar cosas
   con la librería de pdfbox como escribir
   parrafos y justificarlos
   no se usa en ninguna parte del programa 
   y no deberia usarse por ningun motivo
 */
public class MultiplePages {

    private static PDFont font = PDType1Font.TIMES_ROMAN;
    private static float fontSize = 12;

    public static void main(String[] args) throws Exception {
        //test()

        PDDocument document = new PDDocument();
        PDPage page = new PDPage();
        document.addPage(page);

        PDPageContentStream s = new PDPageContentStream(document, document.getPage(0), AppendMode.APPEND, true, true);

        float marginY = 80;
        float marginX = 60;

        var mediaBox = page.getMediaBox();
        //Width es (Ancho de la pagina) - (Margen izq + Margen der)
        float width = mediaBox.getWidth() - (2 * marginX);

        //Coordenadas de inicio para el texto
        float x = mediaBox.getLowerLeftX() + marginX;
        float y = mediaBox.getUpperRightY() - marginY;

        s.setNonStrokingColor(Color.BLACK);
        s.setLeading(1f * fontSize);
        s.setFont(font, fontSize);
        s.beginText();
        
        s.newLineAtOffset(marginX, mediaBox.getHeight() - (10 * fontSize));
        s.showText("CATÁLOGO DE CUENTAS:");
        /*
        for(int i = 0; i < 90; i++) {
            s.showText(i+"  ||///////////////||||||||||||||||||||||||||||||||||");
            s.newLine();
        }
        */

        //addParagraph(s, width, startX, startY, text1, true);
        s.endText();
        s.close();

        final OutputStream outputStream = new FileOutputStream(
                "multiplepages.pdf");
        document.save(outputStream);
        
    }

    private static void test() throws Exception {
        String text1 = "Lorem ipsum dolor sit amet, consetetur sadipscing elitr, "
                + "sed diam nonumy eirmod tempor invidunt ut labore et dolore magna "
                + "aliquyam erat, _sed diam_ voluptua. At vero eos et *accusam et justo* "
                + "duo dolores et ea rebum. Stet clita kasd gubergren, no sea takimata "
                + "sanctus est *Lorem ipsum _dolor* sit_ amet. Lorem ipsum dolor sit amet, "
                + "consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt "
                + "ut labore et dolore magna aliquyam erat, *sed diam voluptua."
                + "At vero eos et accusam* et justo duo dolores et ea rebum. Stet clita kasd "
                + "gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.";

        String text2 = "At *vero eos et accusam* et justo duo dolores et ea rebum."
                + "Stet clita kasd gubergren, no sea takimata\n\n"
                + "sanctus est Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet, "
                + "_consetetur sadipscing elitr_, sed diam nonumy eirmod tempor invidunt "
                + "ut labore et dolore magna aliquyam erat, sed diam voluptua. At vero "
                + "eos et _accusam et *justo* duo dolores_ et ea rebum. Stet clita kasd "
                + "gubergren, no sea takimata sanctus est Lorem ipsum dolor sit amet.\n";

        PDDocument document = new PDDocument();
        PDPage page = new PDPage();
        document.addPage(page);

        PDRectangle mediaBox = page.getMediaBox();

        //792 * 612 px
        float marginY = 80;
        float marginX = 60;
        float width = mediaBox.getWidth() - (2 * marginX);
        float startX = mediaBox.getLowerLeftX() + marginX;
        float startY = mediaBox.getUpperRightY() - marginY;

        PDPageContentStream s = new PDPageContentStream(document, document.getPage(0), AppendMode.APPEND, true, true);

        s.beginText();

        var split = text2.split("\n");
        for (int i = 0; i < split.length; i++) {
            //s.showText(i+" "+split[0]);
            //s.newLine();
            addParagraph(s, width, startX, startY, split[i], false);
            s.newLine();

        }

        //addParagraph(s, width, startX, startY, text1, true);
        s.endText();
        s.close();

        final OutputStream outputStream = new FileOutputStream(
                "multiplepages.pdf");
        document.save(outputStream);

    }

    private static void addParagraph(PDPageContentStream contentStream, float width, float sx, float sy, String text) throws IOException {
        addParagraph(contentStream, width, sx, sy, text, false);
    }

    private static void addParagraph(PDPageContentStream contentStream, float width, float sx, float sy, String text, boolean justify) throws IOException {
        List<String> lines = parseLines(text, width);

        contentStream.setNonStrokingColor(Color.BLACK);
        contentStream.setLeading(1f * fontSize);
        contentStream.setFont(font, fontSize);
        contentStream.newLineAtOffset(sx, sy);

        for (String line : lines) {
            float charSpacing = 0;
            if (justify) {
                if (line.length() > 1) {
                    float size = fontSize * font.getStringWidth(line) / 1000;
                    float free = width - size;
                    if (free > 0 && !lines.get(lines.size() - 1).equals(line)) {
                        charSpacing = free / (line.length() - 1);
                    }
                }
            }
            contentStream.setCharacterSpacing(charSpacing);
            contentStream.showText(line);
            //contentStream.newLine();
            contentStream.newLineAtOffset(0, -1f * fontSize);
        }
    }

    private static List<String> parseLines(String text, float width) throws IOException {
        List<String> lines = new ArrayList<String>();
        int lastSpace = -1;
        while (text.length() > 0) {
            int spaceIndex = text.indexOf(' ', lastSpace + 1);
            if (spaceIndex < 0) {
                spaceIndex = text.length();
            }
            String subString = text.substring(0, spaceIndex);
            float size = fontSize * font.getStringWidth(subString) / 1000;
            if (size > width) {
                if (lastSpace < 0) {
                    lastSpace = spaceIndex;
                }
                subString = text.substring(0, lastSpace);
                lines.add(subString);
                text = text.substring(lastSpace).trim();
                lastSpace = -1;
            } else if (spaceIndex == text.length()) {
                lines.add(text);
                text = "";
            } else {
                lastSpace = spaceIndex;
            }
        }
        return lines;
    }
}
