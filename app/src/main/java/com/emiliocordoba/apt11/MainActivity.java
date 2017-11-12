package com.emiliocordoba.apt11;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    Button btnComportamiento, btnCondicion, btnRefuerzoPositivo;
    Intent i1, i2, i3,iactivityGuiaAPP , iactivityManualUsuario, iactivity_navApt
            ,iactivity_navComportamiento ,iactivity_navCondicion ,iactivity_navRefuerzoPositivo
            ,iactivity_navCategoria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//INSTANCIAMOS LOS ELEMENTOS DE LA VISTA.
        btnComportamiento = (Button)findViewById(R.id.btnComportamiento);
        btnCondicion = (Button)findViewById(R.id.btnCondicion);
        btnRefuerzoPositivo = (Button)findViewById(R.id.btnRefuerzoPositivo);

        i2 = new Intent(MainActivity.this,Main2Activity.class);
        i3 = new Intent(MainActivity.this,Main3Activity.class);
        iactivityGuiaAPP = new Intent(MainActivity.this, Activity_GuiaApp.class);
        iactivityManualUsuario = new Intent(MainActivity.this, Activity_ManualUsuario.class);
        iactivity_navApt = new Intent(MainActivity.this, Activity_navapt.class);
        iactivity_navComportamiento = new Intent(MainActivity.this, Activity_navcomportamiento.class);
        iactivity_navCondicion = new Intent(MainActivity.this, Activity_navCondicion.class);
        iactivity_navRefuerzoPositivo = new Intent(MainActivity.this, Activity_navRefuerzopositivo.class);
        iactivity_navCategoria = new Intent(MainActivity.this, Activity_navCategoria.class);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
//Modificación de la toolBar por una definida para esta actividad.
        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.tool_barmainactivity);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        btnComportamiento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i3.putExtra("TipoAPT","Comportamiento");
                startActivity(i2);
            }
        });
        btnCondicion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i3.putExtra("TipoAPT","Condicion");
                startActivity(i2);
            }
        });
        btnRefuerzoPositivo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i3.putExtra("TipoAPT","Refuerzo positivo");
                startActivity(i3);
            }
        });
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_guiaapp) {
            startActivity(iactivityGuiaAPP);

        } else if (id == R.id.nav_manualusuario) {
            startActivity(iactivityManualUsuario);

        } else if (id == R.id.nav_apt) {
            startActivity(iactivity_navApt);

        } else if (id == R.id.nav_comportamiento) {
            startActivity(iactivity_navComportamiento);

        } else if (id == R.id.nav_condicion) {
            startActivity(iactivity_navCondicion);

        } else if (id == R.id.nav_refuerzopositivo) {
            startActivity(iactivity_navRefuerzoPositivo);

        }   else if (id == R.id.nav_categoria) {
            startActivity(iactivity_navCategoria);
    }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}

/*
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

   /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

     @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

*/
