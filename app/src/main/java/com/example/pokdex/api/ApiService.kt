package com.example.pokdex.api

import com.example.pokdex.model.Pokemon
import com.github.kittinunf.fuel.Fuel
import com.github.kittinunf.fuel.httpGet
import com.github.kittinunf.result.Result
import com.google.gson.Gson

class ApiService() {

    private val baseURL: String = "https://pokeapi.co/api/v2/"
    private val pokemonURL: String = "pokemon/"

    fun getPokemon(pokemonName: String) {
        val getURL = baseURL + pokemonURL + pokemonName

        getURL.httpGet().responseString { request, response, result ->
            when (result) {
                is com.github.kittinunf.result.Result.Failure -> {
                    val ex = result.getException()
                    println(ex)
                }
                is com.github.kittinunf.result.Result.Success -> {
                    val data = result.get()
                    println(data)
                    parseResult(data)
                }
            }
        }
    }

    private fun parseResult(jsonData: String) {
        // Convert to Pokemon object
        val gson = Gson()
        val pokemon = gson.fromJson(jsonData, Pokemon::class.java)


        // Pokemon's name, String
        val name = pokemon.name


        // Image of the Pokemon, String HttpURL
//        val imageURL = pokemon.sprites.frontDefault


        // List of the Pokemon type(s), List<TypesItem>?


        // Weight of the Pokemon, Int


        // Height of the Pokemon, Int

    }
}
