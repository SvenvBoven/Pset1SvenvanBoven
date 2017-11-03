package com.example.dingen.pset1svenvanboven;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    public ImageView imgArms = findViewById(R.id.imageViewArms);
    public ImageView imgEars = findViewById(R.id.imageViewEars);
    public ImageView imgEyebrows = findViewById(R.id.imageViewEyebrows);
    public ImageView imgEyes = findViewById(R.id.imageViewEyes);
    public ImageView imgGlasses = findViewById(R.id.imageViewGlasses);
    public ImageView imgHat = findViewById(R.id.imageViewHat);
    public ImageView imgMouth = findViewById(R.id.imageViewMouth);
    public ImageView imgMustache = findViewById(R.id.imageViewMustache);
    public ImageView imgNose = findViewById(R.id.imageViewNose);
    public ImageView imgShoes = findViewById(R.id.imageViewShoes);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putInt("arms",imgArms.getVisibility());
        outState.putInt("ears",imgEars.getVisibility());
        outState.putInt("eyebrows",imgEyebrows.getVisibility());
        outState.putInt("eyes",imgEyes.getVisibility());
        outState.putInt("glasses",imgGlasses.getVisibility());
        outState.putInt("hat",imgHat.getVisibility());
        outState.putInt("mouth",imgMouth.getVisibility());
        outState.putInt("mustache",imgMustache.getVisibility());
        outState.putInt("nose",imgNose.getVisibility());
        outState.putInt("shoes",imgShoes.getVisibility());

    }
    public void onRestoreInstanceState(Bundle inState){
        super.onRestoreInstanceState(inState);
        int visibility = inState.getInt("arms");
        imgArms.setVisibility(visibility);
        visibility = inState.getInt("ears");
        imgEars.setVisibility(visibility);
        visibility = inState.getInt("eyebrows");
        imgEyebrows.setVisibility(visibility);
        visibility = inState.getInt("eyes");
        imgEyes.setVisibility(visibility);
        visibility = inState.getInt("glasses");
        imgGlasses.setVisibility(visibility);
        visibility = inState.getInt("hat");
        imgHat.setVisibility(visibility);
        visibility = inState.getInt("mouth");
        imgMouth.setVisibility(visibility);
        visibility = inState.getInt("mustache");
        imgMustache.setVisibility(visibility);
        visibility = inState.getInt("nose");
        imgNose.setVisibility(visibility);
        visibility = inState.getInt("shoes");
        imgShoes.setVisibility(visibility);
    }

    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        switch (view.getId()) {
            case R.id.checkBoxArms:
                if (checked) {
                    imgArms.setVisibility(View.VISIBLE);

                } else {
                    imgArms.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBoxEars:
                if (checked) {
                    imgEars.setVisibility(View.VISIBLE);
                } else {
                    imgEars.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBoxEyebrows:
                if (checked) {
                    imgEyebrows.setVisibility(View.VISIBLE);
                } else {
                    imgEyebrows.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBoxEyes:
                if (checked) {
                    imgEyes.setVisibility(View.VISIBLE);
                } else {
                    imgEyes.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBoxGlasses:
                if (checked) {
                    imgGlasses.setVisibility(View.VISIBLE);
                } else {
                    imgGlasses.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBoxHat:
                if (checked) {
                    imgHat.setVisibility(View.VISIBLE);
                } else {
                    imgHat.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBoxMouth:
                if (checked) {
                    imgMouth.setVisibility(View.VISIBLE);
                } else {
                    imgMouth.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBoxMustache:
                if (checked) {
                    imgMustache.setVisibility(View.VISIBLE);
                } else {
                    imgMustache.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBoxNose:
                if (checked) {
                    imgNose.setVisibility(View.VISIBLE);
                } else {
                    imgNose.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBoxShoes:
                if (checked) {
                    imgShoes.setVisibility(View.VISIBLE);
                } else {
                    imgShoes.setVisibility(View.INVISIBLE);
                }
                break;
        }
    }
}