package mamdouh.ahmed.listview3;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class adapter extends ArrayAdapter<data_class>
{
    ImageView image;
    TextView name,number;

    public adapter(@NonNull Context context, int resource, ArrayList<data_class> info)
    {
        super(context, resource,info);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        if ( convertView == null)
        {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, null, false);
        }

        image=convertView.findViewById(R.id.image);
        name=convertView.findViewById(R.id.name);
        number=convertView.findViewById(R.id.number);

        data_class DataClass =getItem(position);

        if(DataClass != null) {
            image.setImageResource(DataClass.getImage_url());
            name.setText(DataClass.getName());
            number.setText(DataClass.getNumber());
        }

        return convertView;
    }
}
