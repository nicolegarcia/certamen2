package cl.telematica.android.certamen2.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import cl.telematica.android.certamen2.R;

public class InputFragment extends Fragment implements View.OnClickListener {

    EditText nombretext; //cracion editar texto nombre
    EditText apellidotext; // creadion editar texto apellido
    Button botoningresar;  //Creacion boton ingresar
    TextView respuesta; //respuesta

    String[] nombreapellido ;


    /**
     * New instance of InputFragment
     *
     * @return new instance of InputFragment
     */
    public static InputFragment newInstance() {
        InputFragment fragment = new InputFragment();
        return fragment;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
       View mainView = inflater.inflate(R.layout.fragment_input, null);

        nombretext = (EditText) mainView.findViewById(R.id.NOMBRE);
        apellidotext = (EditText)mainView.findViewById(R.id.APELLIDO);

        botoningresar = (Button)mainView.findViewById(R.id.botonIngresar);

botoningresar.setOnClickListener(this);

        /*
         * Aquí es donde deben hacer el link a los elementos del layout fragment_input,
         * y donde prácticamente se debe hacer el desarrollo
        */
        return mainView;
    }


    @Override
    public void onClick(View v) {

        String nombre = nombretext.getText().toString();
        String apellido = apellidotext.getText().toString();

        String url = "http://api.icndb.com/jokes/random?firstName=" + nombre + "&lastName=" + apellido;


    }

}
