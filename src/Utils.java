import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

class Utils {
    static void writeToFile(ArrayList<Packet> packets) throws IOException {
        ArrayList<String> fileData = new ArrayList<>();
        for (Packet packet : packets) {
            fileData.add(packet.getData());
        }
        Path file = Paths.get("result.txt");
        Files.write(file,fileData,Charset.forName("UTF-8"));
    }
}
