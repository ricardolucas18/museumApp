package pi.pt.ipb.estig.museumapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Method btnInitClick - This method it's executed when the user clicks on start button and opens the menu activity.
     * @param view - view.
     */
    public void btnInitClick(View view) {
        this.startActivity(new Intent(MainActivity.this, MenuActivity.class));
    }
}
