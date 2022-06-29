package com.example.grafici;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.charts.RadarChart;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.data.RadarData;
import com.github.mikephil.charting.data.RadarDataSet;
import com.github.mikephil.charting.data.RadarEntry;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class RadarChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radar_chart);

        RadarChart radarChart = findViewById(R.id.radarChart);

        ArrayList<RadarEntry> array =  new ArrayList<>();
        array.add(new RadarEntry(250));
        array.add(new RadarEntry(350));
        array.add(new RadarEntry(750));
        array.add(new RadarEntry(150));
        array.add(new RadarEntry(950));

        RadarDataSet radarDataSet = new RadarDataSet(array,"Visitors");
        radarDataSet.setColor(Color.RED);
        radarDataSet.setLineWidth(2f);
        radarDataSet.setValueTextColor(Color.RED);
        radarDataSet.setValueTextSize(14f);

        ArrayList<RadarEntry> array2 =  new ArrayList<>();
        array2.add(new RadarEntry(250));
        array2.add(new RadarEntry(150));
        array2.add(new RadarEntry(950));
        array2.add(new RadarEntry(450));
        array2.add(new RadarEntry(200));

        RadarDataSet radarDataSet2 = new RadarDataSet(array2,"Visitors22");
        radarDataSet2.setColor(Color.BLUE);
        radarDataSet2.setLineWidth(2f);
        radarDataSet2.setValueTextColor(Color.BLUE);
        radarDataSet2.setValueTextSize(14f);

        RadarData radarData = new RadarData();
        radarData.addDataSet(radarDataSet);
        radarData.addDataSet(radarDataSet2);

        String[] labels = {"2014","2015","2016","2017","2018","2019"};

        XAxis xAxis = radarChart.getXAxis();
        xAxis.setValueFormatter(new IndexAxisValueFormatter(labels));

        radarChart.getDescription().setText("Radar Chart");
        radarChart.setData(radarData);


    }
}