package fr.roxane.vovard.mytodolist;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by rvovard on 08/01/2018.
 */

public class TodoActivity extends Activity
{
        private Button btnValider;
        private Button btnVider;
        private TextView txtView;
        private EditText txtEdit;
        private String text;

        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.task_layout);
            btnValider = (Button) findViewById(R.id.btnValider1);
            btnVider = (Button) findViewById(R.id.btnVider1);
            txtView = (TextView) findViewById(R.id.txtView1);
            txtEdit = (EditText) findViewById(R.id.txtEdit1);

            btnValider.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        text = txtEdit.getText().toString();
                        txtView.setText(text);
                    }
                }
                );
            btnVider.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    text = null;
                    txtView.setText(text);
                }
            });
        }
    }


