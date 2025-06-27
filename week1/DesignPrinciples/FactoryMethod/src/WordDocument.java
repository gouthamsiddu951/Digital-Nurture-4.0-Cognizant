package week1.DesignPrinciples.FactoryMethod.src;

public class WordDocument implements Document {
    @Override
    public void open() {
        System.out.println("Opening a Word document.");
    }
}
