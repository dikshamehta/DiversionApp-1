package org.upesacm.diversionapp.questions;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.upesacm.diversionapp.R;

import fr.tvbarthel.lib.blurdialogfragment.SupportBlurDialogFragment;

public class Question72 extends SupportBlurDialogFragment {
    Question72Callback question72Callback;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.text_type, container, false);
        view.findViewById(R.id.submit).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                question72Callback.question72();
                dismiss();
            }
        });
        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
         question72Callback=(Question72Callback)context;
    }
    public interface Question72Callback{
        public void question72();
    }
}
