package com.example.animedrip;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseAppLifecycleListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegistrationActivity extends AppCompatActivity {
EditText name,email,password,repassword;
private FirebaseAuth auth;
private ProgressBar progressBar2;
Button signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        auth = FirebaseAuth.getInstance();

        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        repassword = findViewById(R.id.repassword);
        signup = findViewById(R.id.signupbtn);
        progressBar2=findViewById(R.id.progressBar2);

    }

public void signup(View view){
        String userName = name.getText().toString();
    String userEmail = email.getText().toString();
    String userPassword = password.getText().toString();
    String userrePassword = repassword.getText().toString();
        if (TextUtils.isEmpty(userName)){
            Toast.makeText(this, "Enter Name!", Toast.LENGTH_SHORT).show();
            return;
        }
    if (TextUtils.isEmpty(userEmail)){
        Toast.makeText(this, "Enter Email Address!", Toast.LENGTH_SHORT).show();
        return;
    }
    if (TextUtils.isEmpty(userPassword)){
        Toast.makeText(this, "Enter Password!", Toast.LENGTH_SHORT).show();
        return;
    }
    if (userPassword.length()< 6 ){
        Toast.makeText(this, "Password too short,Enter minimum 6 characters!", Toast.LENGTH_SHORT).show();
        return;
    }
    if (userPassword.length()> 12 ){
        Toast.makeText(this, "Password too long!", Toast.LENGTH_SHORT).show();
        return;
    }
    if (!userrePassword.equals(userPassword)){
        Toast.makeText(this, "Check The ReEntered Password Correctly!", Toast.LENGTH_SHORT).show();
        return;
    }
    progressBar2.setVisibility(View.VISIBLE);
    auth.createUserWithEmailAndPassword(userEmail,userPassword)
            .addOnCompleteListener(RegistrationActivity.this,new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful())
                    {
                        startActivity(new Intent(RegistrationActivity.this,MainActivity.class));
                        Toast.makeText(RegistrationActivity.this, "Successfully Registered", Toast.LENGTH_SHORT).show();


                    }
                    else
                    {
                        Toast.makeText(RegistrationActivity.this, "Registration Failed", Toast.LENGTH_LONG).show();
                        progressBar2.setVisibility(View.INVISIBLE);
                        finish();
                    }
                }
            });

}

public void signin(View view){
    startActivity(new Intent(RegistrationActivity.this,LoginActivity.class));
}
}