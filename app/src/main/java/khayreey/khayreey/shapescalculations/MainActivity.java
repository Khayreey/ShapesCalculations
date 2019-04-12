package khayreey.khayreey.shapescalculations;

import android.content.Intent;
import android.os.ParcelUuid;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    LinearLayout sq;
    LinearLayout ci;
    LinearLayout re;
    LinearLayout tr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        find();
        SQ();
        CI();
        RE();
        TR();
        }

    public void find()
    {
        sq = (LinearLayout)  findViewById(R.id.sq_layout);
        ci = (LinearLayout)  findViewById(R.id.ci_layout);
        re=  (LinearLayout)  findViewById(R.id.re_layout);
        tr = (LinearLayout)  findViewById(R.id.tr_layout);
    }
    public void SQ()
    {
        sq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n = new Intent(MainActivity.this, sq.class);
                startActivity(n);
            }

            });
    }

    public void CI()
    {
        ci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n=new Intent(MainActivity.this,ci.class);
                startActivity(n);
            }
        });
    }

    public void RE()

    {
        re.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n=new Intent(MainActivity.this,re.class);
                startActivity(n);
            }
        });
    }
   public void TR()
   {
       tr.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
          Intent n=new Intent(MainActivity.this,tr.class);
          startActivity(n);
           }
       });
   }




}
