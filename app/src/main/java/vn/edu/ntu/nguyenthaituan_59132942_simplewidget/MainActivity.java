package vn.edu.ntu.nguyenthaituan_59132942_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name, date, favourite;
    Button submit;
    RadioGroup radioGroup;

    CheckBox wfilm,lmusic,cf,home,cook;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.tencuaban);
        date = findViewById(R.id.ngaysinhcuaban);
        favourite = findViewById(R.id.sothichkhac);

        //-------------checkbox---------------
        wfilm = findViewById(R.id.xemphim);
        lmusic = findViewById(R.id.nghenhac);
        cf = findViewById(R.id.dicafe);
        home = findViewById(R.id.homealone);
        cook =  findViewById(R.id.nauan);
        //-----------------------------------
        radioGroup = findViewById(R.id.radioGroup);
        submit =  findViewById(R.id.buttonxacnhan);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String str ="";
                str+="Tên bạn: "+name.getText().toString();
                str+="\nNgày sinh: "+date.getText().toString();

                switch (radioGroup.getCheckedRadioButtonId()){
                    case R.id.nam: str+="\nGiới tính : nam"; break;
                    case R.id.nu: str+="\nGiới tính : nữ"; break;
                }

                str+="\nSở thích: ";

                if(wfilm.isChecked()){
                    str =str+wfilm.getText().toString()+"; ";
                }
                if(lmusic.isChecked()){
                    str =str+lmusic.getText().toString()+"; ";
                }
                if(cf.isChecked()){
                    str =str+cf.getText().toString()+"; ";
                }
                if(home.isChecked()){
                    str =str+home.getText().toString()+"; ";
                }
                if(cook.isChecked()){
                    str =str+cook.getText().toString();
                }

                str+=favourite.getText()+".";
                Toast.makeText(getApplicationContext(),str,Toast.LENGTH_LONG).show();
            }
        });
    }
}
