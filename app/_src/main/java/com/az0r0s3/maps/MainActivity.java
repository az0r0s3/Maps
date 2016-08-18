package com.az0r0s3.maps;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

/**
 * The main activity of the API library demo gallery.
 * <p>
 * The main layout lists the demonstrated features, with buttons to launch them.
 */
public final class MainActivity extends AppCompatActivity
        implements AdapterView.OnItemClickListener {