package com.example.putatoecategory;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.gson.Gson;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    ArrayList<parentmodelclass> parentmodelclassArrayList;
    ArrayList<childmodelClass>  DairyProducts;
    ArrayList<childmodelClass>  Footware;
    ArrayList<childmodelClass>  FruitandVegetable;
    ArrayList<childmodelClass>  Grocery;

    RecyclerView ParentRecycler;

    String  BASE_URL = "https://putatoetest-k3snqinenq-uc.a.run.app/";
    String tokenValue = "UYY80HXH1EA9A2DQIMT1KFAZU3OZZJLH5G5CJUTG4A7SB7L6SY";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        parentmodelclassArrayList = new ArrayList<>();
        DairyProducts = new ArrayList<>();
        Footware = new ArrayList<>();
        FruitandVegetable = new ArrayList<>();
        Grocery = new ArrayList<>();
        ParentRecycler = findViewById(R.id.rv_parent);


     /****************************************************************/
     OkHttpClient.Builder okhttpbuilder = new OkHttpClient.Builder();
     okhttpbuilder.addInterceptor(new Interceptor() {
         @NonNull
         @Override
         public okhttp3.Response intercept(@NonNull Chain chain) throws IOException {
             Request request = chain.request();
             Request.Builder newRequest = request.newBuilder().header("authtoken",tokenValue);

             return chain.proceed(newRequest.build());
         }
     });
        Retrofit retrofit = new Retrofit.Builder()
                         .baseUrl(BASE_URL)
                         .client(okhttpbuilder.build())
                         .addConverterFactory(GsonConverterFactory.create())
                         .build();
        ApiInterface apiInterface = retrofit.create(ApiInterface.class);

        Call<Parent> call = apiInterface.getPost(new BodyClass(6));

        call.enqueue(new Callback<Parent>() {
            @Override
            public void onResponse(Call<Parent> call, Response<Parent> response) {

                if (response.isSuccessful()) {
                    // API call was successful, handle the response
                    Parent results = response.body();
                    Map<String, List<childmodelClass>> productType = results.getProductType();
                    if (productType != null) {
                        Log.d("X_RESPONSE", String.valueOf(productType.size()));
                        for (Map.Entry<String, List<childmodelClass>> entry : productType.entrySet()) {
                            //Log.d("X_RESPONSE", entry.getKey());
                            List<childmodelClass> ProductsList = productType.get(entry.getKey());
                            parentmodelclassArrayList.add(new parentmodelclass(entry.getKey(),ProductsList));
                        }
                        // List<childmodelClass> dairyProductsList = productType.get("Dairy Products");
                        //DairyProducts.addAll(dairyProductsList);
                        //List<childmodelClass> GroceryList = productType.get("Grocery");
                        //Grocery.addAll(GroceryList);

                         //Log.d("X_RESPONSE", results.getProductType().toString());
                        // Do something with the 'dp' list
                        //Gson gson = new Gson();
                        //String jsonResponse = gson.toJson(results);
                        //Log.d("API_RESPONSE", jsonResponse);
                        Toast.makeText(MainActivity.this, "Success", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(MainActivity.this, "ProductType is null", Toast.LENGTH_SHORT).show();
                    }
//                  //  for (Map.Entry<String, List<childmodelClass>> entry : productType.entrySet()) {
//                        //Log.d("X_RESPONSE", entry.getKey());
//                      //  parentmodelclassArrayList.add(new parentmodelclass(entry.getKey(),DairyProducts));
//                    //}

                    //parentmodelclassArrayList.add(new parentmodelclass("DairyProducts",DairyProducts));
                    //parentmodelclassArrayList.add(new parentmodelclass("Footware",Footware));
                    //parentmodelclassArrayList.add(new parentmodelclass("FruitandVegetable",FruitandVegetable));
                    //parentmodelclassArrayList.add(new parentmodelclass("Grocery",Grocery));

                    parentadapter parentadapter = new parentadapter(parentmodelclassArrayList,MainActivity.this);
                    ParentRecycler.setAdapter(parentadapter);
                    ParentRecycler.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                } else {
                    // API call failed, handle the error
                    try {
                        // Print the error message from the error body
                        String errorBody = response.errorBody().string();
                        Log.e("API_ERROR", errorBody);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }


            }


            @Override
            public void onFailure(Call<Parent> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Failed" + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });



        /****************************************************************/


    }
}