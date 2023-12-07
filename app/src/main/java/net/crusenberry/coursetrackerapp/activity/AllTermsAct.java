package net.crusenberry.coursetrackerapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import net.crusenberry.coursetrackerapp.R;

public class AllTermsAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_terms);
        FloatingActionButton addbutton = findViewById(R.id.addbuttonfx);
        addbutton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(AllTermsAct.this, TermDetailAct.class);
                startActivity(intent);
            }
        });
        //System.out.println(getIntent().getStringExtra("key"));
    }






    /*public boolean onCreateOptionMenu(Menu menu){
        getMenuInflater().inflate(R.menu.menu_all_terms, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if(item.getItemId() == R.id.mysample) {
            Toast.makeText(AllTermsAct.this, "put in sample data", Toast.LENGTH_SHORT).show();
            return true;
        }
        if(item.getItemId() == android.R.id.home){
            this.finish();
            return true;
        }
        return true;
    }
     */
}