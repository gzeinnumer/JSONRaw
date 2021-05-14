package com.gzeinnumer.jsonraw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.gzeinnumer.jsonraw.model.ResponseData;
import com.gzeinnumer.jsonraw.utils.GblFunction;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String myJson = GblFunction.readFile(MainActivity.this, "raw/my_json.json");
        ResponseData myModel = new Gson().fromJson(myJson, ResponseData.class);

        ((TextView) findViewById(R.id.tv1)).setText(myModel.getList().get(0).getName());
        ((TextView) findViewById(R.id.tv2)).setText(myJson);
    }
}