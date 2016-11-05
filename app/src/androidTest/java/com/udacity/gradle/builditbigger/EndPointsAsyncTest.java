package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.support.v4.util.Pair;
import android.util.AndroidRuntimeException;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.InstrumentationRegistry.getInstrumentation;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by Divya on 11/5/2016.
 */
@RunWith(AndroidJUnit4.class)
public class EndPointsAsyncTest {
    Context context;


    @Before
    public void setUp() throws Exception {

        context = getInstrumentation().getTargetContext();
    }

    @Test
    public void testBaseAPI() throws Exception {

        String result = null;
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask(context) {
            @Override
            protected void onPreExecute() {
            }

            @Override
            protected void onPostExecute(String result) {
            }
        };

        endpointsAsyncTask.execute("");

        try {
            result = endpointsAsyncTask.get();
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertNotNull(result);

    }

    @After
    public void tearDown() throws Exception {

    }

}
