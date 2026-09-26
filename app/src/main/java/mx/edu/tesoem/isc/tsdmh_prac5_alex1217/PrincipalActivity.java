package mx.edu.tesoem.isc.tsdmh_prac5_alex1217;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class PrincipalActivity extends AppCompatActivity {

    EditText txtNombre, txtEdad, txtCorrep;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        txtNombre = findViewById(R.id.txtNombre);
        txtEdad = findViewById(R.id.txtEdad);
        txtCorrep = findViewById(R.id.txtCorrep);
        button = findViewById(R.id.button);

        button.setOnClickListener(v -> {

            String nombre = txtNombre.getText().toString();
            String edad = txtEdad.getText().toString();
            String correo = txtCorrep.getText().toString();

            Intent intent = new Intent(
                    PrincipalActivity.this,
                    RecibeActivity.class
            );

            intent.putExtra("nombre", nombre);
            intent.putExtra("edad", edad);
            intent.putExtra("correo", correo);

            startActivity(intent);
        });
    }
}