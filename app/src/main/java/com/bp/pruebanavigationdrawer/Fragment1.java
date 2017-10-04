package com.bp.pruebanavigationdrawer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* Fragmento que representa la opción 1 del menú. */

public class Fragment1 extends Fragment {

    public Fragment1() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Rellena el contenido del layout con el fragmento.
        return inflater.inflate(R.layout.fragment_op1, container, false);
    }
}