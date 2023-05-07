package com.example.examplelistview;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
public class countryAdapter extends BaseAdapter {

    Context context;

    String[] listCountry;
    String[] tipsCountry;

    LayoutInflater inflater;

//    Param 1 Context, param 2 -> seterusnya = Variable
    public countryAdapter(Context context, String[] listCountry, String[] tipsCountry){
        this.context = context;
        this.listCountry = listCountry;
        this.tipsCountry = tipsCountry;
        inflater = (LayoutInflater.from(context));
    }


    @Override
    public int getCount() {
        return listCountry.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Log.d("Here", "Masuk SIni...");
        convertView = inflater.inflate(R.layout.layout_item,null);
        TextView txtCountry = (TextView) convertView.findViewById(R.id.txtCountry);
        TextView txtTips = (TextView) convertView.findViewById(R.id.txtTips);

        txtCountry.setText(listCountry[position]);
        txtTips.setText(tipsCountry[position]);

        return convertView;
    }
}
