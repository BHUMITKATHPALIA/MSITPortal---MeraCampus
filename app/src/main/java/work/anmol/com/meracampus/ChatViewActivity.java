package work.anmol.com.meracampus;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class ChatViewActivity extends ActionBarActivity {
    List<Message> chats;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_view);
        chats=new ArrayList<>();
        for (int i=0;i<120;i++){
            if(i%3==0) {
                chats.add(new Message("send", false));
            }
            else {
                chats.add(new Message("recive",true));
            }
        }
        final EditText etCurrentThread=(EditText)findViewById(R.id.etCurrentThread);

//        Button bSend=(Button)findViewById(R.id.bsend);
//        bSend.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//            String message=etCurrentThread.getText().toString();
//                chats.add(new Message(message,false));
//            etCurrentThread.setText("");
//            }
//  });
        ListView list=(ListView)findViewById(R.id.lvMessageChatView);
        MessageAdapter adapter=new MessageAdapter(getApplicationContext(),chats);
        list.setAdapter(adapter);

    }

}
