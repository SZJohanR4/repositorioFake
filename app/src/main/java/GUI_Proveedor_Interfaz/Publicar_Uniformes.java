package gui_proveedor_interfaz;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ingsoftware.la10uniformes_ingsoft.R;


/**
 * Created by Sebastian on 14/05/2016.
 */
public class Publicar_Uniformes extends android.support.v4.app.Fragment {

    /*DatosPorDefecto();
    final EditText edttxt = (EditText) findViewById (R.id.editText1);
    Button btm_agregar = (Button) findViewById (R.id.btm_agregar);
    btm_agregar.setOnClickListener(new OnClickListener(){
        @Override
        public void onClick(View arg0) {
            String nuevoDato = edttxt.getText().toString();
            nuevoDato=nuevoDato.trim();
            if (nuevoDato.length()>1){
                lista.add(nuevoDato);
                edttxt.setText("");
            }
        }
    });
    spinner1.setOnItemSelectedListener(new OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
            Toast.makeText(arg0.getContext(), "Seleccionado: " + arg0.getItemAtPosition(arg2).toString(), Toast.LENGTH_SHORT).show();
        }
        @Override
        public void onNothingSelected(AdapterView<?> arg0) {
        }
    })
    <EditText
   android:id="@+id/editText1"
   android:layout_width="match_parent"
   android:layout_height="wrap_content"
   android:ems="10" >
      <requestFocus />
</EditText>
<Button
   android:id="@+id/btm_agregar"
   android:layout_width="wrap_content"
   android:layout_height="wrap_content"
   android:text="Agregar" />

   private Spinner spinner1;
    private List<String> lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_publicaruniformes_proveedor);
        DatosPorDefectoCategoria();
        DatosPorDefectoEquipo();
    }


    private void DatosPorDefectoEquipo() {
        spinner1 = (Spinner) findViewById(R.id.spiEquipo);
        lista = new ArrayList<String>();
        spinner1 = (Spinner) this.findViewById(R.id.spiEquipo);
        lista.add("Panchos");
        lista.add("Choripán");
        lista.add("Hamburguesas");
        lista.add("Pollo al horno");
        lista.add("Asado");
        lista.add("Arroz");
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, lista);
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adaptador);
    }
    private void DatosPorDefectoCategoria() {
        spinner1 = (Spinner) findViewById(R.id.spiEquipo);
        lista = new ArrayList<String>();
        spinner1 = (Spinner) this.findViewById(R.id.spiEquipo);
        lista.add("Panchos");
        lista.add("Choripán");
        lista.add("Hamburguesas");
        lista.add("Pollo al horno");
        lista.add("Asado");
        lista.add("Arroz");
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, lista);
        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adaptador);
    }
    extends AppCompatActivity
    */
    private OnFragmentInteractionListener mListener;

    public Publicar_Uniformes() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.activity_publicaruniformes_proveedor, container, false);
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}
