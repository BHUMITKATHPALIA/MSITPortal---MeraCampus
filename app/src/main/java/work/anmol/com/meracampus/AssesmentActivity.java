package work.anmol.com.meracampus;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class AssesmentActivity extends ActionBarActivity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assesment);
        Button bGo=(Button)findViewById(R.id.bGo);
        text=(TextView)findViewById(R.id.tvResults);

        bGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            text.setTextColor(Color.CYAN);
                text.setText("these fucntions will be available once after the result");
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_about_us, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        switch(id){
            case R.id.go_chats:startActivity(new Intent(getApplicationContext(),ChatActivity.class));
                break;
            case R.id.goAboutUs: startActivity(new Intent(getApplicationContext(),AboutUsActivity.class));
                break;

            case R.id.goNotes:startActivity(new Intent(getApplicationContext(),NotesActivity.class));
                break;
            case R.id.goTeachers: startActivity(new Intent(getApplicationContext(),TeacherReviewActivity.class));
                break;
            case R.id.goAssess:startActivity(new Intent(getApplicationContext(),AssesmentActivity.class));
                break;
            case R.id.goNewsFeed:startActivity(new Intent(getApplicationContext(),NewsAndEventsActivity.class));
                break;
            case R.id.goSocities:startActivity(new Intent(getApplicationContext(),SocietiesActivity.class));
                break;

            case R.id.goLogout:startActivity(new Intent(getApplicationContext(),LoginActivity.class));
                break;
        }

        return true;
    }

}
