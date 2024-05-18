package org.example;

import com.google.gson.JsonObject;

import java.text.DecimalFormat;

public class CurrencyConverter {
    private static final DecimalFormat df = new DecimalFormat("#.##");

    public static double convert(String fromCurrency, String toCurrency, double amount) throws Exception {
        JsonObject jsonobj = APIClient.getExchangeRates(fromCurrency);
        double rate = jsonobj.getAsJsonObject("conversion_rates").get(toCurrency).getAsDouble();
        return amount * rate;
    }

    public static void performConversion(String fromCurrency, String toCurrency, double amount) throws Exception {
        double result = convert(fromCurrency, toCurrency, amount);
        System.out.println(fromCurrency + " to " + toCurrency + ": " + df.format(result));
    }
}
