package dsm.servabo.cambiodevista;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button botonCitas = findViewById(R.id.btnCitas);
        botonCitas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),QuotationActivity.class);
                startActivity(intent);
            }
        });
        Button botonFav = findViewById(R.id.btnFav);
        botonFav.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),FavouriteActivity.class);
                startActivity(intent);
            }
        });
        Button botonConf = findViewById(R.id.btnConf);
        botonConf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),settingsActivity.class);
                startActivity(intent);
            }
        });
        Button botonInfo = findViewById(R.id.btnInfo);
        botonInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),About.class);
                startActivity(intent);
            }
        });
    }

}
