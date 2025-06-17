package Week_1.Engineering_concepts.Design_Patterns_and_Principles.FactoryMethodPatternExample;

public class ExcelDocument implements Document {
    public void open() {
        System.out.println("Opening an Excel document.");
    }
}