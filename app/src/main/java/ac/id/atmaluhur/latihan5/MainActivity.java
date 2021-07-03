package ac.id.atmaluhur.latihan5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    ImageButton btnMakanan;
    ImageButton btnMinuman;
    ImageButton btnOrder;
    ImageButton btnInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnMakanan = findViewById(R.id.makanan);
        btnMinuman = findViewById(R.id.minuman);
        btnOrder = findViewById(R.id.order);
        btnInfo = findViewById(R.id.info);

        btnMakanan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Makanan.class);
                startActivity(i);
            }
        });

        btnMinuman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Minuman.class);
                startActivity(i);
            }
        });

        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Info.class);
                startActivity(i);
            }
        });

        btnOrder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Order.class);
                startActivity(i);
            }
        });
    }

}