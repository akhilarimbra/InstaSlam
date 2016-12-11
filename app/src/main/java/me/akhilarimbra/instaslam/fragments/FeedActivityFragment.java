package me.akhilarimbra.instaslam.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import me.akhilarimbra.instaslam.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FeedActivityFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FeedActivityFragment extends Fragment {

    public FeedActivityFragment() {
        // Required empty public constructor
    }

    public static FeedActivityFragment newInstance() {
        FeedActivityFragment fragment = new FeedActivityFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_feed_activity, container, false);
    }

}
