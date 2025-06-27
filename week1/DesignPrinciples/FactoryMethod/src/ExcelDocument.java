package week1.DesignPrinciples.FactoryMethod.src;

public class ExcelDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening an Excel document.");
    }
}
