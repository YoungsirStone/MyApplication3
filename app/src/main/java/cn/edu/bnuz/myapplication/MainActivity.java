package cn.edu.bnuz.myapplication;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout=(TabLayout)findViewById(R.id.tablayout_id);
        viewPager=(ViewPager)findViewById(R.id.viewpager_id);

        ViewPagerAdapter adapter=new ViewPagerAdapter(getSupportFragmentManager());
        adapter.AddFragment(new FragmentHome(),"首页");
        adapter.AddFragment(new FragmentDevInfo(),"设备信息");
        adapter.AddFragment(new FragmentDevSetting(),"设备设定");
        adapter.AddFragment(new FragmentHistoryData(),"历史数据");
        adapter.AddFragment(new FragmentHistoryAlram(),"历史告警");
        adapter.AddFragment(new FragmentContactUs(),"联系我们");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);


    }
}
