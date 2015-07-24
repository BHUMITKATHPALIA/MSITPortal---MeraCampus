package work.anmol.com.meracampus;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;


public class RegisterationActivity extends ActionBarActivity {
    private RadioGroup radioGroupUser;
    private RadioButton radioButtonSel;
    private Button reg;
    TextView reg1;
    EditText name;
    EditText enroll;
    EditText mail;
    EditText pass;
    EditText mob;

    @Override
     public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registeration);

        final EditText name = (EditText) findViewById(R.id.etUserName);
        final EditText mail = (EditText) findViewById(R.id.etMail);
        final EditText mob = (EditText) findViewById(R.id.etMob);

        final EditText enroll = (EditText) findViewById(R.id.etEnroll);


        final EditText pass = (EditText) findViewById(R.id.etPass);


        final Button reg = (Button) findViewById(R.id.bReg);
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (name.getText().toString().isEmpty()) {
                    name.setHintTextColor(Color.RED);
                    name.setBackgroundColor(Color.red(80));
                    Toast.makeText(getApplicationContext(),
                            ("feilds are missing"), Toast.LENGTH_SHORT).show();
                }
                if (mail.getText().toString().isEmpty()) {
                    mail.setHintTextColor(Color.RED);
                    mail.setBackgroundColor(Color.red(80));
                    Toast.makeText(getApplicationContext(),
                            ("feilds are missing"), Toast.LENGTH_SHORT).show();
                }
                if (mob.getText().toString().isEmpty()) {
                    mob.setHintTextColor(Color.RED);
                    mob.setBackgroundColor(Color.red(80));
                    Toast.makeText(getApplicationContext(),
                            ("feilds are missing"), Toast.LENGTH_SHORT).show();
                }

                if (enroll.getText().toString().isEmpty()) {
                    enroll.setHintTextColor(Color.RED);
                    enroll.setBackgroundColor(Color.red(80));
                    Toast.makeText(getApplicationContext(),
                            ("feilds are missing"), Toast.LENGTH_SHORT).show();
                }

                if (pass.getText().toString().isEmpty()) {
                    pass.setHintTextColor(Color.RED);
                    pass.setBackgroundColor(Color.red(80));
                    Toast.makeText(getApplicationContext(),
                            ("feilds are missing"), Toast.LENGTH_SHORT).show();
                } else {
                    startActivity(new Intent(getApplicationContext(),NewsAndEventsActivity.class));
                }
            }


            public void addListenerOnButton() {

                radioGroupUser = (RadioGroup) findViewById(R.id.radioUser);
                Button reg = (Button) findViewById(R.id.bReg);

                reg.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {

                        // get selected radio button from radioGroup
                        int selectedId = radioGroupUser.getCheckedRadioButtonId();

                        // find the radiobutton by returned id
                        radioButtonSel = (RadioButton) findViewById(selectedId);

                        Toast.makeText(getApplicationContext(),
                                radioButtonSel.getText(), Toast.LENGTH_SHORT).show();

                    }

                });
            }
        });

    }    }
