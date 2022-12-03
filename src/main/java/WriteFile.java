import java.io.*;

public class WriteFile {

    public static String writeStringInFile (String string, String fileName) throws IOException {
        File output = new File("/Users/vulpix_li/Downloads/Serialization/src/main/resources/" + fileName);
        FileWriter writer = new FileWriter(output);

        writer.write(string);
        writer.flush();
        writer.close();
        return "Создан файл " + output.getName() + ", размер " + output.length();
    }
    public static String writeByteInFile (String string, String fileName) throws IOException {
        File file = new File("/Users/vulpix_li/Downloads/Serialization/src/main/resources/" + fileName + ".ser");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(string);
        objectOutputStream.close();
        return "Создан файл " + file.getName() + ", размер " + file.length();
    }
}
