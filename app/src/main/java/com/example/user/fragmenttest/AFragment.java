package com.example.user.fragmenttest;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
public class AFragment extends Fragment {
    private String value = "";
    Button[] btns = new Button[10];

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        MainActivity mainActivity = (MainActivity)activity;
        value = mainActivity.getAppleData();
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.activity_afragment, container, false);
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        TextView txtResult = (TextView) this.getView().findViewById(R.id.textView1);
        txtResult.setText(value);

        doFindView();

    }

    //找View By ID
    public void doFindView() {


        btns[0] = (Button) this.getView().findViewById(R.id.b0);
        btns[1] = (Button) this.getView().findViewById(R.id.b1);
        btns[2] = (Button) this.getView().findViewById(R.id.b2);
        btns[3] = (Button) this.getView().findViewById(R.id.b3);
        btns[4] = (Button) this.getView().findViewById(R.id.b4);
        btns[5] = (Button) this.getView().findViewById(R.id.b5);
        btns[6] = (Button) this.getView().findViewById(R.id.b6);
        btns[7] = (Button) this.getView().findViewById(R.id.b7);
        btns[8] = (Button) this.getView().findViewById(R.id.b8);
        btns[9] = (Button) this.getView().findViewById(R.id.b9);
    }
    public void TableStatus(View v) {
        int i = 1;
        Drawable d = Drawable.createFromPath("@drawable/button_focused");
        btns[i].setBackgroundDrawable(d);

    }

    }