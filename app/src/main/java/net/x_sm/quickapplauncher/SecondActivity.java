package net.x_sm.quickapplauncher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        if ((getIntent().hasExtra("net.x_sm.quickapplauncher.SOMETHING"))) {
            TextView textView = (TextView) findViewById(R.id.textView);
            String text = (String) getIntent().getExtras().getString("net.x_sm.quickapplauncher.SOMETHING");
            textView.setText(text);
        }
    }
}
