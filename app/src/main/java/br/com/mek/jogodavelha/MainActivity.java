package br.com.mek.jogodavelha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,btn_reset;
    ToggleButton btn_player;

    int rodada;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.NoTitle);
        setContentView(R.layout.activity_main);

        b0 = (Button) findViewById(R.id.b0);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        btn_reset = (Button) findViewById(R.id.btn_reset);
        btn_player = (ToggleButton) findViewById(R.id.btn_player);

        btn_player.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                
            }
        });

        rodada = 1;
            if (rodada == 1){
                b0.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        if (b0.getText().toString().equals("")){
                            if (rodada == 1){
                                b0.setText("X");
                                rodada = 2;
                            }
                        }
                        finalJogo();
                        b0.setEnabled(false);
                        robot();
                    }
                });

                b1.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        if (b1.getText().toString().equals("")){
                            if (rodada == 1){
                                b1.setText("X");
                                rodada = 2;
                            }
                        }
                        finalJogo();
                        b1.setEnabled(false);
                        robot();
                    }
                });

                b2.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        if (b2.getText().toString().equals("")){
                            if (rodada == 1){
                                b2.setText("X");
                                rodada = 2;
                            }
                        }
                        finalJogo();
                        b2.setEnabled(false);
                        robot();
                    }
                });

                b3.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        if (b3.getText().toString().equals("")){
                            if (rodada == 1){
                                b3.setText("X");
                                rodada = 2;
                            }
                        }
                        finalJogo();
                        b3.setEnabled(false);
                        robot();
                    }
                });

                b4.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        if (b4.getText().toString().equals("")){
                            if (rodada == 1){
                                b4.setText("X");
                                rodada = 2;
                            }
                        }
                        finalJogo();
                        b4.setEnabled(false);
                        robot();
                    }
                });

                b5.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        if (b5.getText().toString().equals("")){
                            if (rodada == 1){
                                b5.setText("X");
                                rodada = 2;
                            }
                        }
                        finalJogo();
                        b5.setEnabled(false);
                        robot();
                    }
                });

                b6.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        if (b6.getText().toString().equals("")){
                            if (rodada == 1){
                                b6.setText("X");
                                rodada = 2;
                            }
                        }
                        finalJogo();
                        b6.setEnabled(false);
                        robot();
                    }
                });

                b7.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        if (b7.getText().toString().equals("")){
                            if (rodada == 1){
                                b7.setText("X");
                                rodada = 2;
                            }
                        }
                        finalJogo();
                        b7.setEnabled(false);
                        robot();
                    }
                });

                b8.setOnClickListener(new View.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        if (b8.getText().toString().equals("")){
                            if (rodada == 1){
                                b8.setText("X");
                                rodada = 2;
                            }
                        }
                        finalJogo();
                        b8.setEnabled(false);
                        robot();
                    }
                });

            }

        btn_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b0.setEnabled(true);
                b0.setText("");
                b1.setEnabled(true);
                b1.setText("");
                b2.setEnabled(true);
                b2.setText("");
                b3.setEnabled(true);
                b3.setText("");
                b4.setEnabled(true);
                b4.setText("");
                b5.setEnabled(true);
                b5.setText("");
                b6.setEnabled(true);
                b6.setText("");
                b7.setEnabled(true);
                b7.setText("");
                b8.setEnabled(true);
                b8.setText("");

                rodada = 1;
            }
        });
    }

    public void finalJogo(){
        String a,b,c,d,e,f,g,h,i;
        boolean fim = false;

        a = b0.getText().toString();
        b = b1.getText().toString();
        c = b2.getText().toString();
        d = b3.getText().toString();
        e = b4.getText().toString();
        f = b5.getText().toString();
        g = b6.getText().toString();
        h = b7.getText().toString();
        i = b8.getText().toString();

        if (a.equals("X") && b.equals("X") && c.equals("X")){
            Toast.makeText(MainActivity.this, "Jogador X ganhou!", Toast.LENGTH_SHORT).show();
            fim = true;
        }
        if (a.equals("X") && e.equals("X") && i.equals("X")){
            Toast.makeText(MainActivity.this, "Jogador X ganhou!", Toast.LENGTH_SHORT).show();
            fim = true;
        }
        if (a.equals("X") && d.equals("X") && g.equals("X")){
            Toast.makeText(MainActivity.this, "Jogador X ganhou!", Toast.LENGTH_SHORT).show();
            fim = true;
        }
        if (b.equals("X") && e.equals("X") && h.equals("X")){
            Toast.makeText(MainActivity.this, "Jogador X ganhou!", Toast.LENGTH_SHORT).show();
            fim = true;
        }
        if (c.equals("X") && f.equals("X") && i.equals("X")){
            Toast.makeText(MainActivity.this, "Jogador X ganhou!", Toast.LENGTH_SHORT).show();
            fim = true;
        }
        if (d.equals("X") && e.equals("X") && f.equals("X")){
            Toast.makeText(MainActivity.this, "Jogador X ganhou!", Toast.LENGTH_SHORT).show();
            fim = true;
        }
        if (g.equals("X") && h.equals("X") && i.equals("X")){
            Toast.makeText(MainActivity.this, "Jogador X ganhou!", Toast.LENGTH_SHORT).show();
            fim = true;
        }
        if (g.equals("X") && e.equals("X") && c.equals("X")){
            Toast.makeText(MainActivity.this, "Jogador X ganhou!", Toast.LENGTH_SHORT).show();
            fim = true;
        }

        if (a.equals("O") && b.equals("O") && c.equals("O")){
            Toast.makeText(MainActivity.this, "Jogador O ganhou!", Toast.LENGTH_SHORT).show();
            fim = true;
        }
        if (a.equals("O") && e.equals("O") && i.equals("O")){
            Toast.makeText(MainActivity.this, "Jogador O ganhou!", Toast.LENGTH_SHORT).show();
            fim = true;
        }
        if (a.equals("O") && d.equals("O") && g.equals("O")){
            Toast.makeText(MainActivity.this, "Jogador O ganhou!", Toast.LENGTH_SHORT).show();
            fim = true;
        }
        if (b.equals("O") && e.equals("O") && h.equals("O")){
            Toast.makeText(MainActivity.this, "Jogador O ganhou!", Toast.LENGTH_SHORT).show();
            fim = true;
        }
        if (c.equals("O") && f.equals("O") && i.equals("O")){
            Toast.makeText(MainActivity.this, "Jogador O ganhou!", Toast.LENGTH_SHORT).show();
            fim = true;
        }
        if (d.equals("O") && e.equals("O") && f.equals("O")){
            Toast.makeText(MainActivity.this, "Jogador O ganhou!", Toast.LENGTH_SHORT).show();
            fim = true;
        }
        if (g.equals("O") && h.equals("O") && i.equals("O")){
            Toast.makeText(MainActivity.this, "Jogador O ganhou!", Toast.LENGTH_SHORT).show();
            fim = true;
        }
        if (g.equals("O") && e.equals("O") && c.equals("O")){
            Toast.makeText(MainActivity.this, "Jogador O ganhou!", Toast.LENGTH_SHORT).show();
            fim = true;
        }

        if (fim){
            b0.setEnabled(false);
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
        }
    }

    public void robot(){
        Random random = new Random();
        int nRandom = random.nextInt(10);

        switch (nRandom) {
            case 1:
                if (b0.getText().toString().equals("")) {
                    b0.setText("O");
                    b0.setEnabled(false);
                    break;
                }
                else {
                    nRandom = random.nextInt(10);
                }
            case 2:
                if (b1.getText().toString().equals("")) {
                    b1.setText("O");
                    b1.setEnabled(false);
                    break;
                }
                else {
                    nRandom = random.nextInt(10);
                }
            case 3:
                if (b2.getText().toString().equals("")) {
                    b2.setText("O");
                    b2.setEnabled(false);
                    break;
                }
                else {
                    nRandom = random.nextInt(10);
                }
            case 4:
                if (b3.getText().toString().equals("")) {
                    b3.setText("O");
                    b3.setEnabled(false);
                    break;
                }
                else {
                    nRandom = random.nextInt(10);
                }
            case 5:
                if (b4.getText().toString().equals("")) {
                    b4.setText("O");
                    b4.setEnabled(false);
                    break;
                }
                else {
                    nRandom = random.nextInt(10);
                }
            case 6:
                if (b5.getText().toString().equals("")) {
                    b5.setText("O");
                    b5.setEnabled(false);
                    break;
                }
                else {
                    nRandom = random.nextInt(10);
                }
            case 7:
                if (b6.getText().toString().equals("")) {
                    b6.setText("O");
                    b6.setEnabled(false);
                    break;
                }
                else {
                    nRandom = random.nextInt(10);
                }
            case 8:
                if (b7.getText().toString().equals("")) {
                    b7.setText("O");
                    b7.setEnabled(false);
                    break;
                }
                else {
                    nRandom = random.nextInt(10);
                }
            case 9:
                if (b8.getText().toString().equals("")) {
                    b8.setText("O");
                    b8.setEnabled(false);
                    break;
                }
                else {
                    nRandom = random.nextInt(10);
                }
            default:
                if (b0.getText().toString().equals("")) {
                    b0.setText("O");
                    b0.setEnabled(false);
                    break;
                }
                else if (b0.getText().toString().equals("")) {
                    b0.setText("O");
                    b0.setEnabled(false);
                    break;
                }
                else if (b1.getText().toString().equals("")) {
                    b1.setText("O");
                    b1.setEnabled(false);
                    break;
                }
                else if (b2.getText().toString().equals("")) {
                    b2.setText("O");
                    b2.setEnabled(false);
                    break;
                }
                else if (b3.getText().toString().equals("")) {
                    b3.setText("O");
                    b3.setEnabled(false);
                    break;
                }
                else if (b4.getText().toString().equals("")) {
                    b4.setText("O");
                    b4.setEnabled(false);
                    break;
                }
                else if (b5.getText().toString().equals("")) {
                    b5.setText("O");
                    b5.setEnabled(false);
                    break;
                }
                else if (b6.getText().toString().equals("")) {
                    b6.setText("O");
                    b6.setEnabled(false);
                    break;
                }
                else if (b7.getText().toString().equals("")) {
                    b7.setText("O");
                    b7.setEnabled(false);
                    break;
                }
                else if (b8.getText().toString().equals("")) {
                    b8.setText("O");
                    b8.setEnabled(false);
                    break;
                }
        }
        finalJogo();
        rodada = 1;
    }
}