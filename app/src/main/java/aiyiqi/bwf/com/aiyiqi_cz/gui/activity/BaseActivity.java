package aiyiqi.bwf.com.aiyiqi_cz.gui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import aiyiqi.bwf.com.aiyiqi_cz.R;

public abstract class BaseActivity extends Fragment {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initView();
        initDatas();
    }

    /**
     * 初始化View
     */
    abstract void initDatas();
    /**
     * 初始化数据
     */
    abstract void initView();
    /**
     * 获得布局的ID
     */
    abstract int getContextViewResId();

}
