package myapplications.libraries.fragmentcycle;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class Fragment2 extends Fragment{
    final String TAG = "[CycleFragment]";

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(TAG, "Fragment2 onCreate");
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.i(TAG, "Fragment2 onCreateView");
        return inflater.inflate(R.layout.fragment2, null) ;
    }

    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i(TAG, "Fragment2 onActivityCreated");
    }

    public void onStart() {
        super.onStart();
        Log.i(TAG, "Fragment2 onStart");
    }

    public void onResume() {
        super.onResume();
        Log.i(TAG, "Fragment2 onResume");
    }

    public void onPause() {
        super.onPause();
        Log.i(TAG, "Fragment2 onPause");
    }

    public void onStop() {
        super.onStop();
        Log.i(TAG, "Fragment2 onStop");
    }

    public void onDestroyView() {
        super.onDestroyView();
        Log.i(TAG, "Fragment2 onDestroyView");
    }

    public void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "Fragment2 onDestroy");
    }

    public void onDetach() {
        super.onDetach();
        Log.i(TAG, "Fragment2 onDetach");
    }
}
