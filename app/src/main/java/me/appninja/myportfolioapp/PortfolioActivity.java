package me.appninja.myportfolioapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class PortfolioActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_portfolio, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
public void showSpotify(View view){
    Toast.makeText(this,"This button will Launch Spotify Streamer",Toast.LENGTH_LONG).show();

}

    public void showScores(View view){
        Toast.makeText(this,"This button will Launch Scores App",Toast.LENGTH_LONG).show();

    }
    public void showLibrary(View view){
        Toast.makeText(this,"This button will Launch Library App",Toast.LENGTH_LONG).show();

    }
    public void showBigger(View view){
        Toast.makeText(this,"This button will Launch Build It Bigger",Toast.LENGTH_LONG).show();

    }
    public void showReader(View view){
        Toast.makeText(this,"This button will Launch XYZ READER",Toast.LENGTH_LONG).show();

    }
    public void  showMyOwn(View view){
        Toast.makeText(this,"This button will Launch my capstone app",Toast.LENGTH_LONG).show();

    }


}
