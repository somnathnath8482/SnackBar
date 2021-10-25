package com.somnath.snackbar;
import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;
import android.widget.TextView;

import androidx.coordinatorlayout.widget.CoordinatorLayout;

import com.google.android.material.snackbar.Snackbar;

public class snackbar {

    public void showNormalSnackBar(CoordinatorLayout coordinatorLayout,String text,int Duration){
        Snackbar snackbar = Snackbar.make(coordinatorLayout,text,Duration);
        snackbar.show();

    }
    public void showNormalSnackBar(CoordinatorLayout coordinatorLayout,String text,int Duration,String ButtonText){
        Snackbar snackbar = Snackbar.make(coordinatorLayout,text,Duration);
        snackbar.setAction(ButtonText, new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                snackbar.dismiss();
            }
        });
        snackbar.show();

    }
    public void showNormalSnackBar(Context context, View view,CharSequence text, int Duration){
        Snackbar snackbar = Snackbar.make(context,view,text,Duration);
        snackbar.show();

    }

    public void DynamicSnackBar(CoordinatorLayout coordinatorLayout, String message, int Duration, String buttonText, int Textcolor, int BttonColor){
        Snackbar snackbar = Snackbar.make(coordinatorLayout,message,Duration);
        snackbar.setTextColor(Textcolor);
        snackbar.setActionTextColor(BttonColor);
        snackbar.setAction(buttonText, new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(snackbar.isShown()){
                    snackbar.dismiss();

                }


            }
        });
        snackbar.show();

    }



}
