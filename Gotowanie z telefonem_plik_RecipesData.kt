package com.example.gotowanieztelefonem4

data class Step(val description: String, val timeInSeconds: Int)

data class Recipe(
    val name: String,
    val isVegan: Boolean,
    val ingredients: String,
    val time: String,
    val tags: List<String>,
    val steps: List<Step>
)

object RecipesData {
    val recipes = listOf(
        Recipe(
            name = "Risotto",
            isVegan = false,
            ingredients = "ryż arborio, bulion warzywny, cebula, czosnek, parmezan, białe wino",
            time = "35 minut",
            tags = listOf("Włoskie", "Kolacja"),
            steps = listOf(
                Step("Na patelni podsmaż cebulę i czosnek.", 180),
                Step("Dodaj ryż i smaż przez 2 minuty.", 120),
                Step("Dodaj wino i gotuj aż wyparuje (ok. 3 minuty).", 180),
                Step("Stopniowo dodawaj bulion, mieszając i gotując przez 20 minut.", 1200),
                Step("Dodaj parmezan i dopraw do smaku.", 0)
            )
        ),
        Recipe(
            name = "Spaghetti Bolognese",
            isVegan = false,
            ingredients = "makaron, mięso mielone, cebula, czosnek, pomidory, przyprawy",
            time = "40 minut",
            tags = listOf("Włoskie", "Mięsne"),
            steps = listOf(
                Step("Podsmaż cebulę i czosnek.", 180),
                Step("Dodaj mięso mielone i smaż do zarumienienia (ok. 7 minut).", 420),
                Step("Dodaj pomidory i gotuj na wolnym ogniu przez 20 minut.", 1200),
                Step("Ugotuj makaron al dente (ok. 8 minut).", 480),
                Step("Wymieszaj sos z makaronem i podawaj.", 0)
            )
        ),
        Recipe(
            name = "Sałatka Grecka",
            isVegan = true,
            ingredients = "pomidor, ogórek, czerwona cebula, oliwki, feta, oliwa z oliwek",
            time = "10 minut",
            tags = listOf("Greckie", "Sałatka"),
            steps = listOf(
                Step("Pokrój warzywa.", 0),
                Step("Dodaj ser feta i oliwki.", 0),
                Step("Polej oliwą z oliwek i dopraw do smaku.", 0)
            )
        ),
        Recipe(
            name = "Pizza Margherita",
            isVegan = false,
            ingredients = "ciasto do pizzy, sos pomidorowy, mozzarella, bazylia",
            time = "25 minut",
            tags = listOf("Włoskie", "Pieczone"),
            steps = listOf(
                Step("Rozwałkuj ciasto i rozsmaruj sos pomidorowy.", 0),
                Step("Dodaj mozzarellę i bazylię.", 0),
                Step("Piecz w piekarniku w 220°C przez 12 minut.", 720)
            )
        ),
        Recipe(
            name = "Zupa Pomidorowa",
            isVegan = true,
            ingredients = "pomidory, cebula, czosnek, bulion warzywny, przyprawy",
            time = "30 minut",
            tags = listOf("Zupa", "Wege"),
            steps = listOf(
                Step("Podsmaż cebulę i czosnek.", 180),
                Step("Dodaj pomidory i bulion.", 0),
                Step("Gotuj przez 20 minut.", 1200),
                Step("Zblenduj i dopraw do smaku.", 0)
            )
        ),
        Recipe(
            name = "Tacos",
            isVegan = false,
            ingredients = "tortille, mięso, sałata, pomidor, ser, sos",
            time = "20 minut",
            tags = listOf("Meksykańskie", "Szybkie"),
            steps = listOf(
                Step("Podsmaż mięso z przyprawami (ok. 8 minut).", 480),
                Step("Pokrój warzywa.", 0),
                Step("Nałóż składniki na tortillę i podawaj.", 0)
            )
        ),
        Recipe(
            name = "Pierogi z Kapustą",
            isVegan = true,
            ingredients = "ciasto pierogowe, kapusta kiszona, cebula, przyprawy",
            time = "60 minut",
            tags = listOf("Polskie", "Tradycyjne"),
            steps = listOf(
                Step("Podsmaż cebulę i dodaj kapustę, gotuj przez 15 minut.", 900),
                Step("Przygotuj ciasto i rozwałkuj.", 0),
                Step("Nadziewaj pierogi farszem i zlepiaj brzegi.", 0),
                Step("Gotuj pierogi w osolonej wodzie przez 5 minut.", 300)
            )
        )
    )
}
