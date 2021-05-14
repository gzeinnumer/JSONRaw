package com.gzeinnumer.jsonraw.utils;

import android.app.Activity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class GblFunction {

    public static String readFile(Activity activity, String fileName) {
        BufferedReader reader;
        StringBuilder content = new StringBuilder();
        try {
            reader = new BufferedReader(new InputStreamReader(activity.getAssets().open(fileName), StandardCharsets.UTF_8));
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
