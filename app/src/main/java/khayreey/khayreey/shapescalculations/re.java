package khayreey.khayreey.shapescalculations;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class re extends AppCompatActivity {
    private EditText x_editor,y_editor;
    private RadioButton area_btn,perimeter_btn;
    private TextView result_txt;
    private Button result_btn,op_btn;
    private double result,x,y;
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_re);
        find();
        result();
        op();
        v();

    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    public void find()

    {
        x_editor=(EditText)findViewById(R.id.x_editor);
        y_editor=(EditText)findViewById(R.id.y_editor);
        area_btn=(RadioButton)findViewById(R.id.area_btn);
        perimeter_btn =(RadioButton)findViewById(R.id.perimeter_btn);
        result_txt=(TextView)findViewById(R.id.zero_id);
        result_btn=(Button)findViewById(R.id.result_btn);
        op_btn=(Button)findViewById(R.id.op_btn);
        area_btn.setEnabled(false);
        perimeter_btn.setEnabled(false);
        op_btn.setEnabled(false);
        y_editor.setEnabled(false);
        op_btn.setBackground(getResources().getDrawable(R.drawable.second));
    }
    public void result()
    {
        result_btn.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                String currentX=x_editor.getText().toString().trim();
                String currentY=y_editor.getText().toString().trim();
                if(currentX.length()==0||currentY.length()==0)
                {

                    Toast toast =Toast.makeText(re.this,"please enter x and y",Toast.LENGTH_LONG);
                    toast.show();

                }
                else {
                    if (area_btn.isChecked()) {

                        x = Double.parseDouble(currentX);
                        y = Double.parseDouble(currentY);
                        result = x * y;
                        result_txt.setText(String.valueOf(result));
                        op_btn.setEnabled(true);
                        area_btn.setEnabled(true);
                        perimeter_btn.setEnabled(true);
                        result_btn.setEnabled(false);
                        result_btn.setBackground(getResources().getDrawable(R.drawable.second));
                        op_btn.setBackground(getResources().getDrawable(R.drawable.button));
                    } else if (perimeter_btn.isChecked()) {

                        y = Double.parseDouble(currentY);
                        x = Double.parseDouble(currentX);
                        result = (x * y)/2;
                        result_txt.setText(String.valueOf(result));
                        op_btn.setEnabled(true);
                        area_btn.setEnabled(true);
                        perimeter_btn.setEnabled(true);
                        result_btn.setEnabled(false);
                        result_btn.setBackground(getResources().getDrawable(R.drawable.second));
                        op_btn.setBackground(getResources().getDrawable(R.drawable.button));
                    } else {

                        Toast toast = Toast.makeText(re.this, "choose one first", Toast.LENGTH_LONG);
                        toast.show();

                    }
                }
            }
        });
    }
    public void op()
    {
        op_btn.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {
                y_editor.setText(String.valueOf(""));
                x_editor.setText(String.valueOf(""));
                result_txt.setText(String.valueOf(""));
                y_editor.setEnabled(false);
                area_btn.setChecked(false);
                perimeter_btn.setChecked(false);
                area_btn.setEnabled(false);
                perimeter_btn.setEnabled(false);
                result_btn.setEnabled(true);
                result_btn.setBackground(getResources().getDrawable(R.drawable.button));
                op_btn.setEnabled(false);
                op_btn.setBackground(getResources().getDrawable(R.drawable.second));
            }
        });

    }

    public void v()
    {
        x_editor.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

                area_btn.setEnabled(true);
                perimeter_btn.setEnabled(true);
                y_editor.setEnabled(true);
            }
        });


    }

}

