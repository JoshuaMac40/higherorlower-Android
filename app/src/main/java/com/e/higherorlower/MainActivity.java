package com.e.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    public void randomNumber(){

        Random rand = new Random();

        randomNumber = rand.nextInt(20) + 1;
    }

int randomNumber;
public void guessButton(View view){
    EditText editText = (EditText)findViewById(R.id.editValue);

    int guessValue= Integer.parseInt(editText.getText().toString());
String message;
    if(guessValue>randomNumber){
    message="Lower!";
}else if(guessValue<randomNumber) {
message="Higher";
    } else{
message="you got it";
randomNumber();
    };

    Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    Log.d("info" ,Integer.toString(randomNumber));

}
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        randomNumber();


}
}
