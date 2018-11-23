package com.fryanramzkhar.malaikatku;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecycleMala extends AppCompatActivity {

    @BindView(R.id.my_recycle_malaikat)
    RecyclerView myRecycleMalaikat;

    String[] namaMalaikat,tugasMalaikat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle_mala);
        ButterKnife.bind(this);

        namaMalaikat = getResources().getStringArray(R.array.nama_malaikat);
        tugasMalaikat = getResources().getStringArray(R.array.tugas_malaikat);

        AdapterMala adapter = new AdapterMala(RecycleMala.this, namaMalaikat,tugasMalaikat);
        myRecycleMalaikat.setHasFixedSize(true);
        myRecycleMalaikat.setLayoutManager(new LinearLayoutManager(RecycleMala.this));
        myRecycleMalaikat.setAdapter(adapter);
    }
}
