package com.project.foodearnerstrack;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.GridView;

import static com.project.foodearnerstrack.appconsts.AppConst.CONTACT;
import static com.project.foodearnerstrack.appconsts.AppConst.DASHBOARD;
import static com.project.foodearnerstrack.appconsts.AppConst.DOWN_LINES;
import static com.project.foodearnerstrack.appconsts.AppConst.FAQS;
import static com.project.foodearnerstrack.appconsts.AppConst.GENEALOGY;
import static com.project.foodearnerstrack.appconsts.AppConst.LOGIN;
import static com.project.foodearnerstrack.appconsts.AppConst.PRESENTATION;
import static com.project.foodearnerstrack.appconsts.AppConst.PURCHASE;
import static com.project.foodearnerstrack.appconsts.AppConst.REVIEWS;
import static com.project.foodearnerstrack.appconsts.AppConst.SIGN_UP;
import static com.project.foodearnerstrack.appconsts.AppConst.STAGES;
import static com.project.foodearnerstrack.appconsts.AppConst.WHATS_NEW;



public class MainActivity extends AppCompatActivity {

    Intent intent;
    CardView btn1, btn2, btn3, btn4, btn5,
        btn6, btn7, btn8, btn9, btn10,
        btn11, btn12;
    String l;
    GridLayout gridLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        Toolbar toolbar = findViewById(R.id.myToolbar);
        setSupportActionBar(toolbar);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn10 = findViewById(R.id.btn10);
        btn11 = findViewById(R.id.btn11);
        btn12 = findViewById(R.id.btn12);

//        gridLayout = findViewById(R.id.gridLayout);

//        GridLayout.LayoutParams layoutParams = new GridLayout.LayoutParams(
//            GridLayout.spec(GridLayout.UNDEFINED, 1f),
//                GridLayout.spec(GridLayout.UNDEFINED, 1f)
//        );
//        layoutParams.width = 0;
//
//        btn1.setLayoutParams(layoutParams);
//        gridLayout.addView(btn1);
//
//        btn2.setLayoutParams(layoutParams);
//        gridLayout.addView(btn2);
//
//        btn3.setLayoutParams(layoutParams);
//        gridLayout.addView(btn3);

        intent = new Intent(getBaseContext(), WActivity.class);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("l", DASHBOARD);
                startActivity(intent);
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("l", LOGIN);
                startActivity(intent);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("l", SIGN_UP);
                startActivity(intent);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("l", DOWN_LINES);
                startActivity(intent);
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("l", STAGES);
                startActivity(intent);
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("l", GENEALOGY);
                startActivity(intent);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("l", PURCHASE);
                startActivity(intent);
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("l", PRESENTATION);
                startActivity(intent);
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("l", FAQS);
                startActivity(intent);
            }
        });

        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("l", WHATS_NEW);
                startActivity(intent);
            }
        });

        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("l", CONTACT);
                startActivity(intent);
            }
        });

        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent.putExtra("l", REVIEWS);
                startActivity(intent);
            }
        });

    }

}