package com.example.knightcube.recipeapp.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import com.example.knightcube.recipeapp.R;
import com.example.knightcube.recipeapp.adapter.RecipeAdapter;
import com.example.knightcube.recipeapp.models.Ingredient;
import com.example.knightcube.recipeapp.models.Recipe;
import com.example.knightcube.recipeapp.models.Step;
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

    }

    @Override
    public void onListItemClick(int clickedItemIndex, List<Recipe> recipeList) {

    }
}
