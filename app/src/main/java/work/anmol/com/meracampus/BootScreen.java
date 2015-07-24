package work.anmol.com.meracampus;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;


public class BootScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boot_screen);
        ActionBar actionBar=getSupportActionBar();
        actionBar.hide();
        Thread next=new Thread(){
            public void run(){
                try{
                sleep(2000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                finally {
                Intent i=new Intent(getApplicationContext(),LoginActivity.class);
                startActivity(i);
                }
            }
        };
        next.start();
            }

    @Override
    protected void onStop() {
        super.onStop();
        finish();
    }
}
