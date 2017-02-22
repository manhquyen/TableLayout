package com.example.mypc.manhquyen.tablelayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class LunchList extends AppCompatActivity {
    Restaurant r = new Restaurant();
    Discount d= new Discount();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch_list);
        Button save = (Button)findViewById(R.id.save);
        save.setOnClickListener(onSave);
        CheckBox paycard=(CheckBox)findViewById(R.id.card);
        Pay payPro= new Pay();             // paycard
        paycard.setOnCheckedChangeListener(payPro);
    }
    String str1;
    String str2;
    String dis1;
    String dis2;
    String dis3;
    class Pay implements CompoundButton.OnCheckedChangeListener {
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
        {
            if(isChecked){

                str2="trả bằng thẻ";
            }
            else {
                str2="k trả bằng thẻ ";
            }
        }
    }



    private View.OnClickListener onSave =new View.OnClickListener() {

        public void onClick(View v) {
                EditText name=(EditText)findViewById(R.id.name);
        EditText address=(EditText)findViewById(R.id.addr);
        r.setName(name.getText().toString());
            r.setAddress(address.getText().toString());
            RadioGroup types=(RadioGroup)findViewById(R.id.types);
            switch (types.getCheckedRadioButtonId()) {
                case R.id.sit_down:
                r.setType("sit_down");
                break;
                case R.id.take_out:
                r.setType("take_out");
                break;
                case R.id.delivery:
                r.setType("delivery");
                break;

            }
            RadioGroup muc=(RadioGroup)findViewById(R.id.muc);
            switch (muc.getCheckedRadioButtonId()) {
                case R.id.giam25:
                r.setDiscount("bạn được giảm 25%");
                break;
                case R.id.giam50:
                r.setDiscount("bạn được giảm 50%");
                break;
                case R.id.giam75:
                r.setDiscount("bạn được giảm 75%");
                break;

            }

            String str;
            str = r.getName() + "\n" + r.getAddress() + "\n"+r.getType()+ "\n"+r.getDiscount()+"\n"+str2;
            Toast.makeText(LunchList.this,str,Toast.LENGTH_LONG).show();
        }

    };

}
