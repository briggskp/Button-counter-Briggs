package edu.cofc.button_counter_briggs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button addButton;
    private Button subtractButton;
    private Button clearButton;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addButton = (Button) findViewById(R.id.add_button);
        subtractButton = (Button) findViewById(R.id.subtract_button);
        clearButton = (Button) findViewById(R.id.clear_button);
    }
}
