package com.example.ravneet.gymproject.Activities;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import com.example.ravneet.gymproject.R;

/**
 * Created by HP on 09-08-2017.
 */

public class ContactUs extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contactus);

        View phone=(TextView) findViewById(R.id.phone);
        View email=(TextView) findViewById(R.id.email);

        phone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:0377778888"));
                  final int REQUEST_PHONE_CALL = 1;
                if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    if (ContextCompat.checkSelfPermission(ContactUs.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        ActivityCompat.requestPermissions(ContactUs.this, new String[]{Manifest.permission.CALL_PHONE},REQUEST_PHONE_CALL);
                    }
                    else
                    {
                        startActivity(callIntent);
                    }
                }
                else
                {
                    startActivity(callIntent);
                }


            }
        });

        email.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
//                Intent emailIntent=new Intent(Intent.ACTION_SENDTO);
//                emailIntent.setData(Uri.parse("mailto:"));
//                String to="abcd@xyz.com";
//                emailIntent.putExtra(Intent.EXTRA_EMAIL,to);
//                startActivity(emailIntent);
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                        "mailto","abc@gmail.com", null));
                //emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject");
                //emailIntent.putExtra(Intent.EXTRA_TEXT, "Body");
               // startActivity(Intent.createChooser(emailIntent, "Send email..."));
                startActivity(emailIntent);
            }
        });

    }
}
