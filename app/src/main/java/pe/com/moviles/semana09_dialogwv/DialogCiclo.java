package pe.com.moviles.semana09_dialogwv;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.widget.TextView;

public class DialogCiclo extends DialogFragment {

    public Dialog onCreateDialog(Bundle savedInstanceState) {

        final String[] items = new String[]{"2018-2", "2018-1", "2017-2", "2017-1"};
        final TextView tvSeleccion = (TextView) getActivity().findViewById(R.id.tvSeleccion);

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Seleccione el ciclo").setSingleChoiceItems(items, -1, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                tvSeleccion.setText(items[i]);
                dialogInterface.dismiss();
            }
        });
        return builder.create();
    }
}
