package testing.gps_service;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by mac on 5/31/18.
 */

public class Login extends AppCompatActivity {

    private Button login;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.code_login);

        login = (Button) findViewById(R.id.login);
        login.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setContentView(R.layout.activity_main);

            }
        }));

    }


}
