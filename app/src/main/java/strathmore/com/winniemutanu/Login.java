package strathmore.com.winniemutanu;

import android.content.Intent;
import android.content.res.ObbInfo;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

import strathmore.com.Home;
import strathmore.com.Signup;

public class Login extends AppCompatActivity {
    EditText Username;
    EditText Password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Username = (EditText) findViewById(R.id.Username);
        Password = (EditText) findViewById(R.id.Password);

        Button loginButton = (Button) findViewById(R.id.Login);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent login = new Intent(Login.this, Home.class);
                login.putExtra("username",Username.getText().toString());
                startActivity(login);
            }
        });
        Button caButton = (Button) findViewById(R.id.Createaccount);
        caButton.setOnClickListener(new View.OnClickListener(){
                                        @Override
                                        public void onClick(View v) {
                                            Intent createAccount = new Intent(Login.this, Signup.class);

                                            startActivity(createAccount);
                                        }
                                    }
        );


    }
}