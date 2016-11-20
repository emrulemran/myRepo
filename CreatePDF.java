package itextpdf.practice;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import com.lowagie.text.Document;
import com.lowagie.text.pdf.PdfWriter;
import com.lowagie.text.*;

public class CreatePDF {
	public static void main(String[] args) {
		try {
			Document document = new Document();
			OutputStream outputStream = new FileOutputStream(new File("Your file path goes here!"));
			PdfWriter.getInstance(document, outputStream);
			document.open();
			document.add(new Paragraph("Hello World!, " + "**This is a test pdf file!!** :)"));
			document.add(new Paragraph("Hello Boyz!, " + "This is a Holiday!! :)"));
			document.close();
			outputStream.close();
			System.out.println("pdf created successfully");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
