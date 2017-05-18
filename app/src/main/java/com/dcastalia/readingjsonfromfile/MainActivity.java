package com.dcastalia.readingjsonfromfile;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView textView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.txtExample);
        String title = "";
        for(int i =0 ; i<loadJsonFromAssests().size(); i++){
            title+=" "+loadJsonFromAssests().get(i).getMenuTitle();
        }
        textView.setText(title);

    }


    public ArrayList<Menu> loadJsonFromAssests (){

        ArrayList<Menu> menus = new ArrayList<>();
        String json  = null ;

        try{
            InputStream inputStream = getAssets().open("company_and_menu.json");
            int size = inputStream.available();

            byte[] buffer = new byte[size];
            inputStream.read(buffer);
            inputStream.close();
            json = new String(buffer,"UTF-8");
        }
        catch (IOException ex ){
            ex.printStackTrace();
            return null;
        }

        try{
            JSONObject jsonObject = new JSONObject(json);
            JSONArray jsonArray = jsonObject.getJSONArray("menu");

            for(int i=0 ; i<jsonArray.length(); i++){
                JSONObject menuObject = jsonArray.getJSONObject(i);
                Menu menu = new Menu() ;
                menu.setMenuId(menuObject.getString("menu_id"));
                menu.setMenuTitle(menuObject.getString("menu_title"));
                menu.setMenuLogo(menuObject.getString("menu_logo"));
                menu.setHasCategory(menuObject.getString("has_category"));
                menu.setCategoryCount(menuObject.getString("category_count"));

                menus.add(menu);

            }

        }
        catch (JSONException ex ){
            ex.printStackTrace();
        }
        return  menus;

    }



}
