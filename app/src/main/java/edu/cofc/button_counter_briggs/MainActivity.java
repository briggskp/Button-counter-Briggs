package edu.cofc.button_counter_briggs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button addButton;
    private Button subtractButton;
    private Button clearButton;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addButton = (Button) findViewById(R.id.add_button);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView et = (TextView) findViewById(R.id.number_text_view);
                String value = et.getText().toString();
                int num = Integer.parseInt(value);
                num = num + 1;
                et.setText(String.valueOf(num));
            }
        });

        subtractButton = (Button) findViewById(R.id.subtract_button);
        subtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView et = (TextView) findViewById(R.id.number_text_view);
                String value = et.getText().toString();
                int num = Integer.parseInt(value);
                num = num - 1;
                et.setText(String.valueOf(num));
            }
        });

        clearButton = (Button) findViewById(R.id.clear_button);
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView et = (TextView) findViewById(R.id.number_text_view);
                et.setText("0");
            }
        });
    }
}
