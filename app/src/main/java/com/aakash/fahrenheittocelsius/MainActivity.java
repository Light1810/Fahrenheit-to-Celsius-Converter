package com.aakash.fahrenheittocelsius;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button btnSubmit;
    private TextView tvResult;
    private EditText etInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         btnSubmit=findViewById(R.id.btnSubmit);
         tvResult=findViewById(R.id.tvResult);
         etInput=findViewById(R.id.etInput);
        tvResult.setVisibility(View.GONE);

         btnSubmit.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {

                  etInput.onEditorAction(EditorInfo.IME_ACTION_DONE);
                  String s= etInput.getText().toString().trim();
                  if(s.length()<1)
                  {
                      Toast.makeText(MainActivity.this, "Please Enter Temperature in degree F", Toast.LENGTH_LONG).show();
                      return;
                  }
                 else
                  {
                     Double temp = Double.parseDouble(s);
                     //Toast.makeText(MainActivity.this, "Temp on F "+temp, Toast.LENGTH_SHORT).show();
                     Double temp_in_c = (temp - 32) / 1.8;
                     Double round_temp=Math.round(temp_in_c *100)/100D;

                     tvResult.setText("Temp in degree Celsius is --> " + round_temp);
                     tvResult.setVisibility(View.VISIBLE);
                     return;
                 }



             }
         });


    }
}
