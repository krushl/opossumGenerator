package com.example.opossumgenerator
import android.widget.Button

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import androidx.recyclerview.widget.GridLayoutManager
import com.example.opossumgenerator.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val adapter = OpossumAdapter()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root);
        init()

    }

    private fun init() {
        binding.apply {
            recycler.layoutManager = GridLayoutManager(this@MainActivity, 1)
            recycler.adapter = adapter


            val button: Button = findViewById(R.id.button)
            button.setOnClickListener {
                val generator: Generator = Generator();
                val crowd: MutableList<Opossum> = generator.generateList(1,6);
                for(n in 1..4){
                    adapter.addOpossum(crowd[n])
                }
            }
        }
    }
}