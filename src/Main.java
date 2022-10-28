import java.io.*;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));
        PrintWriter out = new PrintWriter(new FileWriter("output.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            if (Pattern.matches("^(30|31|([0-2][1-9]))" +
                    "\\/(12|11|10|(0[1-9]))" +
                    "\\/((1000)|(0\\d{2}[1-9])|(0\\d[1-9]\\d)|(0[1-9]\\d\\d))$", line)) {
                out.println(line + " - YES");
            } else {
                out.println(line + " - NO");
            }
        }
        out.flush();
    }
}
