package com.android.week07;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button XemKetQua;
    private EditText SoTienGuiEditText;
    private EditText LaiSuatGuiEditText;
    private EditText KyHanGuiEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        XemKetQua = (Button) findViewById(R.id.bt_ketqua);
        XemKetQua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Result.class);
                double soTienGui = getOperandValue(SoTienGuiEditText);

                double laiSuatGui = getOperandValue(LaiSuatGuiEditText);
                double kyHanGui = getOperandValue(KyHanGuiEditText);
                double soTienLai = soTienGui * laiSuatGui/100 * kyHanGui/12;
                double TongSoTien = soTienGui + soTienLai;
                intent.putExtra("SoTien", soTienLai);
                intent.putExtra("TongSoTien", TongSoTien);
                startActivity(intent);
            }
        });
        SoTienGuiEditText = (EditText) findViewById(R.id.SoTienGui_txt);
        LaiSuatGuiEditText = (EditText) findViewById(R.id.LaiSuatGui_txt);
        KyHanGuiEditText = (EditText) findViewById(R.id.KyHanGui_txt);
    }

    private static String getOperandText(EditText editText) {
        return editText.getText().toString();
    }

    private static Double getOperandValue(EditText editText) {
        String operandText = getOperandText(editText);
        return Double.valueOf(operandText);
    }

//    public void onClickGui() {
//        double soTienGui = getOperandValue(SoTienGuiEditText);
//        double laiSuatGui = getOperandValue(LaiSuatGuiEditText);
//        double kyHanGui = getOperandValue(KyHanGuiEditText);
//        double soTienLaiGui1Thang = soTienGui * laiSuatGui/100;
//        double soTienLaiGui = soTienLaiGui1Thang * kyHanGui;
//        SoTienLaiNhanDuoc.setText(String.valueOf(soTienLaiGui1Thang));
//        TongSoTienNhanDuoc.setText(String.valueOf(soTienLaiGui));
//    }
}