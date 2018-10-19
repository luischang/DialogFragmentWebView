package pe.com.moviles.semana09_dialogwv;


import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class RetiroFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_retiro, container, false);
        RadioGroup radioGroup = (RadioGroup) view.findViewById(R.id.rgTipo);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i) {
                    case R.id.rbCurso:
                        DialogCurso fragmentCurso = new DialogCurso();
                        fragmentCurso.show(getActivity().getSupportFragmentManager(), "Selección");

                        break;
                    case R.id.rbCiclo:
                        DialogCiclo fragmentCiclo = new DialogCiclo();
                        fragmentCiclo.show(getActivity().getSupportFragmentManager(), "Selección");
                        break;
                }
            }
        });

        // Inflate the layout for this fragment
        return view;
    }

}
