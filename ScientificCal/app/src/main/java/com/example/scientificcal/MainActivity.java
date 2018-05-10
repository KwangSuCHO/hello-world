package com.example.scientificcal;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button add, subtract, multiply, divide, one, two, three, four, five, six, seven, eight, nine, zero, zero_2, equal,del;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        del = findViewById(R.id.del);

        add = (Button) findViewById(R.id.add);
        subtract = (Button)findViewById(R.id.subtract);
        multiply = (Button)findViewById(R.id.multiply);
        divide = (Button)findViewById(R.id.divide);
        equal = findViewById(R.id.equal);

        result = findViewById(R.id.result);

        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        zero = findViewById(R.id.zero);
        zero_2 = findViewById(R.id.zero_2);

        View.OnClickListener numberButton = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(v.getId()){
                    case R.id.one: result.append("1");
                        break;
                    case R.id.two: result.append("2");
                        break;
                    case R.id.three: result.append("3");
                        break;
                    case R.id.four: result.append("4");
                        break;
                    case R.id.five: result.append("5");
                        break;
                    case R.id.six: result.append("6");
                        break;
                    case R.id.seven: result.append("7");
                        break;
                    case R.id.eight: result.append("8");
                        break;
                    case R.id.nine: result.append("9");
                        break;
                    case R.id.zero: result.append("0");
                        break;
                    case R.id.zero_2: result.append("00");
                        break;
                    default:
                        Toast.makeText(getApplicationContext(),"기능미구현",Toast.LENGTH_SHORT).show();

                }
            }
        };

        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                String value = result.getText().toString();
//
//                if(value == ""){
//                    Toast.makeText(MainActivity.this, "지울 숫자가 없습니다.", Toast.LENGTH_SHORT).show();
//                } else {
//                    result.setText(value.substring(0,value.length()-1));
//                }
                Toast.makeText(getApplicationContext(),"기능 미구현",Toast.LENGTH_SHORT).show();
            }
        });

        add.setOnClickListener(numberButton);
        subtract.setOnClickListener(numberButton);
        multiply.setOnClickListener(numberButton);
        divide.setOnClickListener(numberButton);
        equal.setOnClickListener(numberButton);

        one.setOnClickListener(numberButton);
        two.setOnClickListener(numberButton);
        three.setOnClickListener(numberButton);
        four.setOnClickListener(numberButton);
        five.setOnClickListener(numberButton);
        six.setOnClickListener(numberButton);
        seven.setOnClickListener(numberButton);
        eight.setOnClickListener(numberButton);
        nine.setOnClickListener(numberButton);
        zero.setOnClickListener(numberButton);
        zero_2.setOnClickListener(numberButton);
    }



}
