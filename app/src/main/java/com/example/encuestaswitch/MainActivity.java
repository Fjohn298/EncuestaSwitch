package com.example.encuestaswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Switch switch1,switch2,switch3,switch4,switch5, switch6, switch7,switch8;
    private Button btnSwitch;
    preguntasCs pregunta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSwitch = findViewById(R.id.btnSwitch);
        switch1 = findViewById(R.id.switch1);
        switch2 = findViewById(R.id.switch2);
        switch3 = findViewById(R.id.switch3);
        switch4 = findViewById(R.id.switch4);
        switch5 = findViewById(R.id.switch5);
        switch6 = findViewById(R.id.switch6);
        switch7 = findViewById(R.id.switch7);
        switch8 = findViewById(R.id.switch8);


        btnSwitch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder result = new StringBuilder();
                result.append("switch1 : ").append(switch1.getText());
                result.append("\nswitch1 : ").append(switch1.isChecked());
                result.append("\nswitch2 : ").append(switch2.getText());
                result.append("\nswitch2 : ").append(switch2.isChecked());

                    int contador=0;
                    int contadorneg=0;
                    if (switch1.isChecked()==true) {
                        contador=contador+1;
                        pregunta.setContador(contador);
                    } else {
                        contadorneg=contadorneg+1;
                        pregunta.setContadorNeg(contadorneg);
                    }
                    if (switch2.isChecked()==true) {
                    contador=contador+1;
                    pregunta.setContador(contador);
                    } else {
                    contadorneg=contadorneg+1;
                    pregunta.setContadorNeg(contadorneg);
                    }
                    if (switch3.isChecked()==true) {
                    contador=contador+1;
                    pregunta.setContador(contador);
                    } else {
                    contadorneg=contadorneg+1;
                    pregunta.setContadorNeg(contadorneg);
                    }
                    if (switch4.isChecked()==true) {
                    contador=contador+1;
                    pregunta.setContador(contador);
                    } else {
                    contadorneg=contadorneg+1;
                    pregunta.setContadorNeg(contadorneg);
                     }
                    if (switch5.isChecked()==true) {
                    contador=contador+1;
                    pregunta.setContador(contador);
                    } else {
                    contadorneg=contadorneg+1;
                    pregunta.setContadorNeg(contadorneg);
                     }
                    if (switch6.isChecked()==true) {
                    contador=contador+1;
                    pregunta.setContador(contador);
                    } else {
                    contadorneg=contadorneg+1;
                    pregunta.setContadorNeg(contadorneg);
                    }
                    if (switch7.isChecked()==true) {
                    contador=contador+1;
                    pregunta.setContador(contador);
                    } else {
                    contadorneg=contadorneg+1;
                    pregunta.setContadorNeg(contadorneg);
                    }
                    if (switch8.isChecked()==true) {
                    contador=contador+1;
                    pregunta.setContador(contador);
                    } else {
                    contadorneg=contadorneg+1;
                    pregunta.setContadorNeg(contadorneg);
                }


                Toast.makeText(getApplicationContext(), pregunta.getContador(),Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(), pregunta.getContadorNeg(),Toast.LENGTH_LONG).show();

            }
        });

    }
}