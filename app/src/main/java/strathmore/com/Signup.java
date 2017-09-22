package strathmore.com;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import strathmore.com.winniemutanu.R;

public class Signup extends AppCompatActivity {
    EditText Firstname;
    EditText Lastname;
    EditText Email;
    EditText Password;
    EditText Phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Firstname = (EditText) findViewById(R.id.Firstname);
        Lastname = (EditText) findViewById(R.id.Lastname);
        Email = (EditText) findViewById(R.id.Email);
        Password = (EditText) findViewById(R.id.Password);
        Phone = (EditText) findViewById(R.id.Phone);

        Button signupButton = (Button) findViewById(R.id.Create);
        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signup = new Intent(Signup.this,Home.class);
                signup.putExtra("Firstname",Firstname.getText().toString());
                startActivity(signup);
            }
        });
    }

}
