package pe.com.moviles.semana09_dialogwv;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.widget.TextView;

public class DialogCurso extends DialogFragment {

    public Dialog onCreateDialog(Bundle savedInstanceState) {

        final String[] items = new String[]{"Investigación Operativa", "Robótica", "Desarrollo de aplicaciones móviles", "Estática"};
        final TextView tvSeleccion = (TextView) getActivity().findViewById(R.id.tvSeleccion);

        final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Seleccione el curso").setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                tvSeleccion.setText(items[i]);
                dialogInterface.dismiss();

            }
        });
        return builder.create();
    }
}
