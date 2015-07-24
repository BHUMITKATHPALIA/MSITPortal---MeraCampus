package work.anmol.com.meracampus;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by anmol on 7/21/2015.
 */
public class NotesAdapter extends ArrayAdapter<Notes> {
    LayoutInflater inflater;
    public NotesAdapter(Context context,List<Notes> n){
        super(context,R.layout.single_notes,n);

    }




    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=LayoutInflater.from(getContext());

        View rootView = inflater.inflate(R.layout.single_notes, parent, false);
        Notes note=getItem(position);

        TextView etDescription=(TextView)rootView.findViewById(R.id.tvDescription);
        TextView link=(TextView)rootView.findViewById(R.id.tvLink);
        etDescription.setText(note.topic);
        link.setText(note.description);
        return rootView;
    }


}
