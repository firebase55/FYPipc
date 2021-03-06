package com.example.fypipc.chatClasspackeg;

import android.app.Activity;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.TextView;

import com.example.fypipc.R;
import com.firebase.ui.database.FirebaseListAdapter;
import com.google.firebase.FirebaseAppLifecycleListener;
import com.google.firebase.database.Query;


public class MessageClass extends FirebaseListAdapter<chatClass>
{
    private chatMainActivity activity=null;
    public MessageClass(Activity activity, Class<chatClass> modelClass, int modelLayout, Query ref) {
        super(activity, modelClass, modelLayout, ref);
    }
    @Override
    protected void populateView(View v, chatClass model, int position) {
        TextView messageText = (TextView) v.findViewById(R.id.message_text);
        TextView messageUser = (TextView) v.findViewById(R.id.message_user);
        TextView messageTime = (TextView) v.findViewById(R.id.message_time);
        messageText.setText(model.getMessageText());
        messageUser.setText(model.getMessageUser());

        messageTime.setText(DateFormat.format("dd-MM-yyyy (HH:mm:ss)", model.getMessageTime()));


    }
}
