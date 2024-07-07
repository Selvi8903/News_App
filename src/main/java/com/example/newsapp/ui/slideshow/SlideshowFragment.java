package com.example.newsapp.ui.slideshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.Observer; // Add this import

import com.example.newsapp.R;
import com.example.newsapp.WebViewController;
import com.example.newsapp.databinding.FragmentSlideshowBinding;

public class SlideshowFragment extends Fragment {

    private SlideshowViewModel slideshowViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        slideshowViewModel =
                new ViewModelProvider(this).get(SlideshowViewModel.class); // Use ViewModelProvider

        View root = inflater.inflate(R.layout.fragment_slideshow, container, false);
        WebView webview = root.findViewById(R.id.webViewCNN);
        webview.loadUrl("https://edition.cnn.com/");
        webview.setWebViewClient(new WebViewController());

        return root;
    }
}
