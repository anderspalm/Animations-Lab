package generalassembly.yuliyakaleda.startercode;

import android.support.v4.widget.SimpleCursorAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView mtextview;
    Button mbutton;
    EditText medittext;
    ArrayAdapter mAdapter;
    ArrayList<String> marray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        marray = new ArrayList<>();

        ListView mlistView = (ListView) findViewById(R.id.listview);
        mAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, marray);
        mlistView.setAdapter(mAdapter);

        //TODO: set up all the view and event listeners.
        mbutton = (Button) findViewById(R.id.button);
        medittext = (EditText) findViewById(R.id.edittext);
        mtextview = (TextView) findViewById(R.id.textview);

        mtextview.setOnClickListener(this);
        mbutton.setOnClickListener(this);


// If we use the setOnClickListener below it will override the (implemented) onClick of the activity
//      mbutton.setOnClickListener(new View.OnClickListener() {
//          @Override
//          public void onClick(View v) {
//
//          String user_input = medittext.getText().toString();
//              marray.add(user_input);
//              mAdapter.notifyDataSetChanged();
//          }
//      });
    }


    public void onClick(View v) {
        Animation animation = null;
        switch (v.getId()) {
//          Todo: 2. animate it in the center of the screen
            case R.id.button:
//        Todo: 1. get the text from the input field
                String user_input = medittext.getText().toString();
                marray.add(user_input);
                mAdapter.notifyDataSetChanged();

                animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.animation);
                mtextview.startAnimation(animation);
                break;

            default:
                break;
        }
    }
}
