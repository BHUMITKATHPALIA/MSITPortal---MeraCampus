package work.anmol.com.meracampus;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by anmol on 7/21/2015.
 */
public class MessageAdapter extends ArrayAdapter<Message> {
    public MessageAdapter(Context context,List<Message>ob){
        super(context,R.layout.simple_message,ob);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater teacherInflater = LayoutInflater.from(getContext());
        View customView= teacherInflater.inflate(R.layout.simple_message, parent, false);
        Message entity=getItem(position);
        TextView tv=(TextView)customView.findViewById(R.id.tvMessgaeChat);
        if(entity.recived==true){
            tv.setTextColor(Color.BLUE);
            tv.setGravity(Gravity.RIGHT );
            tv.setText(entity.message);
        }
        else{
            tv.setTextColor(Color.RED);
            tv.setGravity(Gravity.LEFT);
            tv.setText(entity.message);

        }
        return customView;
    }
}
