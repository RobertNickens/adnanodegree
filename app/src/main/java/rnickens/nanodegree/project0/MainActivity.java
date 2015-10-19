package rnickens.nanodegree.project0;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /*
    Logging filter TAG
     */
    private static final String TAG = "NANO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Show Toast to the screen
     * @param view
     */
    public void fireToast(View view){
        /*
         * Get prefix and suffix string from resource
         */
        String toast_template_prefix = getResources().getString(R.string.toast_feature_not_implemented_prefix);
        String toast_template_suffix = getResources().getString(R.string.toast_feature_not_implemented_suffix);
        String button_text = ((Button) view).getText().toString();
        // Build string for Toast
        String displayString = toast_template_prefix + " " + button_text + " " + toast_template_suffix;

        Log.i(TAG, String.valueOf(displayString));

        Toast.makeText(MainActivity.this, displayString, Toast.LENGTH_LONG).show();

    }
}
