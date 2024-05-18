package org.example;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class APIClient {
    private static final String API_KEY = "fe1e8bfe8043196db47854f8";
    private static final String BASE_URL = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/latest/";

    public static JsonObject getExchangeRates(String baseCurrency) throws Exception {
        String url_str = BASE_URL + baseCurrency;
        URL url = new URL(url_str);
        HttpURLConnection request = (HttpURLConnection) url.openConnection();
        request.connect();

        JsonParser jp = new JsonParser();
        JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
        return root.getAsJsonObject();
    }
}
