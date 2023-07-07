import java.io.File;
import java.io.IOException;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class PdfReader {

	public static void main(String[] args) throws IOException{

		test_sample();
	
	}
	
	public static void test_sample() throws IOException {
	    
	    File file = new File("C:\\Thong\\test\\src\\test.pdf");
	    PDDocument document = PDDocument.load(file);
	    PDFTextStripper stripper = new PDFTextStripper();
	    String text = stripper.getText(document);
	    System.out.println(text);
	    document.close();
	    
	}
}

