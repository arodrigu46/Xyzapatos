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
        if(validar()){
            Double resultado = 0.0;
            Double unidades = Double.parseDouble(txtCantidad.getText().toString());
            int posMarca = spMarca.getSelectedItemPosition();
            if(rbMas.isChecked()==true && rbZap.isChecked()==true && posMarca==0){
                resultado = (unidades*120000);

            }else{
                if(rbMas.isChecked()==true && rbZap.isChecked()==true && posMarca==1){
                    resultado = (unidades*140000);
                }else{
                    if(rbMas.isChecked()==true && rbZap.isChecked()==true && posMarca==2){
                        resultado = (unidades*130000);
                    }else{
                        if(rbMas.isChecked()==true && rbClas.isChecked()==true && posMarca==0){
                            resultado = (unidades*50000);
                        }else{
                            if(rbMas.isChecked()==true && rbClas.isChecked()==true && posMarca==1){
                                resultado = (unidades*80000);

                            }else{
                                if(rbMas.isChecked()==true && rbClas.isChecked()==true && posMarca==2){
                                    resultado = (unidades*100000);

                                }else{
                                    if(rbFem.isChecked()==true && rbZap.isChecked()==true && posMarca==0){
                                        resultado = (unidades*100000);
                                    }else{
                                        if (rbFem.isChecked()==true && rbZap.isChecked()==true && posMarca==1) {

                                            resultado = (unidades*130000);
                                        }else{
                                            if(rbFem.isChecked()==true && rbZap.isChecked()==true && posMarca==2){
                                                resultado = (unidades*110000);
                                            }else{
                                                if(rbFem.isChecked()==true && rbClas.isChecked()==true && posMarca==0){
                                                    resultado = (unidades*60000);
                                                }else{
                                                    if(rbFem.isChecked()==true && rbClas.isChecked()==true && posMarca==1){
                                                        resultado = (unidades*70000);
                                                    }else{
                                                        if(rbFem.isChecked()==true && rbClas.isChecked()==true && posMarca==2){
                                                            resultado = (unidades*120000);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }





            lblResultado.setText("$ "+String.valueOf(resultado)+" COP");
        }
    }

    public boolean validar(){
        if(txtCantidad.getText().toString().isEmpty() || txtCantidad.getText().toString().equals("0")){
            Toast.makeText(this, resources.getString(R.string.error00),Toast.LENGTH_SHORT).show();
            return false;
        }else{
            if(rbMas.isChecked()!=true && rbFem.isChecked()!=true){
                Toast.makeText(this, resources.getString(R.string.error01),Toast.LENGTH_SHORT).show();
                return false;
            }else{
                if(rbZap.isChecked()!=true && rbClas.isChecked()!=true){
                    Toast.makeText(this, resources.getString(R.string.error02),Toast.LENGTH_SHORT).show();
                    return false;
                }else{
                    return true;
                }
            }
        }


    }
}
