package cl.telematica.android.certamen2.fragments;

import android.support.v7.widget.RecyclerView;

/**
 * Created by nicole on 18-12-2015.
 */
public class MyAdapter  extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private String [] mArray;
    private int numeroID;
    private int largoDeLista;

    public MyAdapter(String[] array){
        mArray = array;
        largoDeLista = array.length;

    }


    public static class ViewHolder  {
    }
}
