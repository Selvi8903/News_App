package com.example.newsapp.ui.gallery;

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
import com.example.newsapp.databinding.FragmentGalleryBinding;

public class GalleryFragment extends Fragment {

    private GalleryViewModel galleryViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel =
                new ViewModelProvider(this).get(GalleryViewModel.class);


        View root = inflater.inflate(R.layout.fragment_gallery,container,false);
        WebView webview = root.findViewById(R.id.webViewAlJazera);
        webview.loadUrl("https://www.aljazeera.com/");
        webview.setWebViewClient(new WebViewController());

        return root;
    }
}
