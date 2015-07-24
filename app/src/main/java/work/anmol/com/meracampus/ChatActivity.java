package work.anmol.com.meracampus;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import work.anmol.com.*;


public class ChatActivity extends AppCompatActivity  {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);
        List<Chat>chats=new ArrayList<>();

            chats.add(new Chat("Anmol","Hey","11-2-01"));
        chats.add(new Chat("Dher pal","can you please send me the notes","10-11-16"));
        chats.add(new Chat("Jatin","man, down","10-11-12"));
        chats.add(new Chat("sachin","roger that","11-9-2015"));
        chats.add(new Chat("shewag","Since its been","10-09-19"));
        chats.add(new Chat("virat","some messgae","12-08-11"));
        chats.add(new Chat("gauti","some messgae","19-2-13"));
        chats.add(new Chat("raina","some messgae","2-04-11"));
        chats.add(new Chat("dhoni","some messgae","11-9-2015"));
        chats.add(new Chat("bhuvi","some messgae with a random date","11-9-2015"));
        chats.add(new Chat("shami","POJO created","11-9-2015"));
        chats.add(new Chat("pathan","some messgae with some text","11-9-2015"));
        chats.add(new Chat("A B devilers","yeah that mah man","11-9-2015"));
        chats.add(new Chat("steve smith","projet endcode dutf-9","11-9-2015"));
        chats.add(new Chat("chris gayle","ductile frequency","11-9-2015"));
        chats.add(new Chat("sachin.java","POJO created","11-9-2015"));
        chats.add(new Chat("Reetika","POJO created","11-9-2015"));
        chats.add(new Chat("shreesanth","POJO created","11-9-2015"));
        chats.add(new Chat("Bhumit","happy bday ","10-11-12"));
        ListView list=(ListView)findViewById(R.id.lvChats);
        ChatAdapter adapter=new ChatAdapter(getApplicationContext(),chats);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(new Intent(getApplicationContext(), ChatViewActivity.class));
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
