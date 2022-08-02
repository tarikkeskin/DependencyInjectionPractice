package com.example.dependencyinjectionpractice.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.dependencyinjectionpractice.R
import dagger.hilt.android.AndroidEntryPoint

/**
 * Finally, we have our activity.
 * It’s important that we annotate with @AndroidEntryPoint which marks the Android component class to be setup for injection.
 * This annotation can be used on most Android components including activities, fragments, views, services, and broadcast receivers.

    We get our view model using the by viewModels() delegate. Then the rest is just observing our live data.
 */
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        observeDogBreeds()
    }

    private fun observeDogBreeds() {
        viewModel.dogBreeds.observe(this){
            //TODO

        }
    }
}