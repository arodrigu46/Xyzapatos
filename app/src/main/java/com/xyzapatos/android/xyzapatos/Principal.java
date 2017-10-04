package com.xyzapatos.android.xyzapatos;

import android.content.res.Resources;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Principal extends AppCompatActivity {

    private Resources resources;
    private Spinner spMarca;
    private String arrayMarca[];
    private EditText txtCantidad;
    private RadioButton rbMas;
    private RadioButton rbFem;
    private RadioButton rbZap;
    private RadioButton rbClas;
    private TextView lblResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);


        resources  = this.getResources();
        spMarca = (Spinner)findViewById(R.id.spMarca);
        arrayMarca = resources.getStringArray(R.array.arrayMarca);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, arrayMarca);
        spMarca.setAdapter(adapter);
        txtCantidad = (EditText) findViewById(R.id.txtCantidad);
        rbMas = (RadioButton) findViewById(R.id.rbMasculino);
        rbFem = (RadioButton) findViewById(R.id.rbFemenino);
        rbZap = (RadioButton) findViewById(R.id.rbZapatilla);
        rbClas  = (RadioButton) findViewById(R.id.rbClasico);
        lblResultado = (TextView) findViewById(R.id.lblValorAPagar);


    }
    public void calcular(View v){

    }


}
