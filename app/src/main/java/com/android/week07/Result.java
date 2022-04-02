/**
 * Create by: IntelliJ IDEA
 * User     : 19110
 * Date     : Tue, 3/29/2022
 * Time     : 7:39 PM
 * Filename : Result
 */

package com.android.week07;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Result extends AppCompatActivity {
    TextView SoTienLaiNhanDuocTextView;
    TextView TongSoTienNhanDuocTextView;
    private Button btnReturn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);
        Intent intent = getIntent();
        SoTienLaiNhanDuocTextView = (TextView) findViewById(R.id.TienLai);
        TongSoTienNhanDuocTextView = (TextView) findViewById(R.id.TongTienLai);
        Double SoTien = intent.getDoubleExtra("SoTien",0);
        Double TongSoTien = intent.getDoubleExtra("TongSoTien",0);
        SoTienLaiNhanDuocTextView.setText(""+SoTien);
        TongSoTienNhanDuocTextView.setText(""+TongSoTien);
        btnReturn = (Button) findViewById(R.id.btnReturn);
        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Result.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
