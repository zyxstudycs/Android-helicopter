package com.example.zhengyixing.myfinal;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class Music_choice extends AppCompatActivity {

    private Button music1, music2, music3;
    MyOnClickListener myOnClickListener = new MyOnClickListener();
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_choice);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Source.setBackMusic(this);

                    music1 = (Button) findViewById(R.id.music1);
                    music2 = (Button) findViewById(R.id.music2);
                    music3 = (Button) findViewById(R.id.music3);

                    music1.setOnClickListener(myOnClickListener);
                    music2.setOnClickListener(myOnClickListener);
                    music3.setOnClickListener(myOnClickListener);

                    // ATTENTION: This was auto-generated to implement the App Indexing API.
                    // See https://g.co/AppIndexing/AndroidStudio for more information.
                    client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
            }

            /**
             * ATTENTION: This was auto-generated to implement the App Indexing API.
             * See https://g.co/AppIndexing/AndroidStudio for more information.
             */
        public Action getIndexApiAction() {
            Thing object = new Thing.Builder()
                    .setName("Music_choice Page") // TODO: Define a title for the content shown.
                    // TODO: Make sure this auto-generated URL is correct.
                    .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                    .build();
            return new Action.Builder(Action.TYPE_VIEW)
                    .setObject(object)
                    .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                    .build();
        }

        @Override
        public void onStart() {
            super.onStart();

            // ATTENTION: This was auto-generated to implement the App Indexing API.
            // See https://g.co/AppIndexing/AndroidStudio for more information.
            client.connect();
            AppIndex.AppIndexApi.start(client, getIndexApiAction());
        }

        @Override
        public void onStop() {
            super.onStop();

            // ATTENTION: This was auto-generated to implement the App Indexing API.
            // See https://g.co/AppIndexing/AndroidStudio for more information.
            AppIndex.AppIndexApi.end(client, getIndexApiAction());
            client.disconnect();
        }



        private class MyOnClickListener implements View.OnClickListener {

            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.music1:
                        if(Source.isMusic2Playing()){
                            Source.stopBackMusic2();

                        }
                        if(Source.isMusic3Playing()){
                            Source.stopBackMusic3();

                        }
                        Source.playBackMusic1();
                        break;
                    case R.id.music2:
                        if(Source.isMusic1Playing()){
                            Source.stopBackMusic1();

                        }
                        if(Source.isMusic3Playing()){
                            Source.stopBackMusic3();

                        }
                        Source.playBackMusic2();
                        break;
                    case R.id.music3:
                        if(Source.isMusic2Playing()){
                            Source.stopBackMusic2();

                        }
                        if(Source.isMusic1Playing()){
                            Source.stopBackMusic1();

                        }
                        Source.playBackMusic3();
                        break;

                }
        }
    }


}
