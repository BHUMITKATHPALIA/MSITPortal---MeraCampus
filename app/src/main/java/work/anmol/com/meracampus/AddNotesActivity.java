package work.anmol.com.meracampus;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
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


public class AddNotesActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_notes);
//        List<Notes>notes=new ArrayList<Notes>();
//        for (int i=0;i<12;i++){
//            notes.add(new Notes());
//        }
//        ListView listView = (ListView) findViewById(R.id.lvTeachers);
//        ListAdapter listAdapter = new NotesAdapter(getApplicationContext(),notes);
//        listView.setAdapter(listAdapter);
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                startActivity(new Intent(getApplicationContext(), ViewNotesActivity.class));
//            }
//        });
        Button bSub=(Button)findViewById(R.id.bSubnotes);
        bSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"ADDED SUCCESFULLY",Toast.LENGTH_LONG).show();
                startActivity(new Intent(getApplicationContext(),NotesActivity.class));
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

            case R.id.goNotes:startActivity(new Intent(getApplicationContext(),AddNotesActivity.class));
                break;
            case R.id.goTeachers: startActivity(new Intent(getApplicationContext(),TeacherReviewActivity.class));
            break;

            case R.id.goLogout:startActivity(new Intent(getApplicationContext(),LoginActivity.class));
                break;
        }

        return true;
    }
}
