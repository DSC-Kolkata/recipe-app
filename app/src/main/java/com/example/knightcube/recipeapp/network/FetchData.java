package com.example.knightcube.recipeapp.network;

import android.util.Log;

import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.JSONArrayRequestListener;
import com.example.knightcube.recipeapp.models.Ingredient;
import com.example.knightcube.recipeapp.models.Recipe;
import com.example.knightcube.recipeapp.models.Step;
import com.example.knightcube.recipeapp.utils.Constants;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rajat Kumar Gupta on 09-07-2018.
 */
public class FetchData {
    private String TAG = "FetchData";
    private List<Recipe> recipeList;
    private List<Ingredient> ingredientList;
    private List<Step> stepList;

    public List<Recipe> getRecipeFromAPI(){
        recipeList = new ArrayList<>();
        ingredientList = new ArrayList<Ingredient>();
        stepList = new ArrayList<>();
        AndroidNetworking.get(Constants.API_URL)
                .setPriority(Priority.MEDIUM)
                .build()
                .getAsJSONArray(new JSONArrayRequestListener() {
                    @Override
                    public void onResponse(JSONArray response) {
                        if(response.toString()!=null) {
                            try {
                                JSONArray jsonArray = new JSONArray(response.toString());
                                for(int i=0;i<jsonArray.length();i++){
                                    JSONObject recipeJSONObject = jsonArray.getJSONObject(i);
                                    String recipeName = recipeJSONObject.getString("name");
                                    int id = recipeJSONObject.getInt("id");
                                    int servings = recipeJSONObject.getInt("servings");
                                    String image = recipeJSONObject.getString("image");


                                    //Getting ingredients of every recipe
                                    JSONArray ingredientsJSONArray = recipeJSONObject.getJSONArray("ingredients");
                                    for (int j=0;j<ingredientsJSONArray.length();j++) {
                                        JSONObject ingredientJsonObject = ingredientsJSONArray.getJSONObject(j);
                                        double quantity = ingredientJsonObject.getDouble("quantity");
                                        String measure = ingredientJsonObject.getString("measure");
                                        String ingredientString = ingredientJsonObject.getString("ingredient");
                                        Ingredient ingredient = new Ingredient(quantity,measure,ingredientString);
                                        ingredientList.add(ingredient);
                                    }

                                    //Getting steps of every recipe
                                    JSONArray stepsJSONArray = recipeJSONObject.getJSONArray("steps");
                                    for (int k=0;k<stepsJSONArray.length();k++) {
                                        JSONObject stepsJsonObject = stepsJSONArray.getJSONObject(k);
                                        int stepId = stepsJsonObject.getInt("id");
                                        String shortDescription = stepsJsonObject.getString("shortDescription");
                                        String description = stepsJsonObject.getString("description");
                                        String videoURL = stepsJsonObject.getString("videoURL");
                                        String thumbURL = stepsJsonObject.getString("thumbURL");
                                        Step step = new Step(stepId,shortDescription,description,videoURL);
                                        stepList.add(step);
                                    }

                                    Recipe recipe = new Recipe(id,recipeName,ingredientList,stepList,servings,image);
                                    recipeList.add(recipe);

                                }
                            } catch (JSONException e) {
                                e.printStackTrace();
                            }
                        }
                    }

                    @Override
                    public void onError(ANError anError) {
                        Log.i(TAG, "onError: "+anError.getErrorBody());
                    }
                });
        return recipeList;
    }

//    //Fetch Data Using Default Parser
//    private void getAllRecipeFromAPI(){
//        final List<Recipe> recipeList = new ArrayList<>();
//        AndroidNetworking.get(Constants.API_URL)
//                .setPriority(Priority.MEDIUM)
//                .build()
//                .getAsObjectList(Recipe.class, new ParsedRequestListener<List<Recipe>>() {
//                    @Override
//                    public void onResponse(List<Recipe> response) {
//                        Log.i(TAG, "onResponse: "+response.size());
//                        for(Recipe recipe: response){
//                            recipeList.add(recipe);
//                        }
//                        setupAdapter(recipeList);
//                    }
//
//                    @Override
//                    public void onError(ANError anError) {
//                        Log.i(TAG, "onError: "+anError.getErrorBody());
//                    }
//                });
//    }

}
