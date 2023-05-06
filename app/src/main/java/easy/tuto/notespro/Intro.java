package easy.tuto.notespro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class Intro extends AppCompatActivity {
    ImageView arrow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_pen_pal);
        arrow = findViewById(R.id.arrow);
        arrow.setOnClickListener((v)-> startActivity(new Intent(Intro.this,LoginActivity.class)));
    }
}