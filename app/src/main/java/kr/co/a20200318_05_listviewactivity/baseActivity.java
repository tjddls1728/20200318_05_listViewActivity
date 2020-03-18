package kr.co.a20200318_05_listviewactivity;

import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;

public abstract class baseActivity extends AppCompatActivity {

    public Context nContext = this;

    public abstract void setEvents();
    public abstract void setValues();
}
