package com.example.toshibas.contactos;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ExpandableListView listView;
    private ExpandableListAdapter listAdapter;
    private List<String> listDataHeader;
    private HashMap<String, List<String>> listaHash;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ExpandableListView)findViewById(R.id.lvExp);
        initData();
        listAdapter = new com.example.toshibas.contactos.ExpandableListAdapter(this,listDataHeader,listaHash);
        listView.setAdapter(listAdapter);

    }

    private void initData() {
        listDataHeader = new ArrayList<>();
        listaHash = new HashMap<>();

        listDataHeader.add("Dirección general");
        listDataHeader.add("Secretaria");
        listDataHeader.add("Relaciones Publicas");
        listDataHeader.add("Facultad de Ingenieria");
        listDataHeader.add("Facultad de Ciencias Sociales");
        listDataHeader.add("Facultad de Educacion");
        listDataHeader.add("Decanatura de Admisiones");
        listDataHeader.add("Colegio Universitario y Asuntos Estudiantiles");
        listDataHeader.add("Facultad de Ciencias y Humanidades");
        listDataHeader.add("Donaciones");

        List<String> Direccion = new ArrayList<>();
        Direccion.add("18 Av. 11-95 zona 15. Vista Hermosa III ");
        Direccion.add("Guatemala, Guatemala. 01015");
        Direccion.add("Telefono: ");
        Direccion.add("2507-1500");
        listaHash.put(listDataHeader.get(0),Direccion);

        List<String> Secretaria = new ArrayList<>();
        Secretaria.add("Ext. 2145/2");
        Secretaria.add("Correo:");
        Secretaria.add("svsuruy@uvg.edu.gt");
        listaHash.put(listDataHeader.get(1),Secretaria);

        List<String> Publicas = new ArrayList<>();
        Publicas.add("Ext. 21464");
        Publicas.add("Correo:");
        Publicas.add("info@uvg.edu.gt");
        listaHash.put(listDataHeader.get(2),Publicas);

        List<String> Ingenieria = new ArrayList<>();
        Ingenieria.add("Ext. 21405");
        Ingenieria.add("Correo:");
        Ingenieria.add("ingenieria@uvg.edu.gt");
        listaHash.put(listDataHeader.get(3),Ingenieria);

        List<String> sociales = new ArrayList<>();
        sociales.add("Ext. 21455");
        sociales.add("Correo:");
        sociales.add("facccss@uvg.edu.gt");
        listaHash.put(listDataHeader.get(4),sociales);

        List<String> educa = new ArrayList<>();
        educa.add("Ext. 21443");
        educa.add("Correo:");
        educa.add("fac-educ@uvg.edu.gt");
        listaHash.put(listDataHeader.get(5),educa);

        List<String> admin = new ArrayList<>();
        admin.add("Ext. 21720");
        admin.add("Correo:");
        admin.add("adopazo@uvg.edu.gt");
        listaHash.put(listDataHeader.get(6),admin);

        List<String> estudiantiles = new ArrayList<>();
        estudiantiles.add("Ext. 21615");
        estudiantiles.add("Correo:");
        estudiantiles.add("coluniv@uvg.edu.gt");
        listaHash.put(listDataHeader.get(7),estudiantiles);

        List<String> hum = new ArrayList<>();
        hum.add("Ext. 21448");
        hum.add("Correo:");
        hum.add("faccchh@uvg.edu.gt");
        listaHash.put(listDataHeader.get(8),hum);

        List<String> donar = new ArrayList<>();
        donar.add("Telefono:");
        donar.add("2369-0528");
        donar.add("Correo:");
        donar.add("secfuvg@uvg.edu.gt");
        listaHash.put(listDataHeader.get(9),hum);


    }
}
