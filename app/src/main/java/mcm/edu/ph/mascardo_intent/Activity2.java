package mcm.edu.ph.mascardo_intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        boolean condition;
        int x;

        Intent i =getIntent();
        x = i.getIntExtra("INT_MONTHS",0);

        TextView display = findViewById(R.id.textView);

        switch(x){
            case 1:
                display.setText("The month that you have typed is January.");
                break;
            case 2:
                display.setText("The month that you have typed is February.");
                break;
            case 3:
                display.setText("The month that you have typed is March.");
                break;
            case 4:
                display.setText("The month that you have typed is April.");
                break;
            case 5:
                display.setText("The month that you have typed is May.");
                break;
            case 6:
                display.setText("The month that you have typed is June.");
                break;
            case 7:
                display.setText("The month that you have typed is July.");
                break;
            case 8:
                display.setText("The month that you have typed is August.");
                break;
            case 9:
                display.setText("The month that you have typed is September.");
                break;
            case 10:
                display.setText("The month that you have typed is October.");
                break;
            case 11:
                display.setText("The month that you have typed is November.");
                break;
            case 12:
                display.setText("The month that you have typed is December.");
                break;
            default:
                display.setText("ERROR: You typed a wrong number.");
                break;
        }
    }
}