package com.example.dependencyinjectionpractice.repo

import com.example.dependencyinjectionpractice.data.Dog

interface DogsRepository {
    fun getBreeds(): List<Dog>
}