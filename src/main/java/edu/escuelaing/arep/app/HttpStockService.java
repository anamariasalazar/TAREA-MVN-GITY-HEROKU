package edu.escuelaing.arep.app;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.IOException;
import java.util.ArrayList;

public abstract class HttpStockService {
    private ArrayList<URL> URLS = new ArrayList<URL>();
    private static final String USER_AGENT = "Mozilla/5.0";
    private ArrayList <String> cache = new ArrayList<String>();
    public String TimeSeriesDaily() throws IOException{
        String responseStr =  "None";
        System.out.println(getURL());
        URL obj = new URL(getURL());
        if (!URLS.contains(obj)) {
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("User-Agent", USER_AGENT);

            //The following invocation perform the connection implicitly before getting the code
            int responseCode = con.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) { // success
                BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String inputLine;
                StringBuffer response = new StringBuffer();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }

                in.close();
                responseStr = response.toString();
            } else {
                System.out.println("GET request not worked");
            }
            System.out.println("GET DONE");
            URLS.add(obj);
            cache.add(responseStr);
            return responseStr;
        }
        System.out.println(1);
        return cache.get(URLS.indexOf(obj));
    }
    abstract public String getURL();
    abstract public void setStock(String stock);
    abstract public String getStock();
}