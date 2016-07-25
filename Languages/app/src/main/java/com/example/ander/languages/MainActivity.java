package com.example.ander.languages;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.text);
        textView.setText(R.string.portrait_mode);

//       Button mbutton = (Button) findViewById(R.id.button);
//
//        mbutton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                if (mbutton.getText().toString() == "ENVIAR"){
//                mbutton.setText(R.string.send_rn);
//                }
//
//                else if (mbutton.getText().toString() == "Отправить"){
//                    mbutton.setText(R.string.send_en);
//                }
//                else {
//                    mbutton.setText(R.string.send_sp);
//                }
//            }
//        });



    }
}
