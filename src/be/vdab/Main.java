package be.vdab;
public class Main {
    public static void main(String[] args) {
        //DocumentFactory factory = new DocumentFactory();
        //Document document = factory.open("liedje.docx");
        Document document = DocumentFactory.INSTANCE.open("liedje.docx");
        document.printPreview();        
        document.print();
    }    
}
