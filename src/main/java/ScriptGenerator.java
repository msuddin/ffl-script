import java.io.*;

public class ScriptGenerator {

    private String originalFile = "script.txt";
    private String modifiedFile = "script_new.txt";

    public void generateScript() throws Exception {
        InputStream is = new FileInputStream(originalFile);

        BufferedReader buf = new BufferedReader(new InputStreamReader(is));

        String line = buf.readLine();
        StringBuilder sb = new StringBuilder();

        while(line != null){
            sb.append(line).append("\n");
            line = buf.readLine();
        }

        String fileAsString = sb.toString();
        fileAsString = fileAsString.replaceAll("[\\\r\\\n]+"," ");
        fileAsString = fileAsString.replaceAll("number","\nnumber");
        System.out.println("Contents : \n" + fileAsString);

        BufferedWriter writer = new BufferedWriter(new FileWriter(modifiedFile, false));
        writer.append(fileAsString);
        writer.close();
    }

}
