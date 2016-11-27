package io.github.bakumon.numberanimtextview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import io.github.bakumon.numberanimtextview.view.NumberAnimTextView;

public class MainActivity extends AppCompatActivity {

    private NumberAnimTextView mNumberAnimTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mNumberAnimTextView = (NumberAnimTextView) findViewById(R.id.text);
    }

    public void start(View view) {
        mNumberAnimTextView.setPrefixString("￥");
        mNumberAnimTextView.setDuration(9000);
        mNumberAnimTextView.setPostfixString("%");
        mNumberAnimTextView.setNumberString("8888888");

    }
}
