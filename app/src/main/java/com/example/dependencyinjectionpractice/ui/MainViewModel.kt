package com.example.dependencyinjectionpractice.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.dependencyinjectionpractice.data.Dog
import com.example.dependencyinjectionpractice.repo.DogsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 *  Use the @HiltViewModel annotation here, which allows the view model to be created
 *  using Hilt’s view model factory which in turn makes it easier to be used in activities, fragments, etc.

    Exactly one constructor in the view model must be annotated with @Inject. In this constructor,
    this is where you add all the dependencies you need injected in your view model.

    Do note that you can use @Inject constructor in any class where you need dependency injection,
    like our repository class if we needed it, as long as you have the dependency provided in an appropriate module.

    The rest of the class is just a very simple implementation of getting a list of dog breeds from the repository and passing it into the LiveData.
 */
@HiltViewModel
class MainViewModel @Inject constructor(
    private val dogsRepository: DogsRepository
    ):ViewModel(){

    private val dogsBreedsEmitter = MutableLiveData<List<Dog>>()
    val dogBreeds: LiveData<List<Dog>> = dogsBreedsEmitter


    init {
        loadDogBreeds()
    }

    private fun loadDogBreeds() {
        dogsBreedsEmitter.value = dogsRepository.getBreeds()

    }

}