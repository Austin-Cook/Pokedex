# Pokédex

## Complete:
- Generate Kotlin Data classes for Pokemon class and all helper classes
- Use fuel.httpGet to retrieve a specific pokemon from the pokeapi
  - Successfully retrieves the Pokemon in JSON format
  - Work needed to correctly parse the JSON into a Pokemon object
- Create a basic Pokedex Home Screen
  - Displays a title, text-box, and button
  - The button calls the ApiService
  - Work needed to correctly route pages

## TODOs
- Fix GSON Pokemon object generation
- Correctly close resources after calling api
- Error message
  - if the Pokemon was not found
  - if there was another connection arror
- Create Pokemon Details Screen
  - Display Pokemon data, including image at the URL contained in the Sprites.frontDefault data member
- Move GSON functionality into seperate service class for abstraction
- Move Composable functions into seperate files for abstraction
- UI improvements - modify views to look like a Pokedex
- Further functionality (save favorite Pokemon, display other attributes, etc...)
