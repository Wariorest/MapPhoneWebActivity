package com.example.mapphonewebactivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PhoneActivity extends Activity implements View.OnClickListener {

    Button btnPhone;
    EditText phoneNumberBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phone);

        btnPhone = (Button) findViewById(R.id.btnPhone);
        phoneNumberBox = (EditText) findViewById(R.id.phoneNumber);
        btnPhone.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + phoneNumberBox.getText().toString()));
        startActivity(intent);
    }
}
