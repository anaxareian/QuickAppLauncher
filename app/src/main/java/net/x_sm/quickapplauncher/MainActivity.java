package net.x_sm.quickapplauncher;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Launches a Second Activity within the App from our Main Activity
        Button secondAcitvity = (Button) findViewById(R.id.secondActivityBtn);
        Button googleActivity = (Button) findViewById(R.id.googleBtn);

        secondAcitvity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startIntent = new Intent(getApplicationContext(), SecondActivity.class);
                startIntent.putExtra("net.x_sm.quickapplauncher.SOMETHING", "Joy to the World!");
                startActivity(startIntent);
            }
        });

        //Launches another Activity outside our App
        Button googleBtn = (Button)findViewById(R.id.googleBtn);
        googleBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String google = "https://www.yahoo.com/";
                Uri webaddress = Uri.parse(google);
                Intent gotoGoogle = new Intent(Intent.ACTION_VIEW, webaddress);
                if (gotoGoogle.resolveActivity(getPackageManager()) != null) {
                    startActivity(gotoGoogle);
                }
            }
        });
    }
}
