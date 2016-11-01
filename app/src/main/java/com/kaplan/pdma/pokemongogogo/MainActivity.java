package com.kaplan.pdma.pokemongogogo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String[] options1 = {"Bulbasaur", "Ivysaur", "Venusaur"};
        String[] options2 = {"Charmander", "Charmeleon", "Charizard"};

        Pokemon m1 = new Pokemon("Bulbasaur", R.drawable.m1, options1);
        Pokemon m2 = new Pokemon("Ivysaur", R.drawable.m2, options1);
        Pokemon m3 = new Pokemon("Venusaur", R.drawable.m3, options1);
        Pokemon m4 = new Pokemon("Charmander", R.drawable.m4, options2);
        Pokemon m5 = new Pokemon("Charmeleon", R.drawable.m5, options2);
        Pokemon m6 = new Pokemon("Charizard", R.drawable.m6, options2);

        final Pokemon[] monsters = {m1, m2, m3, m4, m5, m6};

        final ImageView imageView = (ImageView) findViewById(R.id.imageView);
        final TextView tv1 = (TextView) findViewById(R.id.textView1);
        final TextView tv2 = (TextView) findViewById(R.id.textView2);
        final TextView tv3 = (TextView) findViewById(R.id.textView3);
        Button buttonNext = (Button) findViewById(R.id.buttonNext);

        final Random r = new Random();

        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int i = r.nextInt(monsters.length);
                Pokemon p = monsters[i];
                imageView.setImageResource(p.getImage());
                String[] options = p.getOptions();
                //randomise the options
                tv1.setText(options[0]);
                tv2.setText(options[1]);
                tv3.setText(options[2]);

            }
        });


    }
}
