package com.bp.pruebanavigationdrawer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* Fragmento que representa la opción 2 del menú. */

public class Fragment2 extends Fragment {

    public Fragment2() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Rellena el contenido del layout con el fragmento.
        return inflater.inflate(R.layout.fragment_op2, container, false);
    }
}
