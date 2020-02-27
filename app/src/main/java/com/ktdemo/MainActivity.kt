package com.ktdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.ktdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var mainBinding : ActivityMainBinding
    var mUserModel = UserModel()
    var counter  : Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        mUserModel.uName = "Hi"
        mUserModel.pwd = "123456"
        mainBinding.userModel = mUserModel
    }

    fun onSave(view: View) {
        counter++;
        mUserModel.uName = Integer.toString (counter ) +" save"
        mainBinding.userModel = mUserModel
    }


}
