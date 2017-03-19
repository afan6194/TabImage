package com.a.dev.tabframe;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * Created by Asus on 13/03/2017.
 */

public class Utama extends Fragment {

    public View onCreateView(LayoutInflater inflater, final ViewGroup container, Bundle savedInstanceState) {
        Button btspbu, btrs, btkp, btbengkel, btatm, btexit;
        View view = inflater.inflate(R.layout.layutama, container, false);

        btspbu = (Button) view.findViewById(R.id.btspbu);

        btspbu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "SPBU", Toast.LENGTH_SHORT).show();
            }
        });
        btrs = (Button) view.findViewById(R.id.btrs);

        btrs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Rumah Sakit", Toast.LENGTH_SHORT).show();
            }
        });
        btkp = (Button) view.findViewById(R.id.btkp);

        btkp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Kantor Polisi", Toast.LENGTH_SHORT).show();
            }
        });
        btbengkel = (Button) view.findViewById(R.id.btbengkel);

        btbengkel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "Bengkel", Toast.LENGTH_SHORT).show();
            }
        });
        btatm = (Button) view.findViewById(R.id.btatm);

        btatm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "ATM", Toast.LENGTH_SHORT).show();
            }
        });
        btexit = (Button) view.findViewById(R.id.btexit);

        btexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
                builder.setIcon(android.R.drawable.ic_dialog_alert).setTitle("KELUAR")
                        .setMessage("Apakah Anda Benar-Benar ingin keluar?")
                        .setCancelable(false)
                        .setPositiveButton("Ya",
                                new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,
                                                        int id) {
                                        getActivity().finish();
                                    }
                                })
                        .setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int id) {
                                dialog.cancel();

                            }
                        }).show();
            }
        });
        return view;
    }
}


