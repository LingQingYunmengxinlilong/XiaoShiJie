package com.meng.xue.xiaoshijie;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.ShowableListMenu;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.meng.xue.xiaoshijie.fragment.Boutique;
import com.meng.xue.xiaoshijie.fragment.Discount;
import com.meng.xue.xiaoshijie.fragment.HomePageFragement;
import com.meng.xue.xiaoshijie.fragment.MyLo;

import java.util.ArrayList;
import java.util.List;

public class FramentActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {

    private FrameLayout frameLayout;
    List<Fragment> list;
    RadioGroup main_rg;
    RadioButton main_rb1, main_rb2, main_rb3, main_rb4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frament);
        listFrament();
            findView();

    }
    private void listFrament() {
        list = new ArrayList<>();
        HomePageFragement homepageframent = new HomePageFragement();
        Discount discount = new Discount();
        MyLo mtlo = new MyLo();
        Boutique boutique = new Boutique();
        list.add(homepageframent);
        list.add(boutique);
        list.add(discount);
        list.add(mtlo);

    }

    private void findView() {
        frameLayout = (FrameLayout) findViewById(R.id.main_framelayout_01);
        main_rg = (RadioGroup) findViewById(R.id.main_bwn_rg);
        main_rb1 = (RadioButton) findViewById(R.id.main_bwn_rb1);
        main_rb2 = (RadioButton) findViewById(R.id.main_bwn_rb2);
        main_rb3 = (RadioButton) findViewById(R.id.main_bwn_rb3);
        main_rb4 = (RadioButton) findViewById(R.id.main_bwn_rb4);
        main_rb1.setChecked(true);
        getSupportFragmentManager().beginTransaction().add(R.id.main_framelayout_01,list.get(0)).commit();
        main_rg.setOnCheckedChangeListener(this);
    }


    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        switch (i){
            case R.id.main_bwn_rb1:
                addFrament(0);
                break;
            case R.id.main_bwn_rb2:
                addFrament(1);
                break;
            case R.id.main_bwn_rb3:
                addFrament(2);
                break;
            case R.id.main_bwn_rb4:
                addFrament(3);
                break;


        }
    }

    private void addFrament(int i) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.main_framelayout_01, list.get(i));
        fragmentTransaction.commit();

    }
}
