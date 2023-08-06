import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SaveToJson {
    Input input;
    public SaveToJson(Input input) {
        this.input = input;
    }
        public void saveToJson() {
        String fileName = "order.json";
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write("{\n");
            writer.write("\"Имя клиента\":\""+ input.getClientName() + "\",\n");
            writer.write("\"Продукт\":\""+input.getProduct()+"\",\n");
            writer.write("\"Количество\":"+input.getQnt()+",\n");
            writer.write("\"Цена\":"+input.getPrice()+"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public void readToJson(){
        File file = new File("order.json");
        try(FileReader fileReader = new FileReader(file)) {
            char[] a = new char[(int) file.length()];
            fileReader.read(a);
            String fileContent = new String(a);
            ArrayList<String> content = new ArrayList<>(List.of(fileContent.replaceAll("[{\"\n]","").split("}")));
            for (String element: content){
                System.out.printf("%s\n", element);
            };
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
