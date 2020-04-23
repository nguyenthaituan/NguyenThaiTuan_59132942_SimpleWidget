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
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name, date, favourite;
    Button submit;
    RadioGroup radioGroup;
    RadioButton radioButton;


    CheckBox wfilm,lmusic,cf,home,cook;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText) findViewById(R.id.tencuaban);
        date = (EditText) findViewById(R.id.ngaysinhcuaban);
        favourite = (EditText) findViewById(R.id.sothichkhac);

        //-------------checkbox---------------
        wfilm = (CheckBox) findViewById(R.id.xemphim);
        lmusic = (CheckBox) findViewById(R.id.nghenhac);
        cf = (CheckBox) findViewById(R.id.dicafe);
        home = (CheckBox) findViewById(R.id.homealone);
        cook = (CheckBox) findViewById(R.id.nauan);
        //------------------------------------

        submit = (Button) findViewById(R.id.buttonxacnhan);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

        //------------Checkbox-------------------------
                String str ="";

                if(wfilm.isChecked()){
                    str =str+wfilm.getText();
                }

                if(lmusic.isChecked()){
                    str =str+lmusic.getText();
                }

                if(cf.isChecked()){
                    str =str+cf.getText();
                }
                if(home.isChecked()){
                    str =str+home.getText();
                }
                if(cook.isChecked()){
                    str =str+cook.getText();
                }
        //-------------------------------------------------

         //--------------Set radioGroup--------------------
            radioGroup = findViewById(R.id.radioGroup);
            int id = radioGroup.getCheckedRadioButtonId();
            radioButton=findViewById(id);
        //-------------------------------------------------
                Toast.makeText(getApplicationContext(),"Tên: "+name.getText()+ '\n'
                        +"Ngày sinh: "+date.getText() + '\n'
                        + "Giới tính: "+radioButton.getText()+ '\n'
                        +"Sở thích: "+" , " +str+", "
                        +favourite.getText()
                        , Toast.LENGTH_SHORT).show();
            }
        });
    }




}
