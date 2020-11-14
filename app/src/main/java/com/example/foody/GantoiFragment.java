package com.example.foody;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class GantoiFragment extends Fragment {
    GridView gridView;
    GirdViewBaseAdapter adapter;
    ArrayList<GirdViewBean> arr_bean;
    Context context;
    ListViewBean listViewBean;
    View v;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_gantoi,container,false);
        gridView = v.findViewById(R.id.gridview2);
        arr_bean = new ArrayList<>();

        homeData();
        context = this.getActivity();
        adapter = new GirdViewBaseAdapter(arr_bean,context);
        gridView.setAdapter(adapter);

        return v;
        ///////


    }
    private void homeData(){


        arr_bean.add(new GirdViewBean(R.drawable.imggrid1, "[DN] CHỈ 1K vẫn phá cỗ xịn","Giảm từ 20% ~ 40% Buffet + Tặng Món đặt chỗ qua NowTable","1h"));
        arr_bean.add(new GirdViewBean(R.drawable.imggrid2, "[DN] Gợi ý món CHAY","Giảm từ 20% ~ 40% Buffet + Tặng Món đặt chỗ qua NowTable","30p"));
        arr_bean.add(new GirdViewBean(R.drawable.imggrid3,"[DN] MÓN NGON siêu RẺ","Giảm từ 20% ~ 40% Buffet + Tặng Món đặt chỗ qua NowTable","2h"));
        arr_bean.add(new GirdViewBean(R.drawable.imggrid4, "[DN] Highland Coffee tặng bạn ","Giảm từ 20% ~ 40% Buffet + Tặng Món đặt chỗ qua NowTable","3h"));
        arr_bean.add(new GirdViewBean(R.drawable.imggrid1, "[DN] CHỈ 1K vẫn phá cỗ xịn","Giảm từ 20% ~ 40% Buffet + Tặng Món đặt chỗ qua NowTable","2h"));
        arr_bean.add(new GirdViewBean(R.drawable.imggrid2, "[DN] Gợi ý món CHAY","Giảm từ 20% ~ 40% Buffet + Tặng Món đặt chỗ qua NowTable","2h"));
        arr_bean.add(new GirdViewBean(R.drawable.imggrid3,"[DN] MÓN NGON siêu RẺ","Giảm từ 20% ~ 40% Buffet + Tặng Món đặt chỗ qua NowTable","10p"));
        arr_bean.add(new GirdViewBean(R.drawable.imggrid4, "[DN] Highland Coffee tặng bạn","Giảm từ 20% ~ 40% Buffet + Tặng Món đặt chỗ qua NowTable","9h"));
        arr_bean.add(new GirdViewBean(R.drawable.imggrid1, "[DN] CHỈ 1K vẫn phá cỗ xịn","Giảm từ 20% ~ 40% Buffet + Tặng Món đặt chỗ qua NowTable","9h"));
        arr_bean.add(new GirdViewBean(R.drawable.imggrid3, "[DN] Gợi ý món CHAY","Giảm từ 20% ~ 40% Buffet + Tặng Món đặt chỗ qua NowTable","9h"));
        arr_bean.add(new GirdViewBean(R.drawable.imggrid2,"[DN] MÓN NGON siêu RẺ","Giảm từ 20% ~ 40% Buffet + Tặng Món đặt chỗ qua NowTable","9h"));
        arr_bean.add(new GirdViewBean(R.drawable.imggrid4, "[DN] Highland Coffee tặng bạn","Giảm từ 20% ~ 40% Buffet + Tặng Món đặt chỗ qua NowTable","9h"));

        adapter=new GirdViewBaseAdapter(arr_bean,this.getActivity());
        gridView.setAdapter(adapter);
    }

}