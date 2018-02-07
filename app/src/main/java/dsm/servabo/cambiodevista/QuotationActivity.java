package dsm.servabo.cambiodevista;


import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;


public class QuotationActivity extends AppCompatActivity {

    ImageButton imageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quotation);


        imageButton = (ImageButton) findViewById(R.id.imageButton);

        imageButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Toast.makeText(QuotationActivity.this,
                        "ImageButton is clicked!", Toast.LENGTH_SHORT).show();
               //TextView txtCita = findViewById(R.id.txtCitaHello);
                //txtCita.setText("sample quotation");

            }

        });
    }
}
