package com.example.lenovo.aplikasiku;

import android.content.Intent;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class AkunMasuk extends AppCompatActivity{
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.masukakun);
        addListenerOnButton();
        ImageView galonn = (ImageView) findViewById(R.id.galonn);
        ImageView elpigi = (ImageView) findViewById(R.id.elpigi);
        ImageView airkemasan = (ImageView) findViewById(R.id.airkemasan);
        ImageView aquados = (ImageView) findViewById(R.id.aquados);
        ImageView aqua1dos = (ImageView) findViewById(R.id.aqua1dos);
        ImageView nestle = (ImageView) findViewById(R.id.nestle);
        ImageView javaqua = (ImageView) findViewById(R.id.javaqua);
        ImageView lemineral = (ImageView) findViewById(R.id.lemineral);
        ImageView bwaqua = (ImageView) findViewById(R.id.bwaqua);
        ImageView eksternalqua1 = (ImageView) findViewById(R.id.eksternalqua1);
        ImageView disneyqua = (ImageView) findViewById(R.id.disneyqua);
        Button Vutton = (Button) findViewById(R.id.info);




        galonn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i4 = new Intent(getApplicationContext(), kupemesan.class);
                startActivity(i4);
            }
        });
        elpigi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i5 = new Intent(getApplicationContext(), kupemesan.class);
                startActivity(i5);
            }
        });
        airkemasan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i6 = new Intent(getApplicationContext(), kupemesan.class);
                startActivity(i6);
            }
        });

        aquados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i7 = new Intent(getApplicationContext(), kupemesan.class);
                startActivity(i7);
            }
        });
        aqua1dos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i8 = new Intent(getApplicationContext(), kupemesan.class);
                startActivity(i8);
            }
        });
        nestle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i9 = new Intent(getApplicationContext(), kupemesan.class);
                startActivity(i9);
            }
        });
        javaqua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i11 = new Intent(getApplicationContext(), kupemesan.class);
                startActivity(i11);
            }
        });
        lemineral.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i12 = new Intent(getApplicationContext(), kupemesan.class);
                startActivity(i12);
            }
        });
        bwaqua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i13 = new Intent(getApplicationContext(), kupemesan.class);
                startActivity(i13);
            }
        });
        eksternalqua1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i14 = new Intent(getApplicationContext(), kupemesan.class);
                startActivity(i14);
            }
        });
        disneyqua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i15 = new Intent(getApplicationContext(), kupemesan.class);
                startActivity(i15);
            }
        });
        Vutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i16 = new Intent(getApplicationContext(), infob.class);
                startActivity(i16);
            }
        });
    }
        public void addListenerOnButton() {

            final Context context = this;

            button = (Button) findViewById(R.id.profil);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(getApplicationContext(), kuprofil.class);
                    startActivity(intent);
                }
            });



}}
