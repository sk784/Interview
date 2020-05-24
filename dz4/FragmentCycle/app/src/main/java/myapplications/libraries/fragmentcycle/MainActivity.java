package myapplications.libraries.fragmentcycle;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String TAG = "[CycleFragment]";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        makeMessage("onCreate()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        makeMessage("onStart()");
    }


    @Override
    protected void onResume() {
        super.onResume();
        makeMessage("onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        makeMessage("onPause()");
    }


    @Override
    protected void onStop() {
        super.onStop();
        makeMessage("onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        makeMessage("onRestart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        makeMessage("onDestroy()");
    }


    private void makeMessage(String message){
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
        Log.i(TAG, message);
    }
}
