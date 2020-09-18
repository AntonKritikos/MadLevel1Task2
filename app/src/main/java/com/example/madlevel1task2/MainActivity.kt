package com.example.madlevel1task2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.madlevel1task2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding;

    private var answers = arrayOf("T","F","F","F")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root);
        binding.button.setOnClickListener{onSubmit()};
    }

    private fun onChange() {

    }

    private fun onSubmit() {
        var count = 0;
        var inputs = arrayOf(binding.editTextTextPersonName5.text.toString(),binding.editTextTextPersonName4.text.toString(),binding.editTextTextPersonName3.text.toString(),binding.editTextTextPersonName2.text.toString());
        for (i in 0 until (inputs.size)) {
            if (inputs[i] != answers[i]) {
                Toast.makeText(this, getString(R.string.incorrect,i), Toast.LENGTH_SHORT).show()
                count++
            }
        }

        if (count == 0) {
            Toast.makeText(this, getString(R.string.correct), Toast.LENGTH_SHORT).show()
        }
    }
}