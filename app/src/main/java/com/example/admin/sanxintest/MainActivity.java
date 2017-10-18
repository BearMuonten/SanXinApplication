package com.example.admin.sanxintest;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private PieChartView pieChartView;
    private List<PieChartView.PieData> list;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pieChartView= (PieChartView) findViewById(R.id.pcv);

        initData();
    }

    private void initData(){
        list=new ArrayList<>();
        PieChartView.PieData data=new PieChartView.PieData("电子设备",0.2f, Color.parseColor("#FF26C6DA"));
        PieChartView.PieData data2=new PieChartView.PieData("智能机器人",0.3f, Color.parseColor("#FF5C6BC0"));
        PieChartView.PieData data3=new PieChartView.PieData("有色金属",0.1f, Color.parseColor("#FF79909C"));
        PieChartView.PieData data4=new PieChartView.PieData("医疗保险",0.4f,Color.parseColor("#FF7CD0AC"));

        list.add(data);
        list.add(data2);
        list.add(data3);
        list.add(data4);

        pieChartView.setPieDataList(list);
    }
}
