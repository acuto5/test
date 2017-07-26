package skirtumas.koks.loginas;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends Activity {

    private EditText username;
    private EditText password;
    private EditText repeat_password;
    private Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        username = (EditText) findViewById(R.id.register_username_id);
        password = (EditText) findViewById(R.id.register_password_id);
        repeat_password = (EditText) findViewById(R.id.register_repeat_password_id);
        register = (Button) findViewById(R.id.register_register_button_id);


        register.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (username.getText().toString() != null && !username.getText().toString().isEmpty() &&
                        password.getText().toString() != null && !password.getText().toString().isEmpty() &&
                        repeat_password.getText().toString() != null && !repeat_password.getText().toString().isEmpty() &&
                        password.getText().toString().equals(repeat_password.getText().toString()))
                {
                    Toast.makeText(RegisterActivity.this, "Sveikinu! " + username.getText().toString() + ", registracija sėkminga. ", Toast.LENGTH_LONG).show();
                    Intent i = new Intent(RegisterActivity.this, LoginActivity.class);
                    startActivity(i);
                }
                else if (username.getText().toString() == null || username.getText().toString().isEmpty())
                {
                    Toast.makeText(RegisterActivity.this, "Neįvedei vartotojo vardo!", Toast.LENGTH_SHORT).show();
                }
                else if (password.getText().toString() == null || password.getText().toString().isEmpty())
                {
                    Toast.makeText(RegisterActivity.this, "Neįvedei slaptažodžio!", Toast.LENGTH_SHORT).show();
                }
                else if (repeat_password.getText().toString() == null || repeat_password.getText().toString().isEmpty())
                {
                    Toast.makeText(RegisterActivity.this, "Neįvedei pakartotino slaptažodžio!", Toast.LENGTH_SHORT).show();
                }
                else if (!password.getText().toString().equals(repeat_password.getText().toString()) )
                {
                    Toast.makeText(RegisterActivity.this, "Slaptažodžiai nesutampa!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
