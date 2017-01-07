package com.example.tai.helloworld;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private CheckBox checkBox;
    private Button button;
    private EditText editText;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addListenerOnButton();

    }

    private void addListenerOnButton() {
        checkBox = (CheckBox)findViewById(R.id.checkBox);
        button = (Button)findViewById(R.id.button);
        editText = (EditText)findViewById(R.id.editText);
        textView = (TextView)findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text;
                if(checkBox.isChecked()) {
                    text = editText.getText().toString();
                }else{
                    text = "Check the Box";
                }
                textView.setText(text);
                textView.setBackgroundColor(Color.parseColor("#e7eecc") );

                Toast toast;
                toast = new Toast(getApplicationContext());
                toast.setGravity(Gravity.CENTER, 0, -150);
                toast.setDuration(Toast.LENGTH_SHORT);
                LayoutInflater inf = getLayoutInflater();
                View layout = inf.inflate(R.layout.customtoast, (ViewGroup)findViewById(R.id.customToastLayout));
                toast.setView(layout);
                toast.show();
            }
        });
    }
}
