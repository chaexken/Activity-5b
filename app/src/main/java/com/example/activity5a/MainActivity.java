package com.example.activity5a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    Button button_convert;
    EditText text_base_currency, text_result_currency;
    Spinner spin_from_convert, spin_to_convert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text_base_currency = (EditText) findViewById(R.id.txt_base_currency);
        text_result_currency = (EditText) findViewById(R.id.txt_result_currency);
        spin_to_convert = (Spinner) findViewById(R.id.spinner_to_currency);
        spin_from_convert =(Spinner) findViewById(R.id.spinner_from_currency);
        button_convert = (Button) findViewById(R.id.btn_convert);

        String [] dropDownList = {"USD","PHP","EUR","KRW"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String> (this, R.layout.support_simple_spinner_dropdown_item,dropDownList);
        spin_to_convert.setAdapter(adapter);
        spin_from_convert.setAdapter(adapter);

        button_convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viow){
                RetrofitInterface retrofitInterface = RetrofitBuilder.getRetrofitInstance().create(RetrofitInstance.class);

                Call<JsonObject> call = retrofitInterface.getExchangeCurrency(spin_from_convert.getSelectedItem().toString());
                call.enqueue(new Callback<JsonObject>() {
                    @Override
                    public void onResponse(Call )
                }
            })
            }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}