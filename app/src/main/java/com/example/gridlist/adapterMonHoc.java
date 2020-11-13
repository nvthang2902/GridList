package com.example.gridlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class adapterMonHoc extends BaseAdapter {

    private android.content.Context Context;
    private int Layout;
    private List<monHoc> monHocList;

    public adapterMonHoc(android.content.Context context, int layout, List<monHoc> monHocList) {
        Context = context;
        Layout = layout;
        this.monHocList = monHocList;
    }

    @Override
    public int getCount() {
        return monHocList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        LayoutInflater infalter = (LayoutInflater) Context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = infalter.inflate(Layout,null);

        TextView txtTen = (TextView) convertView.findViewById(R.id.ngonNgu);

        TextView txtMota = (TextView) convertView.findViewById(R.id.moTa);

        ImageView image = (ImageView) convertView.findViewById(R.id.image);

        //gan gia tri
        monHoc monHoc = monHocList.get(i);

        //
        txtTen.setText(monHoc.getTenMonHoc());
        txtMota.setText(monHoc.getMoTa());
        image.setImageResource(monHoc.getImage());


        return convertView;
    }
}
