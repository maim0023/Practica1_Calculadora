package com.example.calculadora;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	TextView total ;
    String valorTotal;
    float primerNumero ;
    float calculo;
    String tipoCalculo;
    Button uno, dos, tres , cuatro ,cinco , seis , siete , ocho, nueve , cero , punto , igual, mas , menos, por, div; 
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        uno = (Button) findViewById(R.id.button1);
        dos = (Button) findViewById(R.id.button2);
        tres = (Button) findViewById(R.id.button3);
        cuatro = (Button) findViewById(R.id.button4);
        cinco = (Button) findViewById(R.id.button5);
        seis = (Button) findViewById(R.id.button6);
        siete = (Button) findViewById(R.id.button7);
        ocho = (Button) findViewById(R.id.button8);
        nueve = (Button) findViewById(R.id.button9);
        cero = (Button) findViewById(R.id.button0);
        punto = (Button) findViewById(R.id.buttonPunto);
        igual = (Button) findViewById(R.id.ButtonIgual);
        mas = (Button) findViewById(R.id.buttonMas);
        menos = (Button) findViewById(R.id.buttonMenos);
        por = (Button) findViewById(R.id.ButtonPor);
        div = (Button) findViewById(R.id.ButtonDiv);
        
        total = (TextView) findViewById(R.id.textView1);
        
        uno.setOnClickListener (new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				valorTotal =(String) total.getText();
				total.setText((String) valorTotal + (String) uno.getText() );
			}
        });
        dos.setOnClickListener (new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				valorTotal =(String) total.getText();
				total.setText((String) valorTotal + (String) dos.getText() );
			}
        });
        tres.setOnClickListener (new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				valorTotal =(String) total.getText();
				total.setText((String) valorTotal + (String) tres.getText() );
			}
        });
        cuatro.setOnClickListener (new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				valorTotal =(String) total.getText();
				total.setText((String) valorTotal + (String) cuatro.getText() );
			}
        });
        cinco.setOnClickListener (new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				valorTotal =(String) total.getText();
				total.setText((String) valorTotal + (String) cinco.getText() );
			}
        });
        seis.setOnClickListener (new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				valorTotal =(String) total.getText();
				total.setText((String) valorTotal + (String) seis.getText() );
			}
        });
        siete.setOnClickListener (new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				valorTotal =(String) total.getText();
				total.setText((String) valorTotal + (String) siete.getText() );
			}
        });
        ocho.setOnClickListener (new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				valorTotal =(String) total.getText();
				total.setText((String) valorTotal + (String) ocho.getText() );
			}
        });
        nueve.setOnClickListener (new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				valorTotal =(String) total.getText();
				total.setText((String) valorTotal + (String) nueve.getText() );
			}
        });
        cero.setOnClickListener (new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				valorTotal =(String) total.getText();
				total.setText((String) valorTotal + (String) cero.getText() );
			}
        });
        punto.setOnClickListener (new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				valorTotal =(String) total.getText();
				total.setText((String) valorTotal + (String) punto.getText() );
			}
        });
        
        mas.setOnClickListener (new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				tipoCalculo="suma";
				primerNumero = Float.valueOf(total.getText().toString());
				total.setText("");
				
			}
        });
        menos.setOnClickListener (new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				tipoCalculo="resta";
				primerNumero = Float.valueOf( total.getText().toString());
				total.setText("");
			}
        });
        por.setOnClickListener (new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				tipoCalculo="por";
				primerNumero = Float.valueOf( total.getText().toString());
				total.setText("");

			}
        });
        div.setOnClickListener (new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				tipoCalculo="div";
				primerNumero = Float.valueOf( total.getText().toString());
				total.setText("");

			}
        });
        
        igual.setOnClickListener (new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (tipoCalculo == "suma"){
					calculo = primerNumero + Float.valueOf( total.getText().toString());
				}else if (tipoCalculo =="resta"){
					calculo = primerNumero - Float.valueOf( total.getText().toString());
				}else if (tipoCalculo =="div"){
					calculo = primerNumero / Float.valueOf( total.getText().toString());
				}else if (tipoCalculo =="por"){
					calculo = primerNumero * Float.valueOf( total.getText().toString());
				}
				
				total.setText(Float.toString(calculo));
				primerNumero= 0; 
			}
        });
        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
