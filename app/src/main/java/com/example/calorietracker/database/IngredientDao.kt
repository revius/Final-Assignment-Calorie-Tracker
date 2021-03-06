package com.example.calorietracker.database

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.calorietracker.model.Ingredient

@Dao
interface IngredientDao {

    @Query("SELECT * FROM ingredientTable")
    fun getAllIngredients(): LiveData<List<Ingredient>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertIngredient(ingredient: Ingredient)

    @Update
    fun updateIngredient(ingredient: Ingredient)

    @Delete
    suspend fun deleteIngredient(ingredient: Ingredient)

    @Query("DELETE FROM ingredientTable")
    suspend fun deleteAllIngredients()


}