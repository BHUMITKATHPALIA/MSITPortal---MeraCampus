package work.anmol.com.meracampus;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class NotesActivity extends ActionBarActivity {
    Button bNotes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);
        bNotes=(Button)findViewById(R.id.bAddNotes);
        bNotes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), AddNotesActivity.class));
            }
        });
        List<Notes> obj=new ArrayList<>();
        obj.add(new Notes("Android","talking about intents"));
        obj.add(new Notes("Android","lets start a new activity"));
        obj.add(new Notes("Android","helo world"));
        obj.add(new Notes("Android","shared prefs"));
        obj.add(new Notes("Android","start activity for a result"));
        obj.add(new Notes("Android","databases"));
        obj.add(new Notes("Android","databases over a newtork"));
        obj.add(new Notes("Android","sqlite, its really LITE"));
        obj.add(new Notes("Android","PARSING JSON DATA"));
        obj.add(new Notes("Android","fragments"));
        obj.add(new Notes("Android","broadcast "));
        obj.add(new Notes("Android", "services"));
        obj.add(new Notes("Android","Best APP ever"));
        obj.add(new Notes("ANdroid", "Custom UI"));

        ListView lv=(ListView)findViewById(R.id.lv123);
        NotesAdapter adapter=new NotesAdapter(getApplicationContext(),obj);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(new Intent(getApplicationContext(),NotesViewActivtiy.class));
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
        }

        return true;
    }
}
