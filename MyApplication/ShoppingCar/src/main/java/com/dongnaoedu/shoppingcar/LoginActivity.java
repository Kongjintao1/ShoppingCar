package com.dongnaoedu.shoppingcar;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import com.dongnaoedu.shoppingcar.database.DBHelper;

public class LoginActivity extends AppCompatActivity {

    private EditText editTextUsername;
    private EditText editTextPassword;
    private DBHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTextUsername = findViewById(R.id.account);
        editTextPassword = findViewById(R.id.pwd);
        dbHelper = new DBHelper(this);
    }

    public void onLoginClick(View view) {
        String username = editTextUsername.getText().toString();
        String password = editTextPassword.getText().toString();

        if (dbHelper.checkUser(username, password)) {
            Intent intent = new Intent(this, ShoppingChannelActivity.class);
            startActivity(intent);
            finish();
        } else {
            Toast.makeText(this, "无效的用户名或密码", Toast.LENGTH_SHORT).show();
        }
    }

    public void onRegisterClick(View view) {

        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }
}