package com.example.pokdex

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
//import androidx.navigation.NavHost
//import androidx.navigation.NavController
//import androidx.navigation.NavHostController
//import androidx.navigation.compose.composable
//import androidx.navigation.compose.rememberSavedInstanceState

import com.example.pokdex.ui.theme.PokédexTheme
import com.example.pokdex.api.ApiService

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PokédexTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    PokedexHomeScreen()
                }
            }
        }
    }
}

//// FIXME
//@Composable
//fun MyNavGraph() {
//    val navController = rememberNavController()
//
//    NavHost(navController = navController, startDestination = "home") {
//        composable(route = "home") {
//            PokedexHomeScreen(navController = navController)
//        }
//        composable(route = "details") {
//            PokemonDetailsScreen(navController = navController)
//        }
//    }
//}

@Composable
fun PokedexHomeScreen() {
    val apiService: ApiService = ApiService()

    var selectedPokemon by remember {
        mutableStateOf("")
    }

    Column(
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier.padding(16.dp)
    ) {
        Text(text = "Pokedex")

        Spacer(modifier = Modifier.height(8.dp))
        Divider()
        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = selectedPokemon,
            onValueChange = { text ->
                selectedPokemon = text
            })

        Spacer(modifier = Modifier.height(2.dp))

        Button(onClick= {
            apiService.getPokemon(selectedPokemon)
        }) {
            Text(text = "Lookup Pokemon!")
        }
    }
}

@Composable
fun PokemonDetailsScreen() {

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PokédexTheme {
        PokedexHomeScreen()
    }
}
