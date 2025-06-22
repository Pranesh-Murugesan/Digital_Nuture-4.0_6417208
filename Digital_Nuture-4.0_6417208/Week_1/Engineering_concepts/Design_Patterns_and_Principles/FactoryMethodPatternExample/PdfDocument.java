package Week_1.Engineering_concepts.Design_Patterns_and_Principles.FactoryMethodPatternExample;

public class PdfDocument implements Document {
    public void open() {
        System.out.println("Opening a PDF document.");
    }
}
