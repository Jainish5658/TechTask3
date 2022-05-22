package com.jainish.solanki.assignment_trial_1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Build;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

public class studyMaterial extends AppCompatActivity {

    private Toolbar mToolBar;
    private TabLayout mTabLayout;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study_material);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();


        mToolBar = findViewById(R.id.toolBar);
        mViewPager = findViewById(R.id.viewPager);
        mTabLayout = findViewById(R.id.tabLayout);

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {

            mToolBar.setTitle("Study Material");

        }

        setupViewPager(mViewPager);
        mTabLayout.setupWithViewPager(mViewPager);


    }

    private void setupViewPager(ViewPager viewPager) {

        viewPagerAdpater adpater = new viewPagerAdpater(getSupportFragmentManager());
        adpater.addFragment(new FragmentOne(), "Phy Sem");
        adpater.addFragment(new FragmentTwo(), "Chem Sem");

        viewPager.setAdapter(adpater);



    }
      class  viewPagerAdpater extends FragmentPagerAdapter {

        private final List<Fragment> mFragmentList = new ArrayList<>();
          private final List<String> mFragmentTitleList = new ArrayList<>();


          public viewPagerAdpater(@NonNull FragmentManager fm) {
              super(fm);
          }

          @NonNull
          @Override
          public Fragment getItem(int i) {
              return mFragmentList.get(i);
          }


          @Override
          public int getCount() {
              return mFragmentList.size();
          }
          public  void  addFragment(Fragment fragment, String title) {
              mFragmentList.add(fragment);
              mFragmentTitleList.add(title);


          }

          @Nullable
          @Override
          public CharSequence getPageTitle(int position) {
              return mFragmentTitleList.get(position);
          }
      }
      }

