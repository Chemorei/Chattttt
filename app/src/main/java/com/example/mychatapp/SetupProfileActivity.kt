package com.example.mychatapp

import android.app.ProgressDialog
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.mychatapp.databinding.ActivityOtpactivityBinding
import com.example.mychatapp.databinding.ActivitySetupProfileBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.storage.FirebaseStorage

class SetupProfileActivity : AppCompatActivity() {

    var binding:ActivitySetupProfileBinding? =null
    var auth:FirebaseAuth? = null
    var database:FirebaseDatabase? =null
    var storage:FirebaseStorage? = null
    var selectedImage:Uri? =null
    var dialog:ProgressDialog? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySetupProfileBinding.inflate(layoutInflater)
        setContentView(binding!!.root)
        dialog!!.setMessage("Updating Profile")
        dialog!!.setCancelable(false)
        database = FirebaseDatabase.getInstance()
        storage = FirebaseStorage.getInstance()
        auth = FirebaseAuth.getInstance()
        supportActionBar?.hide()
        binding!!.imageView.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.Action
        }
    }
}