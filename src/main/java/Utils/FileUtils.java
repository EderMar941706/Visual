package Utils;

import org.apache.commons.io.IOUtils;

import java.io.IOException;

public class FileUtils {
    public static boolean validatePDF(String filepath) throws IOException, InterruptedException {
        String command = String.format(
                "java -jar resources/ImageTester.jar -k %s -f %s",
                System.getProperty("applitools.api.key"),
                filepath);

        Process process = Runtime.getRuntime().exec(command);
        process.waitFor();
        String stream = IOUtils.toString(process.getInputStream(), "UTF-8");
        System.out.println(stream);

        if(stream != null && stream.contains("Mismatch")){
            return false;
        }

        return true;
    }
}
