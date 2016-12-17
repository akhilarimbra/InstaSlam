package me.akhilarimbra.instaslam.model;

import android.net.Uri;

/**
 * Created by akhilraj on 15/12/16.
 */

public class InstaImage {
    public Uri getImageResourceUrl() {
        return imageResourceUrl;
    }

    private Uri imageResourceUrl;

    public InstaImage(Uri imageResourceUrl) {
        this.imageResourceUrl = imageResourceUrl;
    }
}
