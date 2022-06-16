package com.example.krestikinoliki;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
Button button, button2, button3, button4, button5, button6, button7, button8, button9;
    TextView textView;
        String krest[][] = {{"", "", ""}, {"", "", ""}, {"","",""}};
        String znak, znak1;
        int r1, r2;
        int chet;
        int chet2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button =  findViewById(R.id.button);
        button2 =  findViewById(R.id.button2);
        button3 =  findViewById(R.id.button3);
        button4 =  findViewById(R.id.button4);
        button5 =  findViewById(R.id.button5);
        button6 =  findViewById(R.id.button6);
        button7 =  findViewById(R.id.button7);
        button8 =  findViewById(R.id.button8);
        button9 =  findViewById(R.id.button9);

        textView = findViewById(R.id.textView);

        znak = "x";
        znak1 = "O";
        chet = 0;
    }
    //Ходы человека

    public void k1(View v){
        chet++;
        if (chet%2==0){
            krest[0][0] = znak1;
            button.setText(znak1);
            button.setEnabled(false);
            proverka();
            proverka2();
            chet2++;
            proverka3();
        }
        else if (chet%2!=0){
            krest[0][0] = znak;
            button.setText(znak);
            button.setEnabled(false);
            proverka();
            proverka2();
            chet2++;
            proverka3();
        }
    }
    public void k2(View v){
        chet++;
        if (chet%2==0){
            krest[0][1] = znak1;
            button2.setText(znak1);
            button2.setEnabled(false);
            proverka();
            proverka2();
            chet2++;
            proverka3();
        }
        else if (chet%2!=0){
            krest[0][1] = znak;
            button2.setText(znak);
            button2.setEnabled(false);
            proverka();
            proverka2();
            chet2++;
            proverka3();
        }
    }
    public void k3(View v){
        chet++;
        if (chet%2==0){
            krest[0][2] = znak1;
            button3.setText(znak1);
            button3.setEnabled(false);
            proverka();
            proverka2();
            chet2++;
            proverka3();
        }
        else if (chet%2!=0){
            krest[0][2] = znak;
            button3.setText(znak);
            button3.setEnabled(false);
            proverka();
            proverka2();
            chet2++;
            proverka3();
        }
    }
    public void k4(View v){
        chet++;
        if (chet%2==0){
            krest[1][0] = znak1;
            button4.setText(znak1);
            button4.setEnabled(false);
            proverka();
            proverka2();
            chet2++;
            proverka3();
        }
        else if (chet%2!=0){
            krest[1][0] = znak;
            button4.setText(znak);
            button4.setEnabled(false);
            proverka();
            proverka2();
            chet2++;
            proverka3();
        }
    }
    public void k5(View v){
        chet++;
        if (chet%2==0){
            krest[1][1] = znak1;
            button5.setText(znak1);
            button5.setEnabled(false);
            proverka();
            proverka2();
            chet2++;
            proverka3();
        }
        else if (chet%2!=0){
            krest[1][1] = znak;
            button5.setText(znak);
            button5.setEnabled(false);
            proverka();
            proverka2();
            chet2++;
            proverka3();
        }
    }
    public void k6(View v){
        chet++;
        if (chet%2==0){
            krest[1][2] = znak1;
            button6.setText(znak1);
            button6.setEnabled(false);
            proverka();
            proverka2();
            chet2++;
            proverka3();
        }
        else if (chet%2!=0){
            krest[1][2] = znak;
            button6.setText(znak);
            button6.setEnabled(false);
            proverka();
            proverka2();
            chet2++;
            proverka3();
        }
    }
    public void k7(View v){
        chet++;
        if (chet%2==0){
            krest[2][0] = znak1;
            button7.setText(znak1);
            button7.setEnabled(false);
            proverka();
            proverka2();
            chet2++;
            proverka3();
        }
        else if (chet%2!=0){
            krest[2][0] = znak;
            button7.setText(znak);
            button7.setEnabled(false);
            proverka();
            proverka2();
            chet2++;
            proverka3();
        }
    }
    public void k8(View v){
        chet++;
        if (chet%2==0){
            krest[2][1] = znak1;
            button8.setText(znak1);
            button8.setEnabled(false);
            proverka();
            proverka2();
            chet2++;
            proverka3();
        }
        else if (chet%2!=0){
            krest[2][1] = znak;
            button8.setText(znak);
            button8.setEnabled(false);
            proverka();
            proverka2();
            chet2++;
            proverka3();
        }
    }
    public void k9(View v){
        chet++;
        if (chet%2==0){
            krest[2][2] = znak1;
            button9.setText(znak1);
            button9.setEnabled(false);
            proverka();
            proverka2();
            chet2++;
            proverka3();
        }
        else if (chet%2!=0){
            krest[2][2] = znak;
            button9.setText(znak);
            button9.setEnabled(false);
            proverka();
            proverka2();
            chet2++;
            proverka3();
        }
    }
    public void proverka3(){
        if (chet == 9){
            textView.setText("Победителя нет!");
            Restart();
        }
    }
    //ходы компьютера
    public void Restart(){

        button.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");

        button.setEnabled(true);
        button2.setEnabled(true);
        button3.setEnabled(true);
        button4.setEnabled(true);
        button5.setEnabled(true);
        button6.setEnabled(true);
        button7.setEnabled(true);
        button8.setEnabled(true);
        button9.setEnabled(true);

        chet = 0;
    }
    public void proverka() {
        if ((button.getText().equals("x")) && (button2.getText().equals("x")) && (button3.getText().equals("x"))) {
            textView.setText("Игрок победил!");
            Restart();
        }
        if ((button.getText().equals("x")) && (button4.getText().equals("x")) && (button7.getText().equals("x"))) {
            textView.setText("Игрок победил!");
            Restart();
        }
        if ((button.getText().equals("x")) && (button5.getText().equals("x")) && (button9.getText().equals("x"))) {
            textView.setText("Игрок победил!");
            Restart();
        }
        if ((button3.getText().equals("x")) && (button6.getText().equals("x")) && (button9.getText().equals("x"))) {
            textView.setText("Игрок победил!");
            Restart();
        }
        if ((button7.getText().equals("x")) && (button8.getText().equals("x")) && (button9.getText().equals("x"))) {
            textView.setText("Игрок победил!");
            Restart();
        }
        if ((button3.getText().equals("x")) && (button5.getText().equals("x")) && (button7.getText().equals("x"))) {
            textView.setText("Игрок победил!");
            Restart();
        }
        if ((button2.getText().equals("x")) && (button5.getText().equals("x")) && (button8.getText().equals("x"))) {
            textView.setText("Игрок победил!");
            Restart();
        }
        if ((button4.getText().equals("x")) && (button5.getText().equals("x")) && (button6.getText().equals("x"))) {
            textView.setText("Игрок победил!");
            Restart();
        }
    }
    public void proverka2(){
        if ((button.getText().equals("O")) && (button2.getText().equals("O")) && (button3.getText().equals("O"))) {
            textView.setText("Игрок 2 победил!");
            Restart();
        }
        if ((button.getText().equals("O")) && (button4.getText().equals("O")) && (button7.getText().equals("O"))) {
            textView.setText("Игрок 2 победил!");
            Restart();
        }
        if ((button.getText().equals("O")) && (button5.getText().equals("O")) && (button9.getText().equals("O"))) {
            textView.setText("Игрок 2 победил!");
            Restart();
        }
        if ((button3.getText().equals("O")) && (button6.getText().equals("O")) && (button9.getText().equals("O"))) {
            textView.setText("Игрок 2 победил!");
            Restart();
        }
        if ((button7.getText().equals("O")) && (button8.getText().equals("O")) && (button9.getText().equals("O"))) {
            textView.setText("Игрок 2 победил!");
            Restart();
        }
        if ((button3.getText().equals("O")) && (button5.getText().equals("O")) && (button7.getText().equals("O"))) {
            textView.setText("Игрок 2 победил!");
            Restart();
        }
        if ((button2.getText().equals("O")) && (button5.getText().equals("O")) && (button8.getText().equals("O"))) {
            textView.setText("Игрок 2 победил!");
            Restart();
        }
        if ((button4.getText().equals("O")) && (button5.getText().equals("O")) && (button6.getText().equals("O"))) {
            textView.setText("Игрок 2 победил!");
            Restart();
        }
    }
}