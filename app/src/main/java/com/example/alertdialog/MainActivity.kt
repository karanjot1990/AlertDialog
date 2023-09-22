package com.example.alertdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import com.example.alertdialog.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var btnAlertDialog:Button
    lateinit var binding:ActivityMainBinding
    var i=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding= ActivityMainBinding.inflate(layoutInflater)
       // btnAlertDialog=findViewById(R.id.btnAlertDialog)
        setContentView(binding.root)
        binding.btnAlertDialog.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Delete")
                .setMessage("You want to delete it?")
                .setCancelable(false)
                .setPositiveButton("Yes"){_,_->
                  i++
                    binding.tvNumber.setText(i.toString())
                }
                .setNegativeButton("No"){_,_->

                }
                .setNeutralButton("Reset"){_,_-> }
                .show()
        }
    }
}