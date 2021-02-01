package com.hilali.finalproject.ui.userDetails;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.hilali.finalproject.R;

public class UserProfileFragment extends Fragment {


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_user_profile, container, false);
        final TextView textView = root.findViewById(R.id.text_user_post_list);
        textView.setText("This is user profile fragment");
        return root;
    }
}