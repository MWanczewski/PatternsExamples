package structuralPattern.flyWeight;

public class DocumentParser {
    public Document parseDocument(String name, String file){
        String[] split = file.split(" -- ");
        Document document = new Document();
        document.setName(name);
        document.setHeader(split[0]);
        document.setContent(split.length > 1 ? split[1]:"" );
        document.setFooter(split.length > 2 ? split[2] :"");
        return document;
    }
}
