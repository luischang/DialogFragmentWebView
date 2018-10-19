package pe.com.moviles.semana09_dialogwv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LoginActivity extends AppCompatActivity {
    private Button btnIniciar;
    private EditText txtUsuario;
    private EditText txtClave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnIniciar = (Button) findViewById(R.id.btnIniciar);
        txtUsuario = (EditText) findViewById(R.id.txtUsuario);
        txtClave = (EditText) findViewById(R.id.txtClave);


        btnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (validar()) {
                    Toast.makeText(getApplicationContext(), "Password Valido", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), PrincipalActivity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), "ERRORRRRR", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

//            (? =. * [0-9]) un dígito debe aparecer al menos una vez
//            (? =. * [a-z]) una letra minúscula debe aparecer al menos una vez
//            (? =. * [A-Z]) una letra mayúscula debe aparecer al menos una vez
//            (? =. * [@ # $% ^ & + =]) un carácter especial debe aparecer al menos una vez
//            (? = \\ S + $) no se permiten espacios en blanco en toda la cadena
//            {8,} al menos 8 caracteres

    public static boolean isValidPassword(final String password) {

        Pattern pattern;
        Matcher matcher;
        final String PASSWORD_PATTERN = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";
        pattern = Pattern.compile(PASSWORD_PATTERN);
        matcher = pattern.matcher(password);

        return matcher.matches();
    }


    private boolean validar() {
        boolean exito = false;

        if (txtUsuario.getText().length() >= 7 && txtUsuario.getText().length() <= 8) {
            if (txtClave.getText().length() >= 8 && isValidPassword(txtClave.getText().toString())) {
                exito = true;
            }
        }
        return exito;
    }


}
