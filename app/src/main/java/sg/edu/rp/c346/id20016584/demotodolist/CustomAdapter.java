package sg.edu.rp.c346.id20016584.demotodolist;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
public class CustomAdapter extends ArrayAdapter{
    Context parent_context;
    int layout_id;
    ArrayList<ToDoItem> ToDoList;

    public CustomAdapter(Context context, int resource, ArrayList<ToDoItem> objects){
        super(context, resource, objects);
        parent_context=context;
        layout_id=resource;
        ToDoList=objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater=(LayoutInflater)
                parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView=inflater.inflate(layout_id, parent, false);

        TextView tvDo=rowView.findViewById(R.id.textViewDo);
        TextView tvDate=rowView.findViewById(R.id.textViewDate);

        tvDo.setText(ToDoList.get(position).getTitle());
        tvDate.setText(ToDoList.get(position).toString());

        return rowView;
    }
}
