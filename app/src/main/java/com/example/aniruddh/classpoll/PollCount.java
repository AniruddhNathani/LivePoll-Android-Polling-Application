package com.example.aniruddh.classpoll;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class PollCount extends AppCompatActivity {

    private TextView Question;
    private TextView Description;
    private TextView Option1;
    private TextView Option2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poll_count);

        Question = (TextView)findViewById(R.id.q);
        Description = (TextView)findViewById(R.id.d);

        Option1 = (TextView)findViewById(R.id.o1);

        Option2 = (TextView)findViewById(R.id.o2);

        Question.setText(getIntent().getStringExtra("textViewQuestion"));
        Description.setText(getIntent().getStringExtra("textViewDescription"));
        Option1.setText(getIntent().getStringExtra("textViewOption1"));
        Option2.setText(getIntent().getStringExtra("textViewOption2"));






    }
}
