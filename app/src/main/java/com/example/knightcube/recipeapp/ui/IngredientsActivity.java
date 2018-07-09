package com.example.knightcube.recipeapp.ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.knightcube.recipeapp.R;
import com.example.knightcube.recipeapp.adapter.IngredientsAdapter;
import com.example.knightcube.recipeapp.models.Recipe;
import com.google.gson.Gson;

public class IngredientsActivity extends AppCompatActivity {

//    RecyclerView recipeIngredientsRV;
//
//    TextView selectedRecipe;
//    Button startCookingBtn;
//
//    FloatingActionButton addToWidgetBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_details);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        selectedRecipe.setText(getSelectedRecipe().getName());
//        setupMVP();
//        getIngredients();
    }

//    private void getIngredients() {
//        recipeDetailsPresenter.getRecipeIngredients();
//    }
//
//    private Recipe getSelectedRecipe() {
//        Bundle data = getIntent().getExtras();
//        Recipe recipe = null;
//        if (data != null) {
//            recipe = data.getParcelable("recipe");
//        }
//        return recipe;
//    }
//
//    void openDetails() {
//        Intent intent = new Intent(IngredientsActivity.this, StepListActivity.class);
//        intent.putExtra("selected_recipe", getSelectedRecipe());
//        startActivity(intent);
//    }
//
//    private void setupMVP() {
//        recipeDetailsPresenter = new IngredientsPresenter(IngredientsActivity.this, getSelectedRecipe());
//    }
//
//    public void displayRecipesIngredients(Recipe recipe) {
//        if (recipe.getIngredients() != null) {
//            IngredientsAdapter ingredientsAdapter = new IngredientsAdapter(recipe.getIngredients(), this);
//            recipeIngredientsRV.setLayoutManager(new LinearLayoutManager(this));
//            recipeIngredientsRV.setAdapter(ingredientsAdapter);
//        } else {
//            showToast("No ingredients to display");
//        }
//    }
//
//    public void displayError(String e) {
//        showToast(e);
//    }
//
//    public void showToast(String str) {
//        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
//    }
//
//    public void displaySelectedRecipe() {
//
//    }

}
