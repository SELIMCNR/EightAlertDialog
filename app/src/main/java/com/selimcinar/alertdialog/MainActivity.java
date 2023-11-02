package com.selimcinar.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;  
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Contextler
        //ActivityContext aktivite içerisinde contextir.MainActivity.this ile alınır

        //ApplicationContext Uygulamayı ilgilendiren contextir.getApplicationContext ile alınır.


        //Toast Mesajı yazımı
        Toast.makeText(this,"Toast Message",Toast.LENGTH_LONG).show();

    }
    public void  save(View view){
        //Uyarı mesajı inşa ediyoruz
        //Uyarı mesajı nesnesi oluştu
        AlertDialog.Builder alert= new AlertDialog.Builder(this);
        //Uyarı mesajı başlığı
        alert.setTitle("Save");
        //Uyarı mesajı ne olsun
        alert.setMessage("Are you sure?");
        //PositiveButtona basmaya daha yatkın,NegativeButtona basmaya daha az yatkın olunur.
        //Yes buttonuna tıklanınca ne olsun
        alert.setPositiveButton("yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //save
                //Toast mesajını yazdır
                Toast.makeText(getApplicationContext(),"Saved",Toast.LENGTH_LONG).show();
            }
        });
        //No buttonuna basınca ne olsun
        alert.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //Not saved
                //Toast mesajını yazdır
                Toast.makeText(MainActivity.this,"Not Saved",Toast.LENGTH_LONG).show();
            }
        });
        alert.show();

    }

}
