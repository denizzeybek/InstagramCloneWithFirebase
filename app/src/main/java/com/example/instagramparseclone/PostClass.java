package com.example.instagramparseclone;

import android.app.Activity;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class PostClass extends ArrayAdapter<String> {
    // parse dan alınan verileri feed activity içinde postclass ı kullanarak download edicem

    private final ArrayList<String> userName;
    private final ArrayList<String> userComment;
    private final ArrayList<Bitmap> userImage;
    private final Activity context;


    public PostClass(ArrayList<String> username,ArrayList<String> userComment,ArrayList<Bitmap> userImage,Activity context){
        super(context,R.layout.custom_view,username);//hangi layout la birleştireceğimi belirttim
        this.userName=username;
        this.userComment=userComment;
        this.userImage=userImage;
        this.context=context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater=this.context.getLayoutInflater();
        View customView=layoutInflater.inflate(R.layout.custom_view,null,true);
        TextView usernameText=customView.findViewById(R.id.custom_view_username_text);
        TextView commentText=customView.findViewById(R.id.custom_view_comment_text);
        ImageView imageView=customView.findViewById(R.id.custom_view_imageView);

        usernameText.setText(userName.get(position));
        commentText.setText(userComment.get(position));
        imageView.setImageBitmap(userImage.get(position));

        return customView;
    }
}
