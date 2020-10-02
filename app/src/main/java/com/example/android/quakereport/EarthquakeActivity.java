/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.quakereport;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class EarthquakeActivity extends AppCompatActivity {

    public static final String LOG_TAG = EarthquakeActivity.class.getName();

    public void getUrl(ArrayList<String> urls)
    {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_activity);

        ArrayList<Input> earthquakes = QueryUtils.extractEarthquakes();


        // Find a reference to the {@link ListView} in the layout
        InputAdapter inputAdapter = new InputAdapter(this, earthquakes);

        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(inputAdapter);

        final ArrayList<String> urls = QueryUtils.urls;

        final String[] url = {""};
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.i("URL..........", urls.get(i));
                 url[0] = urls.get(i);

                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url[0]));
                if (!url[0].startsWith("http://") && !url[0].startsWith("https://"))
                    url[0] = "http://" + url[0];
                startActivity(browserIntent);
            }
        });

    }
}
