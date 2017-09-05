package com.example.faishalrachman.kalkulatorqu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView hasil;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;
    Button tambah, kurang, kali, bagi, samadengan, clear;
    byte status = 0;
    long x1, x2;
    byte operasi = 0;

    /*
    1 = Nulis Variabel satu
    2 = Nulis Variabel dua
    0 = Nampil Hasil
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.satu);
        btn2 = (Button) findViewById(R.id.dua);
        btn3 = (Button) findViewById(R.id.tiga);
        btn4 = (Button) findViewById(R.id.empat);
        btn5 = (Button) findViewById(R.id.lima);
        btn6 = (Button) findViewById(R.id.enam);
        btn7 = (Button) findViewById(R.id.tujuh);
        btn8 = (Button) findViewById(R.id.delapan);
        btn9 = (Button) findViewById(R.id.sembilan);
        btn0 = (Button) findViewById(R.id.nol);
        clear = (Button) findViewById(R.id.clear);
        tambah = (Button) findViewById(R.id.tambah);
        kurang = (Button) findViewById(R.id.kurang);
        kali = (Button) findViewById(R.id.kali);
        bagi = (Button) findViewById(R.id.bagi);
        hasil = (TextView) findViewById(R.id.hasil);
        samadengan = (Button)findViewById(R.id.samadengan);
        setListener();
    }

    void setListener() {

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nomor = "1";
                if (status > 0) hasil.setText(hasil.getText().toString() + nomor);
                if (status == 0) {
                    status = 1;
                    hasil.setText(nomor);
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nomor = "2";
                if (status > 0) hasil.setText(hasil.getText().toString() + nomor);
                if (status == 0) {
                    status = 1;
                    hasil.setText(nomor);
                }
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nomor = "3";
                if (status > 0) hasil.setText(hasil.getText().toString() + nomor);
                if (status == 0) {
                    status = 1;
                    hasil.setText(nomor);
                }
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nomor = "4";
                if (status > 0) hasil.setText(hasil.getText().toString() + nomor);
                if (status == 0) {
                    status = 1;
                    hasil.setText(nomor);
                }
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nomor = "5";
                if (status > 0) hasil.setText(hasil.getText().toString() + nomor);
                if (status == 0) {
                    status = 1;
                    hasil.setText(nomor);
                }
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nomor = "6";
                if (status > 0) hasil.setText(hasil.getText().toString() + nomor);
                if (status == 0) {
                    status = 1;
                    hasil.setText(nomor);
                }
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nomor = "7";
                if (status > 0) hasil.setText(hasil.getText().toString() + nomor);
                if (status == 0) {
                    status = 1;
                    hasil.setText(nomor);
                }
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nomor = "8";
                if (status > 0) hasil.setText(hasil.getText().toString() + nomor);
                if (status == 0) {
                    status = 1;
                    hasil.setText(nomor);
                }
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nomor = "9";
                if (status > 0) hasil.setText(hasil.getText().toString() + nomor);
                if (status == 0) {
                    status = 1;
                    hasil.setText(nomor);
                }
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nomor = "0";
                if (hasil.getText() != nomor) {
                    if (status > 0) hasil.setText(hasil.getText().toString() + nomor);

                    if (status == 0) {
                        status = 1;
                        hasil.setText(nomor);
                    }
                }
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hasil.setText("0");
                status = 0;
            }
        });
        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (status == 1) {
                    status = 2;
                    operasi = 1;
                    x1 = Integer.parseInt(hasil.getText().toString());
                    hasil.setText("");
                } else if (status == 2) {
                    x2 = Integer.parseInt(hasil.getText().toString());
                    sama_dengan();
                }else if (status == 0) {
                   hasil.setText("0");
                }
            }
        });
        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (status == 1) {
                    status = 2;
                    operasi = 2;
                    x1 = Integer.parseInt(hasil.getText().toString());
                    hasil.setText("");
                } else if (status == 2) {
                    x2 = Integer.parseInt(hasil.getText().toString());
                    sama_dengan();
                }else if (status == 0) {
                    hasil.setText("0");
                }
            }
        });
        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (status == 1) {
                    status = 2;
                    operasi = 3;
                    x1 = Integer.parseInt(hasil.getText().toString());
                    hasil.setText("");
                } else if (status == 2) {
                    x2 = Integer.parseInt(hasil.getText().toString());
                    sama_dengan();
                }else if (status == 0) {
                    hasil.setText("0");
                }
            }
        });
        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (status == 1) {
                    status = 2;
                    operasi = 4;
                    x1 = Integer.parseInt(hasil.getText().toString());
                    hasil.setText("");
                } else if (status == 2) {
                    x2 = Integer.parseInt(hasil.getText().toString());
                    sama_dengan();
                }else if (status == 0) {
                    hasil.setText("0");
                }
            }
        });
        samadengan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (status == 2) {
                    x2 = Integer.parseInt(hasil.getText().toString());
                    sama_dengan();
                }
                else if (status == 1){
                    hasil.setText("0");
                }else if (status == 0) {
                    hasil.setText("0");
                }
            }
        });

    }

    void sama_dengan() {
        double hasilnya = 0;
        switch (operasi) {
            case 1:
                hasilnya = x1 + x2;
                break;
            case 2:
                hasilnya = x1 - x2;
                break;
            case 3:
                hasilnya = x1 * x2;
                break;
            case 4:
                hasilnya = x1 / x2;
                break;
        }
        hasil.setText(String.valueOf(hasilnya));
        status = 0;
    }

}
