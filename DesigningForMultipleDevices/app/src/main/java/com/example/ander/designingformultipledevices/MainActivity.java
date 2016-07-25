package com.example.ander.designingformultipledevices;

import android.app.ActionBar;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN){
            ActionBar actionBar = getActionBar();
            actionBar.setDisplayHomeAsUpEnabled(true);


            final ImageView imageView = (ImageView) findViewById(R.id.imageview);
            Button button = (Button) findViewById(R.id.button);

            imageView.setImageBitmap(BitmapFactory
                    .decodeResource(MainActivity.this.getResources(), R.mipmap.ic_question_mark));

            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    imageView.setImageDrawable(getResources().getDrawable(R.drawable.ic_insert_emoticon_black_24dp));
                }
            });
         }
    }
}
