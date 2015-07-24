package work.anmol.com.meracampus;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.internal.widget.AdapterViewCompat;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class TeacherReviewActivity extends ActionBarActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_review);
        List<Teacher>teacher =new ArrayList<Teacher>();
        for(int i=0;i<20;i++){
            String name="Mrs. Mam"+ i;
            teacher.add(new Teacher(name));
        }
        ListView lV = (ListView) findViewById(R.id.lvTeachers);
        TeacherAdapter listAdapter = new TeacherAdapter(getApplicationContext(),teacher);
        lV.setAdapter(listAdapter);
        lV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.v("Item Click", "Click shyd hi hua");
                Toast.makeText(getApplicationContext(), "item clicked", Toast.LENGTH_LONG).show();
                Intent i = new Intent(getApplicationContext(), TeacherViewActivity.class);
                startActivity(i);
            }
        });
    button=(Button)findViewById(R.id.bTeacherNext);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),TeacherViewActivity.class));
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
    }}
