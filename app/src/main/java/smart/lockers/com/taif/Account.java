package smart.lockers.com.taif;


import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.parse.GetDataCallback;
import com.parse.LogOutCallback;
import com.parse.ParseFile;
import com.parse.ParseUser;

public class Account extends AppCompatActivity {


    @Override
    protected void onStart() {
        super.onStart();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.account);
        super.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);


        // Set Title of the ActionBar
        getSupportActionBar().setTitle("Account");



        // Init TabBar buttons
        Button tab_home = (Button)findViewById(R.id.tab_home);

        tab_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Account.this, Home.class));
            }
        });


    }//end onCreate()

}//@end
