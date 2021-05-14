package com.gzeinnumer.jsonraw.utils;

import android.app.Activity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class GblFunction {

    public static String inputStreamToString(InputStream inputStream) {
        try {
            byte[] bytes = new byte[inputStream.available()];
            inputStream.read(bytes, 0, bytes.length);
            String json = new String(bytes);
            return json;
        } catch (IOException e) {
            return null;
        }
    }

    public static String readFile(Activity activity, String fileName) {
        BufferedReader reader;
        StringBuilder content = new StringBuilder();
        try {
            reader = new BufferedReader(new InputStreamReader(activity.getAssets().open(fileName), "UTF-8"));
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line.trim());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return content.toString();

    }
}
