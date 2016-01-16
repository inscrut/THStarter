package ru.skalix.starter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button bstart;
    Button bstop;
    Button bset;
    Button bok;
    Button bget;

    Button plus;
    Button minus;

    SeekBar setter;

    EditText eip;
    EditText eport;

    TextView upd;

    LinearLayout llip;
    LinearLayout llport;
    RelativeLayout rlupd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        llip = (LinearLayout)findViewById(R.id.ll_ip);
        llport = (LinearLayout)findViewById(R.id.ll_port);
        rlupd = (RelativeLayout)findViewById(R.id.rl_upd);

        bstart = (Button)findViewById(R.id.button_start);
        bstop = (Button)findViewById(R.id.button_stop);
        bset = (Button)findViewById(R.id.button_set);
        bok = (Button)findViewById(R.id.button_ok);
        bget = (Button)findViewById(R.id.button_get);

        plus = (Button)findViewById(R.id.button_plus);
        minus = (Button)findViewById(R.id.button_minus);

        setter = (SeekBar)findViewById(R.id.seekBar_up);

        eip = (EditText)findViewById(R.id.editText_ip);
        eport = (EditText)findViewById(R.id.editText_port);

        upd = (TextView)findViewById(R.id.textView_upd);

        llip.setVisibility(View.GONE);
        llport.setVisibility(View.GONE);
        rlupd.setVisibility(View.GONE);
        bok.setVisibility(View.GONE);
        bget.setVisibility(View.GONE);

        upd.setText("UPDATE: " + setter.getProgress() + " min");

        bstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        bstop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        bset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llip.setVisibility(View.VISIBLE);
                llport.setVisibility(View.VISIBLE);
                rlupd.setVisibility(View.VISIBLE);
                bok.setVisibility(View.VISIBLE);
                bget.setVisibility(View.VISIBLE);
                bset.setVisibility(View.GONE);
            }
        });
        bok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                llip.setVisibility(View.GONE);
                llport.setVisibility(View.GONE);
                rlupd.setVisibility(View.GONE);
                bok.setVisibility(View.GONE);
                bget.setVisibility(View.GONE);
                bset.setVisibility(View.VISIBLE);
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setter.setProgress(setter.getProgress() + 1);
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setter.setProgress(setter.getProgress() - 1);
            }
        });
        setter.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                upd.setText("UPDATE: " + progress + " min");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
