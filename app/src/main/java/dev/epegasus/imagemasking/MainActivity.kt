package dev.epegasus.imagemasking

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dev.epegasus.imagemasking.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}