package com.xyzapatos.android.xyzapatos;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Principal extends AppCompatActivity {

    private Resources resources;
    private Spinner spMarca;
    private String arrayMarca[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);


        resources  = this.getResources();
        spMarca = (Spinner)findViewById(R.id.spMarca);
        arrayMarca = resources.getStringArray(R.array.arrayMarca);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, arrayMarca);
        spMarca.setAdapter(adapter);



    }
}
