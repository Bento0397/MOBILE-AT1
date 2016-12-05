package com.example.bento.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    public void sair(View View) {
        System.exit(0);
    }

    public void menu (View View) {
        setContentView(R.layout.activity_main);
    }

    public void tela2(View View) {
        setContentView(R.layout.tela2);
    }

    public void petunias (View View) {
        setContentView(R.layout.tela_petunia);
    }

    public void petunia(View View) {
        Toast.makeText(this, "Ah, não, outra vez!", Toast.LENGTH_SHORT).show();
    }

    public void baleia(View View) {
        setContentView(R.layout.tela_baleia);
    }

    public void gritar (View View) {
        Toast.makeText(this, "AAAhh!", Toast.LENGTH_SHORT).show();
    }

    public void questionar1(View View) {
        setContentView(R.layout.tela_questionar1);
    }

    public void quemSouEu (View View) {
        Toast.makeText(this, "Qual minha razão de ser?", Toast.LENGTH_SHORT).show();
    }

    public void baleia2 (View View) {
        setContentView(R.layout.tela_questionar2);
    }

    public void barriga (View View) {
        Toast.makeText(this, "Vou chamar de barriga!!", Toast.LENGTH_LONG).show();
    }

    public void questionar3 (View View) {
        setContentView(R.layout.tela_questionar3);
    }

    public void vento (View View) {
        Toast.makeText(this, "Vou chamar de vento!!", Toast.LENGTH_LONG).show();
    }

    public void chao1 (View View) {
        setContentView(R.layout.tela_chao1);
    }

    public void chao2 (View View) {
        Toast.makeText(this, "Vou chamar de CHÃO!!", Toast.LENGTH_LONG).show();
    }

    public void ploft (View View) {
        setContentView(R.layout.tela_chao2);
    }

    public void link (View View) {
        setContentView(R.layout.tela_link);
    }

    public void video (View View) {
        String url = "https://youtu.be/xtPq6F_MUEo";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.bento.myapplication/http/host/path")
        );
        AppIndex.AppIndexApi.start(client, viewAction);
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        Action viewAction = Action.newAction(
                Action.TYPE_VIEW, // TODO: choose an action type.
                "Main Page", // TODO: Define a title for the content shown.
                // TODO: If you have web page content that matches this app activity's content,
                // make sure this auto-generated web page URL is correct.
                // Otherwise, set the URL to null.
                Uri.parse("http://host/path"),
                // TODO: Make sure this auto-generated app URL is correct.
                Uri.parse("android-app://com.example.bento.myapplication/http/host/path")
        );
        AppIndex.AppIndexApi.end(client, viewAction);
        client.disconnect();
    }
}