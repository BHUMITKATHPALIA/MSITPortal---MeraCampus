package work.anmol.com.meracampus;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;


public class LoginActivity extends ActionBarActivity {
    Button bLog,bSkip;
    EditText etEnroll,etName,etPass;
    boolean val=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        final EditText etUserName = (EditText) findViewById(R.id.etUserName);
        final EditText etPassword = (EditText) findViewById(R.id.etPassword);
        TextView tvSkip = (TextView) findViewById(R.id.tvSkip);
       ImageView ivLogin = (ImageView) findViewById(R.id.ivLogin);
        ImageView ivRegister = (ImageView) findViewById(R.id.ivRegister);
       if (etUserName.getText().toString() == "" && etPassword.getText().toString() == "") {
            etUserName.setHintTextColor(Color.RED);

        }
        if(val) {
            ivLogin.setVisibility(View.VISIBLE);

        }
        else{
            ivLogin.setVisibility(View.VISIBLE);
        }

        ivLogin.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                if(etUserName.getText().toString().isEmpty()|| etPassword.getText().toString().isEmpty()){
                    Toast.makeText(getApplicationContext(),"please fill full details",Toast.LENGTH_LONG).show();

                } else {
                    Intent intent = new Intent(getApplicationContext(), NewsAndEventsActivity.class);
                    startActivity(intent);
                }

             }
         });
        tvSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2= new Intent(getApplicationContext(),AboutUsActivity.class);
                intent2.putExtra("sessionLog",false);
                startActivity(intent2);
            }
        });
        ivRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getApplicationContext(), RegisterationActivity.class);
                startActivity(intent1);
            }
        });

    }

}
