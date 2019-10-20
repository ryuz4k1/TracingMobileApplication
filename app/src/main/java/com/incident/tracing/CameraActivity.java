package com.incident.tracing;

import android.Manifest;
import android.content.Intent;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;


public class CameraActivity extends AppCompatActivity {
    FrameLayout myFrame;
    Button btnPicture,btnPicture1,btnPicture2;
    ImageView mImageView,mImageView1,mImageView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {
        myFrame = (FrameLayout) findViewById(R.id.myFrame);
        btnPicture = (Button) findViewById(R.id.button1);
        btnPicture1 = (Button) findViewById(R.id.button2);
        btnPicture2 = (Button) findViewById(R.id.button3);
        mImageView = (ImageView) findViewById(R.id.image1);
        mImageView1 = (ImageView)findViewById(R.id.image2);
        mImageView2 = (ImageView) findViewById(R.id.image3);


        ActivityCompat.requestPermissions(CameraActivity.this,
                new String[]{Manifest.permission.CAMERA},
                1);
        ActivityCompat.requestPermissions(CameraActivity.this,
                new String[]{Manifest.permission.CAMERA},
                2);
        ActivityCompat.requestPermissions(CameraActivity.this,
                new String[]{Manifest.permission.CAMERA},
                3);
    }



    static final int REQUEST_IMAGE_CAPTURE = 1;
    static final int REQUEST_IMAGE_CAPTURE2 = 2;
    static final int REQUEST_IMAGE_CAPTURE3 = 3;

    private void dispatchTakePictureIntent() {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        }
    }
    private void dispatchTakePictureIntent1() {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE2);
        }
    }
    private void dispatchTakePictureIntent2() {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE3);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == REQUEST_IMAGE_CAPTURE){
            if(resultCode == RESULT_OK )
            {
                Bundle extras = data.getExtras();
                Bitmap imageBitmap = (Bitmap) extras.get("data");
                mImageView.setImageBitmap(imageBitmap);
            }
            else if (resultCode == RESULT_CANCELED) {
                // user cancelled Image capture
                Toast.makeText(getApplicationContext(),
                        "User cancelled image capture", Toast.LENGTH_SHORT).show();
            }
            else
                // failed to capture image
                Toast.makeText(getApplicationContext(),
                        "Sorry! Failed to capture image", Toast.LENGTH_SHORT).show();
        }
        else if (requestCode == REQUEST_IMAGE_CAPTURE2) {

            if(resultCode == RESULT_OK )
            {
                Bundle extras1 = data.getExtras();
                Bitmap imageBitmap1 = (Bitmap) extras1.get("data1");
                mImageView1.setImageBitmap(imageBitmap1);
            }
            else if (resultCode == RESULT_CANCELED) {
                // user cancelled Image capture
                Toast.makeText(getApplicationContext(),
                        "User cancelled image capture", Toast.LENGTH_SHORT).show();
            }
            else
                // failed to capture image
                Toast.makeText(getApplicationContext(),
                        "Sorry! Failed to capture image", Toast.LENGTH_SHORT).show();
        }

        else if (requestCode == REQUEST_IMAGE_CAPTURE3){
            if(resultCode == RESULT_OK )
            {
                Bundle extras2 = data.getExtras();
                Bitmap imageBitmap2 = (Bitmap) extras2.get("data2");
                mImageView2.setImageBitmap(imageBitmap2);
            }
            else if (resultCode == RESULT_CANCELED) {
                // user cancelled Image capture
                Toast.makeText(getApplicationContext(),
                        "User cancelled image capture", Toast.LENGTH_SHORT).show();
            }
            else
                // failed to capture image
                Toast.makeText(getApplicationContext(),
                        "Sorry! Failed to capture image", Toast.LENGTH_SHORT).show();
        }

    }





    public void btnPicture_click1(View view) {
        dispatchTakePictureIntent();
    }
    public void btnPicture_click2(View view) {
        dispatchTakePictureIntent1();
    }
    public void btnPicture_click3(View view) {
        dispatchTakePictureIntent2();
    }
}
