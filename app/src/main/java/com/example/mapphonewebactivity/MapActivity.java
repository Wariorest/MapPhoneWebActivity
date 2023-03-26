package com.example.mapphonewebactivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MapActivity extends Activity implements View.OnClickListener {

    Button btnMap;
    EditText editCoord;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.map);

        btnMap = (Button) findViewById(R.id.btnPhone);
        editCoord = (EditText) findViewById(R.id.phoneNumber);
        btnMap.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:"+editCoord.getText().toString()));
        startActivity(intent);
    }
}