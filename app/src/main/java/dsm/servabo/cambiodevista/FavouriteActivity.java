package dsm.servabo.cambiodevista;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static dsm.servabo.cambiodevista.R.id.bntAutorInfo;

public class FavouriteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourite);

        Button botonAutor = findViewById(bntAutorInfo);
        botonAutor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://en.wikipedia.org/wiki/Special:Search?search=Albert_Einstein"));
                startActivity(intent);
            }
        });

    }
}
