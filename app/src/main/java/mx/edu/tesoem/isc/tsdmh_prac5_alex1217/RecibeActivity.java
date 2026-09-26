package mx.edu.tesoem.isc.tsdmh_prac5_alex1217;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RecibeActivity extends AppCompatActivity {

    TextView textView7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recibe);

        textView7 = findViewById(R.id.textView7);

        String nombre = getIntent().getStringExtra("nombre");
        String edad = getIntent().getStringExtra("edad");
        String correo = getIntent().getStringExtra("correo");

        String datos = "Nombre: " + nombre
                + "\n\nEdad: " + edad
                + "\n\nCorreo: " + correo;

        textView7.setText(datos);
    }
}