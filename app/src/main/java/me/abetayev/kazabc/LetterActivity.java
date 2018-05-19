package me.abetayev.kazabc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

public class LetterActivity extends AppCompatActivity {
    private static final String TAG = "LetterActivity";

    ImageView letter;
    ImageView image1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letter);

        letter = findViewById(R.id.letterInLetterActivity);
        image1 = findViewById(R.id.imgInLetterActivity);
        Intent intentExtras = getIntent();
        Bundle bundleExtras = intentExtras.getExtras();
        int imageId = bundleExtras.getInt("letter_image");
        int pictureId = bundleExtras.getInt("letter_picture");
        letter.setImageResource(imageId);
        image1.setImageResource(pictureId);
    }
}
