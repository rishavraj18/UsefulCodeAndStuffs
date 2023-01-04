import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class GetYouPublicIPByAWS {
    
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://checkip.amazonaws.com/");
        BufferedReader br = new BufferedReader(new InputStreamReader(
        url.openStream()
      ));

      String line;
      while((line=br.readLine()) != null){
        System.out.println(line);
      }
    }   
}
