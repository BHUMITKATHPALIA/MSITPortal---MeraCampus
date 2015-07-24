package work.anmol.com.meracampus;

import android.content.Context;
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
public class TeacherAdapter extends ArrayAdapter<Teacher> {
    public TeacherAdapter(Context context, List<Teacher> teacher ) {
        super(context, R.layout.single_list_teacher,teacher);

    }
    @Override
    public View getView(int position, View convertView,ViewGroup parent)
    {
        LayoutInflater teacherInflater = LayoutInflater.from(getContext());
        View customView= teacherInflater.inflate(R.layout.single_list_teacher, parent, false);
        Teacher singleTeacher = getItem(position);
        TextView tvTeacherName =(TextView) customView.findViewById(R.id.tvTeacherName);
        ImageView ivTeacherPhoto = (ImageView) customView.findViewById(R.id.ivTeacherPhoto);
        tvTeacherName.setText("Mrs Madam");
        ivTeacherPhoto.setImageResource(R.drawable.logo);
        return customView;
    }
}