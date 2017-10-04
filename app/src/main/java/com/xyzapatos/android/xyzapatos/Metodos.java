package com.xyzapatos.android.xyzapatos;

import android.content.res.Resources;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

/**
 * Created by android on 03/10/2017.
 */

public class Metodos {

    public static int total(int sex1, int tip1, int marc1, int cant){
        int res=0;

        if(sex1==0 && tip1==0 && marc1==0){
            res = 120000*cant;
        }else{
            if(sex1==0 && tip1==0 && marc1==1){
                res = 140000*cant;
            }else{
                if(sex1==0 && tip1==0 && marc1==2){
                    res = 130000*cant;
                }else{
                    if(sex1==0 && tip1==1 && marc1==0){
                        res = 50000*cant;
                    }else{
                        if(sex1==0 && tip1==1 && marc1==1){
                            res = 80000*cant;
                        }else{
                            if(sex1==0 && tip1==1 && marc1==2){
                                res = 100000*cant;
                            }else{
                                if(sex1==1 && tip1==0 && marc1==0){
                                    res = 100000*cant;
                                }else{
                                    if(sex1==1 && tip1==0 && marc1==1){
                                        res = 130000*cant;
                                    }else{
                                        if(sex1==1 && tip1==0 && marc1==2){
                                            res = 110000*cant;
                                        }else{
                                            if(sex1==1 && tip1==1 && marc1==0){
                                                res = 60000*cant;
                                            }else{
                                                if(sex1==1 && tip1==1 && marc1==1){
                                                    res = 70000*cant;
                                                }else{
                                                    if(sex1==1 && tip1==1 && marc1==2){
                                                        res = 120000*cant;
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

        return res;

    }
}
