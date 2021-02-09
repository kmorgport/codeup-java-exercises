import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileIOLesson {
    public static void main(String[] args) throws IOException {
        String directory = "languages";
        String filename = "languages.txt";

        Path langDirect = Paths.get(directory);
        Path dataFile = Paths.get(directory,filename);

        if(Files.notExists(langDirect)){
            Files.createDirectories(langDirect);
        }
        if(!Files.exists(dataFile)){
            Files.createFile(dataFile);
        }
    }

}
