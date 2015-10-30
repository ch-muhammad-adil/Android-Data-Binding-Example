package com.app.android.databinding.Activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.app.android.databinding.DataModel.User;
import com.app.android.databinding.R;
import com.app.android.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        As we know name of the our XML is activity_main , So here ActivityMainBinding.class will automatically generated.
//        This class holds all the bindings from the layout properties (e.g. the user variable) to the layout’s
//        Views and knows how to assign values for the binding expressions.

//        so we can use this binding class and now there is no use of "setContentView(int id)" method of parent Acitivty
//        setContentView(R.layout.activity_main);
        ActivityMainBinding binding = DataBindingUtil.setContentView(MainActivity.this,R.layout.activity_main);

//        here we create our User
        User user = new User("Adil", "57f Fblock,XYZ Town,Lahore");

//        so far so good now we are going to assign our user to our intelligent XML class. ;)
        binding.setUser(user);

        // your are done! run your project ;)

    }
}
