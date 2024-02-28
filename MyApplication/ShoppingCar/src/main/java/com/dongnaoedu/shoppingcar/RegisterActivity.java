package com.dongnaoedu.shoppingcar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import com.dongnaoedu.shoppingcar.database.DBHelper;

public class RegisterActivity extends AppCompatActivity {

    private EditText editTextRegUsername;
    private EditText editTextRegPassword;
    private EditText editTextConfirmPassword;
    private DBHelper dbHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        editTextRegUsername = findViewById(R.id.ed_name);
        editTextRegPassword = findViewById(R.id.et_pwd);
        editTextConfirmPassword = findViewById(R.id.et_pwd2);
        dbHelper = new DBHelper(this);
    }

    public void onRegisterClick(View view) {
        String regUsername = editTextRegUsername.getText().toString();
        String regPassword = editTextRegPassword.getText().toString();
        String confirmPassword = editTextConfirmPassword.getText().toString();

        if (regUsername.isEmpty() || regPassword.isEmpty() || confirmPassword.isEmpty()) {
            Toast.makeText(this, "用户名、密码和确认密码不能为空", Toast.LENGTH_SHORT).show();
        } else {
            if (regPassword.equals(confirmPassword)) {
                long result = dbHelper.addUser(regUsername, regPassword);
                if (result != -1) {
                    // 注册成功，可以根据需要进行其他操作，比如跳转到登录页面
                    Toast.makeText(this, "注册成功", Toast.LENGTH_SHORT).show();
                    finish();  // 关闭注册界面
                } else {
                    Toast.makeText(this, "注册失败", Toast.LENGTH_SHORT).show();
                }
            } else {
                Toast.makeText(this, "密码不匹配", Toast.LENGTH_SHORT).show();
            }
        }
    }
}