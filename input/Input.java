package input;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {
    /**
     * generates an input
     * @return Int
     * @throws IOException
     */
    public static int main () throws IOException{
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(inputStreamReader);
        int lengthArray = Integer.parseInt( in.readLine());
        return lengthArray;
    }
}
