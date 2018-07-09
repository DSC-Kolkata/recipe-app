package com.example.knightcube.recipeapp.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import com.example.knightcube.recipeapp.R;
import com.example.knightcube.recipeapp.adapter.StepsAdapter;
import com.example.knightcube.recipeapp.models.Recipe;


public class StepListActivity extends AppCompatActivity {

//    RecyclerView recipeStepsRV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step_list);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setTitle(getTitle());
//        recipeStepsRV = findViewById(R.id.step_list_rv);
//        setupRecyclerView();
//        getSteps();
    }

//    private void setupRecyclerView() {
//        StepsAdapter stepsAdapter = new StepsAdapter(getSelectedRecipe().getSteps(), StepListActivity.this);
//        recipeStepsRV.setAdapter(stepsAdapter);
//    }


//    public void displayRecipeSteps(Recipe recipe) {
//        if (recipe.getIngredients() != null) {
//            StepsAdapter stepsAdapter = new StepsAdapter(recipe.getSteps(), this);
//            recipeStepsRV.setLayoutManager(new LinearLayoutManager(this));
//            recipeStepsRV.setAdapter(stepsAdapter);
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
//    private void getSteps() {
//        stepsListPresenter.getRecipeSteps();
//    }
//
//    private Recipe getSelectedRecipe() {
//        Bundle data = getIntent().getExtras();
//        return (Recipe) data.getParcelable("selected_recipe");
//    }
//
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
