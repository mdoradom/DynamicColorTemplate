package com.example.mario;

import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.palette.graphics.Palette;

import com.google.android.material.color.DynamicColors;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Executable;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.Inflater;

public class YourApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Aplica los colores dinamicos a toda la aplicación
        DynamicColors.applyToActivitiesIfAvailable(this);
    }
}