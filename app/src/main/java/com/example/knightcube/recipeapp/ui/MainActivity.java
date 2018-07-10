package com.example.knightcube.recipeapp.ui;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.JSONArrayRequestListener;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.example.knightcube.recipeapp.R;
import com.example.knightcube.recipeapp.adapter.RecipeAdapter;
import com.example.knightcube.recipeapp.models.Ingredient;
import com.example.knightcube.recipeapp.models.Recipe;
import com.example.knightcube.recipeapp.models.Step;
import com.example.knightcube.recipeapp.network.FetchData;
import com.example.knightcube.recipeapp.utils.Constants;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements RecipeAdapter.ListItemClickListener {

    private RecyclerView recyclerView;
    private RecipeAdapter recipeAdapter;
    private String TAG = "MainActivity";
    private List<Ingredient> ingredientList;
    private List<Step> stepList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //Initialize Library
        //TODO - 2 Uncomment to initialize library
//        AndroidNetworking.initialize(getApplicationContext());
//        getAllRecipeFromAPI();

    }

    //TODO - 3 Uncomment to start json parsing
    //Fetch Data using custom parser
//    public List<Recipe> getAllRecipeFromAPI() {
//        final List<Recipe> recipeList = new ArrayList<>();
//        ingredientList = new ArrayList<Ingredient>();
//        stepList = new ArrayList<>();
//        AndroidNetworking.get(Constants.API_URL)
//                .setPriority(Priority.MEDIUM)
//                .build()
//                .getAsJSONArray(new JSONArrayRequestListener() {
//                    @Override
//                    public void onResponse(JSONArray response) {
//                        if (response.toString() != null) {
//                            try {
//                                JSONArray jsonArray = new JSONArray(response.toString());
//                                for (int i = 0; i < jsonArray.length(); i++) {
//                                    JSONObject recipeJSONObject = jsonArray.getJSONObject(i);
//                                    String recipeName = recipeJSONObject.getString("name");
//                                    int id = recipeJSONObject.getInt("id");
//                                    int servings = recipeJSONObject.getInt("servings");
//                                    String image = recipeJSONObject.getString("image");
//
//
//                                    //Getting ingredients of every recipe
//                                    JSONArray ingredientsJSONArray = recipeJSONObject.getJSONArray("ingredients");
//                                    for (int j = 0; j < ingredientsJSONArray.length(); j++) {
//                                        JSONObject ingredientJsonObject = ingredientsJSONArray.getJSONObject(j);
//                                        double quantity = ingredientJsonObject.getDouble("quantity");
//                                        String measure = ingredientJsonObject.getString("measure");
//                                        String ingredientString = ingredientJsonObject.getString("ingredient");
//                                        Ingredient ingredient = new Ingredient(quantity, measure, ingredientString);
//                                        ingredientList.add(ingredient);
//                                    }
//
//                                    //Getting steps of every recipe
//                                    JSONArray stepsJSONArray = recipeJSONObject.getJSONArray("steps");
//                                    for (int k = 0; k < stepsJSONArray.length(); k++) {
//                                        JSONObject stepsJsonObject = stepsJSONArray.getJSONObject(k);
//                                        int stepId = stepsJsonObject.getInt("id");
//                                        String shortDescription = stepsJsonObject.getString("shortDescription");
//                                        String description = stepsJsonObject.getString("description");
//                                        String videoURL = stepsJsonObject.getString("videoURL");
//
//                                        Step step = new Step(stepId, shortDescription, description, videoURL);
//
//                                        stepList.add(step);
//                                    }
//
//                                    Recipe recipe = new Recipe(id, recipeName, ingredientList, stepList, servings, image);
//                                    recipeList.add(recipe);
//                                    Log.i(TAG, "onResponse: " + recipeList.size());
//                                    setupAdapter(recipeList);
//
//                                }
//                            } catch (JSONException e) {
//                                e.printStackTrace();
//                            }
//                        }
//                    }
//
//                    @Override
//                    public void onError(ANError anError) {
//                        Log.i(TAG, "onError: " + anError.getErrorBody());
//                    }
//                });
//        return recipeList;
//    }


    private void setupAdapter(List<Recipe> recipeList) {
        Log.i(TAG, "setupAdapter: " + recipeList.size());
        //Setup an adapter
        //TODO - 3 Uncomment to setup adapter
//        recipeAdapter = new RecipeAdapter(recipeList, MainActivity.this, MainActivity.this);

        //Setup RecyclerView
        //TODO - 4 Uncomment to setup RecyclerView
//        recyclerView = findViewById(R.id.recipe_recycler_view);
//        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false));

        //Set Adapter inside RecyclerView
        //TODO - 5 Uncomment to set adapter inside RecyclerView
//        recyclerView.setAdapter(recipeAdapter);
    }

    @Override
    public void onListItemClick(int clickedItemIndex, List<Recipe> recipeList) {

    }
}
