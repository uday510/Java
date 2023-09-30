import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.http.HttpConnectTimeoutException;
import java.net.http.HttpResponse;
import java.net.URL;

public class Main {
    public static void main(String[] args) {

        try {
            URL url = new URL("https://checkip.amazonaws.com/");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");

            if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {

                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String line;
                StringBuilder response = new StringBuilder();

                // Read the response line by line
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }

                // Close the reader and the connection
                reader.close();
                connection.disconnect();


                System.out.println(response);
            } else {
                System.out.println("HTTP error! Status code: " + connection.getResponseCode());
            }

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}