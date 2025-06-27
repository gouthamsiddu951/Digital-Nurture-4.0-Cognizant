package week1.DesignPrinciples.FactoryMethod.src;

public class PdfDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening a PDF document.");
    }
}
