package com.example.dingen.pset1svenvanboven;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        ImageView imgArms = findViewById(R.id.imageViewArms);
        ImageView imgEars = findViewById(R.id.imageViewEars);
        ImageView imgEyebrows = findViewById(R.id.imageViewEyebrows);
        ImageView imgEyes = findViewById(R.id.imageViewEyes);
        ImageView imgGlasses = findViewById(R.id.imageViewGlasses);
        ImageView imgHat = findViewById(R.id.imageViewHat);
        ImageView imgMouth = findViewById(R.id.imageViewMouth);
        ImageView imgMustache = findViewById(R.id.imageViewMustache);
        ImageView imgNose = findViewById(R.id.imageViewNose);
        ImageView imgShoes = findViewById(R.id.imageViewShoes);
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
        ImageView imgArms = findViewById(R.id.imageViewArms);
        ImageView imgEars = findViewById(R.id.imageViewEars);
        ImageView imgEyebrows = findViewById(R.id.imageViewEyebrows);
        ImageView imgEyes = findViewById(R.id.imageViewEyes);
        ImageView imgGlasses = findViewById(R.id.imageViewGlasses);
        ImageView imgHat = findViewById(R.id.imageViewHat);
        ImageView imgMouth = findViewById(R.id.imageViewMouth);
        ImageView imgMustache = findViewById(R.id.imageViewMustache);
        ImageView imgNose = findViewById(R.id.imageViewNose);
        ImageView imgShoes = findViewById(R.id.imageViewShoes);
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
                    ImageView imgArms = findViewById(R.id.imageViewArms);
                    imgArms.setVisibility(View.VISIBLE);

                } else {
                    ImageView imgArms = findViewById(R.id.imageViewArms);
                    imgArms.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBoxEars:
                if (checked) {
                    ImageView imgEars = findViewById(R.id.imageViewEars);
                    imgEars.setVisibility(View.VISIBLE);
                } else {
                    ImageView imgEars = findViewById(R.id.imageViewEars);
                    imgEars.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBoxEyebrows:
                if (checked) {
                    ImageView imgEyebrows = findViewById(R.id.imageViewEyebrows);
                    imgEyebrows.setVisibility(View.VISIBLE);
                } else {
                    ImageView imgEyebrows = findViewById(R.id.imageViewEyebrows);
                    imgEyebrows.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBoxEyes:
                if (checked) {
                    ImageView imgEyes = findViewById(R.id.imageViewEyes);
                    imgEyes.setVisibility(View.VISIBLE);
                } else {
                    ImageView imgEyes = findViewById(R.id.imageViewEyes);
                    imgEyes.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBoxGlasses:
                if (checked) {
                    ImageView imgGlasses = findViewById(R.id.imageViewGlasses);
                    imgGlasses.setVisibility(View.VISIBLE);
                } else {
                    ImageView imgGlasses = findViewById(R.id.imageViewGlasses);
                    imgGlasses.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBoxHat:
                if (checked) {
                    ImageView imgHat = findViewById(R.id.imageViewHat);
                    imgHat.setVisibility(View.VISIBLE);
                } else {
                    ImageView imgHat = findViewById(R.id.imageViewHat);
                    imgHat.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBoxMouth:
                if (checked) {
                    ImageView imgMouth = findViewById(R.id.imageViewMouth);
                    imgMouth.setVisibility(View.VISIBLE);
                } else {
                    ImageView imgMouth = findViewById(R.id.imageViewMouth);
                    imgMouth.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBoxMustache:
                if (checked) {
                    ImageView imgMustache = findViewById(R.id.imageViewMustache);
                    imgMustache.setVisibility(View.VISIBLE);
                } else {
                    ImageView imgMustache = findViewById(R.id.imageViewMustache);
                    imgMustache.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBoxNose:
                if (checked) {
                    ImageView imgNose = findViewById(R.id.imageViewNose);
                    imgNose.setVisibility(View.VISIBLE);
                } else {
                    ImageView imgNose = findViewById(R.id.imageViewNose);
                    imgNose.setVisibility(View.INVISIBLE);
                }
                break;
            case R.id.checkBoxShoes:
                if (checked) {
                    ImageView imgShoes = findViewById(R.id.imageViewShoes);
                    imgShoes.setVisibility(View.VISIBLE);
                } else {
                    ImageView imgShoes = findViewById(R.id.imageViewShoes);
                    imgShoes.setVisibility(View.INVISIBLE);
                }
                break;
        }
    }
}