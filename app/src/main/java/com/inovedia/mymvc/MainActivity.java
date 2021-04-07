package com.inovedia.mymvc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
    }

    public ModelsClass getAppForwording(){
        return new ModelsClass("MVC in android simple app", 111111,11);
    }

    public void DisplayTextInApp(View view) {
        textView.setText("AppName "+ getAppForwording().getAppName()
                + "\n App Download: "+ getAppForwording().getAppDownloads()+
                "\n App Rating" +getAppForwording().getAppRating());
    }
}