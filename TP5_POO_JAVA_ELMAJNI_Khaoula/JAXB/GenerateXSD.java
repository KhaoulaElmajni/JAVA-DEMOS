package JAXB;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.SchemaOutputResolver;
import javax.xml.transform.Result;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class GenerateXSD {
    public static void main(String[] args) {
        try {
            JAXBContext context = JAXBContext.newInstance(Classe.class);

            context.generateSchema(new SchemaOutputResolver() {
                @Override
                public Result createOutput(String namespaceUri, String suggestedFileName) throws IOException {
                    File file = new File("students.xsd");
                    StreamResult result = new StreamResult(file);
                    result.setSystemId(file.getName());
                    return result;
                }
            });
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
