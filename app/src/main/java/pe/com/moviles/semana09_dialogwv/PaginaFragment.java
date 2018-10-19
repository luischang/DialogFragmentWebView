package pe.com.moviles.semana09_dialogwv;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class PaginaFragment extends Fragment {
    private Button btnVisualizar;
    private EditText txtUrl;
    private WebView wvPagina;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_pagina, container, false);

        btnVisualizar = (Button) view.findViewById(R.id.btnVisualizar);
        txtUrl = (EditText) view.findViewById(R.id.txtUrl);
        wvPagina = (WebView) view.findViewById(R.id.wvPagina);

        btnVisualizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wvPagina.getSettings().setJavaScriptEnabled(true);
                wvPagina.setWebViewClient(new WebViewClient());
                wvPagina.loadUrl("http://" + txtUrl.getText().toString());
            }
        });
        return view;
    }
}
