package work.anmol.com.meracampus;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class NewsAndEventsActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_and_events);

        ListView listView = (ListView) findViewById(R.id.lvNewsFeed);
        News news = new News();

        List<News> m = new ArrayList<>();
        m.add(news);
        m.add(new News("Avenis coming"));
        m.add(new News("Enva Coming"));
        m.add(new News("IEEE round table conference is on the way"));
        m.add(new News("Result Declared"));
        m.add(new News("sessionals ahead"));
        m.add(new News("MSIT summer training by OSAHUB"));
        NewsAdapter adapt = new NewsAdapter(getApplicationContext(),m);
        listView.setAdapter(adapt);
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
