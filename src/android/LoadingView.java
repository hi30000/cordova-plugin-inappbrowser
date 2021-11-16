package org.apache.cordova.inappbrowser;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import capacitor.android.plugins.R;


public class LoadingView extends FrameLayout {


  public LoadingView(@NonNull Context context, @Nullable AttributeSet attrs) {
    super(context, attrs);

    String service = Context.LAYOUT_INFLATER_SERVICE;
    LayoutInflater li = (LayoutInflater) context.getSystemService(service);
    li.inflate(R.layout.view_loading, this, true);
  }
}


