package skirtumas.koks.loginas;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {

    private EditText username;
    private EditText password;
    private Button login;
    private Button register;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username    =   (EditText) findViewById(R.id.login_username_id);
        password    =   (EditText) findViewById(R.id.login_password_id);
        register    =   (Button) findViewById(R.id.login_register_button_id);
        login       =   (Button) findViewById(R.id.login_login_button_id);

        login.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if(username.getText().toString() != null && !username.getText().toString().isEmpty() &&
                        password.getText().toString() != null && !password.getText().toString().isEmpty()   ) {
                    Toast.makeText(LoginActivity.this, username.getText().toString() + ", sėkmingai prisijungei. ", Toast.LENGTH_LONG).show();
                    Intent i = new Intent(LoginActivity.this, SearchActivity.class);
                    startActivity(i);

                }else if(username.getText().toString() == null || username.getText().toString().isEmpty()){
                    Toast.makeText(LoginActivity.this, "Neįvedei vartotojo vardo!", Toast.LENGTH_LONG).show();
                }
                else
                    Toast.makeText(LoginActivity.this, "Neįvedei slaptažodžio.!", Toast.LENGTH_LONG).show();



            }
        });

        register.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                    Intent i = new Intent(LoginActivity.this, RegisterActivity.class);
                    startActivity(i);



            }
        });

    }
}
