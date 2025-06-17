package Week_1.Engineering_concepts.Design_Patterns_and_Principles.FactoryMethodPatternExample;

public class ExcelFactory extends DocumentFactory {
    public Document createDocument() {
        return new ExcelDocument();
    }
}
