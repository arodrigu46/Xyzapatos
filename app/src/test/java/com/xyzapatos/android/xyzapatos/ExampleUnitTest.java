package com.xyzapatos.android.xyzapatos;

import android.content.res.Resources;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }
    @Test
    public void probarCombinacion1(){
        int cantidad;
        int sex1;
        int tip1;
        int marc1;
        int res;
        int actual;
        int esperado;

        cantidad =1;
        sex1 = 0;
        tip1 = 0;
        marc1 = 0;

        actual = Metodos.total(sex1,tip1,marc1,cantidad);
        esperado = 120000;

        assertEquals(actual,esperado,0);

    }
    @Test
    public void probarCombinacion2(){
        int cantidad;
        int sex1;
        int tip1;
        int marc1;
        int res;
        int actual;
        int esperado;

        cantidad =1;
        sex1 = 0;
        tip1 = 0;
        marc1 = 1;

        actual = Metodos.total(sex1,tip1,marc1,cantidad);
        esperado = 140000;

        assertEquals(actual,esperado,0);

    }
    @Test
    public void probarCombinacion3(){
        int cantidad;
        int sex1;
        int tip1;
        int marc1;
        int res;
        int actual;
        int esperado;

        cantidad =1;
        sex1 = 0;
        tip1 = 0;
        marc1 = 2;

        actual = Metodos.total(sex1,tip1,marc1,cantidad);
        esperado = 130000;

        assertEquals(actual,esperado,0);

    }
    @Test
    public void probarCombinacion4(){
        int cantidad;
        int sex1;
        int tip1;
        int marc1;
        int res;
        int actual;
        int esperado;

        cantidad =1;
        sex1 = 0;
        tip1 = 1;
        marc1 = 0;

        actual = Metodos.total(sex1,tip1,marc1,cantidad);
        esperado = 50000;

        assertEquals(actual,esperado,0);

    }
    @Test
    public void probarCombinacion5(){
        int cantidad;
        int sex1;
        int tip1;
        int marc1;
        int res;
        int actual;
        int esperado;

        cantidad =1;
        sex1 = 0;
        tip1 = 1;
        marc1 = 1;

        actual = Metodos.total(sex1,tip1,marc1,cantidad);
        esperado = 80000;

        assertEquals(actual,esperado,0);

    }
    @Test
    public void probarCombinacion6(){
        int cantidad;
        int sex1;
        int tip1;
        int marc1;
        int res;
        int actual;
        int esperado;

        cantidad =1;
        sex1 = 0;
        tip1 = 1;
        marc1 = 2;

        actual = Metodos.total(sex1,tip1,marc1,cantidad);
        esperado = 100000;

        assertEquals(actual,esperado,0);

    }
    @Test
    public void probarCombinacion7(){
        int cantidad;
        int sex1;
        int tip1;
        int marc1;
        int res;
        int actual;
        int esperado;

        cantidad =1;
        sex1 = 1;
        tip1 = 0;
        marc1 = 0;

        actual = Metodos.total(sex1,tip1,marc1,cantidad);
        esperado = 100000;

        assertEquals(actual,esperado,0);

    }
    @Test
    public void probarCombinacion8(){
        int cantidad;
        int sex1;
        int tip1;
        int marc1;
        int res;
        int actual;
        int esperado;

        cantidad =1;
        sex1 = 1;
        tip1 = 0;
        marc1 = 1;

        actual = Metodos.total(sex1,tip1,marc1,cantidad);
        esperado = 130000;

        assertEquals(actual,esperado,0);

    }
    @Test
    public void probarCombinacion9(){
        int cantidad;
        int sex1;
        int tip1;
        int marc1;
        int res;
        int actual;
        int esperado;

        cantidad =1;
        sex1 = 1;
        tip1 = 0;
        marc1 = 2;

        actual = Metodos.total(sex1,tip1,marc1,cantidad);
        esperado = 110000;

        assertEquals(actual,esperado,0);

    }
    @Test
    public void probarCombinacion10(){
        int cantidad;
        int sex1;
        int tip1;
        int marc1;
        int res;
        int actual;
        int esperado;

        cantidad =1;
        sex1 = 1;
        tip1 = 1;
        marc1 = 0;

        actual = Metodos.total(sex1,tip1,marc1,cantidad);
        esperado = 60000;

        assertEquals(actual,esperado,0);

    }
    @Test
    public void probarCombinacion11(){
        int cantidad;
        int sex1;
        int tip1;
        int marc1;
        int res;
        int actual;
        int esperado;

        cantidad =1;
        sex1 = 1;
        tip1 = 1;
        marc1 = 1;

        actual = Metodos.total(sex1,tip1,marc1,cantidad);
        esperado = 70000;

        assertEquals(actual,esperado,0);

    }
    @Test
    public void probarCombinacion12(){
        int cantidad;
        int sex1;
        int tip1;
        int marc1;
        int res;
        int actual;
        int esperado;

        cantidad =1;
        sex1 = 1;
        tip1 = 1;
        marc1 = 2;

        actual = Metodos.total(sex1,tip1,marc1,cantidad);
        esperado = 120000;

        assertEquals(actual,esperado,0);

    }
}