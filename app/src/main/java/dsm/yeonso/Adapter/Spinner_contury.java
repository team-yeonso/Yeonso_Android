package dsm.yeonso.Adapter;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import dsm.yeonso.R;

public class Spinner_contury {

    Spinner spinner_big;
    Spinner spinner_middle;
    Spinner spinner_small;
    Context content;

    public Spinner_contury(Spinner a, Spinner b, Spinner c, android.content.Context d){
        spinner_big = a;
        spinner_middle = b;
        spinner_small = c;
        content = d;
    }
    public void setSpinner(){
        ArrayAdapter<CharSequence> fAdapter;
        fAdapter = ArrayAdapter.createFromResource(content, R.array.big_place,
                android.R.layout.simple_spinner_item);
        fAdapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinner_big.setAdapter(fAdapter);
        spinner_big.setOnItemSelectedListener(spinSelectedlistener);
        //spinner_middle.setOnItemSelectedListener(spinSelectedlistener2);
    }

    public void setSpinner(int itemNum){
        ArrayAdapter<CharSequence> fAdapter;
        fAdapter = ArrayAdapter.createFromResource(content, itemNum,
                android.R.layout.simple_spinner_item);
        fAdapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinner_middle.setAdapter(fAdapter);
    }

    public void setSpinner_small(int itemNum){
        ArrayAdapter<CharSequence> fAdapter;
        fAdapter = ArrayAdapter.createFromResource(content, itemNum,
                android.R.layout.simple_spinner_item);
        fAdapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinner_small.setAdapter(fAdapter);
    }

    public AdapterView.OnItemSelectedListener spinSelectedlistener =
            new AdapterView.OnItemSelectedListener() {
                @Override
                public void onItemSelected(AdapterView<?> parent, View view,
                                           int position, long id) {
                    switch (position) {
                        case (0):
                            setSpinner(R.array.default_array);
                            spinner_middle.setOnItemSelectedListener(default_third);
                            break;
                        case (1):
                            setSpinner(R.array.Gangwondo);
                            spinner_middle.setOnItemSelectedListener(Gangwondo);
                            break;
                        case (2):
                            setSpinner(R.array.Gyeonggido);
                            spinner_middle.setOnItemSelectedListener(Gyeonggido);
                            break;
                        case (3):
                            setSpinner(R.array.Gyeongsangnamdo);
                            spinner_middle.setOnItemSelectedListener(Gyeongsangnamdo);
                            break;
                        case (4):
                            setSpinner(R.array.Gyeongsangbukdo);
                            spinner_middle.setOnItemSelectedListener(Gyeongsangbukdo);
                            break;
                        case (5):
                            setSpinner(R.array.Gwangju);
                            spinner_middle.setOnItemSelectedListener(Gwangju);
                            break;
                        case (6):
                            setSpinner(R.array.Daegu);
                            spinner_middle.setOnItemSelectedListener(Daegu);
                            break;
                        case (7):
                            setSpinner(R.array.Daejeon);
                            spinner_middle.setOnItemSelectedListener(Daejeon);
                            break;
                        case (8):
                            setSpinner(R.array.Busan);
                            spinner_middle.setOnItemSelectedListener(Busan);
                            break;
                        case (9):
                            setSpinner(R.array.Seoul);
                            spinner_middle.setOnItemSelectedListener(Seoul);
                            break;
                        case (10):
                            setSpinner(R.array.Sejong);
                            spinner_middle.setOnItemSelectedListener(Sejong);
                            break;
                        case (11):
                            setSpinner(R.array.Ulsan);
                            spinner_middle.setOnItemSelectedListener(Ulsan);
                            break;
                        case (12):
                            setSpinner(R.array.Incheon);
                            spinner_middle.setOnItemSelectedListener(Incheon);
                            break;
                        case (13):
                            setSpinner(R.array.Jeollanamdo);
                            spinner_middle.setOnItemSelectedListener(Jeollanamdo);
                            break;
                        case (14):
                            setSpinner(R.array.Jeollabukdo);
                            spinner_middle.setOnItemSelectedListener(Jeollabukdo);
                            break;
                        case (15):
                            setSpinner(R.array.Jeju);
                            spinner_middle.setOnItemSelectedListener(Jeju);
                            break;
                        case (16):
                            setSpinner(R.array.Chungcheongnamdo);
                            spinner_middle.setOnItemSelectedListener(Chungcheongnamdo);
                            break;
                        case (17):
                            setSpinner(R.array.Chungcheongbukdo);
                            spinner_middle.setOnItemSelectedListener(Chungcheongbukdo);
                            break;

                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {
                    // TODO Auto-generated method stub

                }

            };

    public AdapterView.OnItemSelectedListener default_third = new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
            switch (pos){
                case (0) :
                    setSpinner_small(R.array.default_third );
            }
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    };

    public AdapterView.OnItemSelectedListener Gangwondo = new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
            switch (pos){
                case (0) :
                    setSpinner_small(R.array.G0_1); break;
                case (1) :
                    setSpinner_small(R.array.G0_2); break;
                case (2) :
                    setSpinner_small(R.array.G0_3); break;
                case (3) :
                    setSpinner_small(R.array.G0_4); break;
                case (4) :
                    setSpinner_small(R.array.G0_5); break;
                case (5) :
                    setSpinner_small(R.array.G0_6); break;
                case (6) :
                    setSpinner_small(R.array.G0_7); break;
                case (7) :
                    setSpinner_small(R.array.G0_8); break;
                case (8) :
                    setSpinner_small(R.array.G0_9); break;
                case (9) :
                    setSpinner_small(R.array.G0_10); break;
                case (10) :
                    setSpinner_small(R.array.G0_11); break;
                case (11) :
                    setSpinner_small(R.array.G0_12); break;
                case (12) :
                    setSpinner_small(R.array.G0_13); break;
                case (13) :
                    setSpinner_small(R.array.G0_14); break;
                case (14) :
                    setSpinner_small(R.array.G0_15); break;
                case (15) :
                    setSpinner_small(R.array.G0_16); break;
                case (16) :
                    setSpinner_small(R.array.G0_17); break;
                case (17) :
                    setSpinner_small(R.array.G0_18); break;
            }
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    };

    public AdapterView.OnItemSelectedListener Gyeonggido = new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
            switch (pos){
                case (0) :
                    setSpinner_small(R.array.Y0_1); break;
                case (1) :
                    setSpinner_small(R.array.Y0_2); break;
                case (2) :
                    setSpinner_small(R.array.Y0_3); break;
                case (3) :
                    setSpinner_small(R.array.Y0_4); break;
                case (4) :
                    setSpinner_small(R.array.Y0_5); break;
                case (5) :
                    setSpinner_small(R.array.Y0_6); break;
                case (6) :
                    setSpinner_small(R.array.Y0_7); break;
                case (7) :
                    setSpinner_small(R.array.Y0_8); break;
                case (8) :
                    setSpinner_small(R.array.Y0_9); break;
                case (9) :
                    setSpinner_small(R.array.Y0_10); break;
                case (10) :
                    setSpinner_small(R.array.Y0_11); break;
                case (11) :
                    setSpinner_small(R.array.Y0_12); break;
                case (12) :
                    setSpinner_small(R.array.Y0_13); break;
                case (13) :
                    setSpinner_small(R.array.Y0_14); break;
                case (14) :
                    setSpinner_small(R.array.Y0_15); break;
                case (15) :
                    setSpinner_small(R.array.Y0_16); break;
                case (16) :
                    setSpinner_small(R.array.Y0_17); break;
                case (17) :
                    setSpinner_small(R.array.Y0_18); break;
                case (18) :
                    setSpinner_small(R.array.Y0_19); break;
                case (19) :
                    setSpinner_small(R.array.Y0_20); break;
                case (20) :
                    setSpinner_small(R.array.Y0_21); break;
                case (21) :
                    setSpinner_small(R.array.Y0_22); break;
                case (22) :
                    setSpinner_small(R.array.Y0_23); break;
                case (23) :
                    setSpinner_small(R.array.Y0_24); break;
                case (24) :
                    setSpinner_small(R.array.Y0_25); break;
                case (25) :
                    setSpinner_small(R.array.Y0_26); break;
                case (26) :
                    setSpinner_small(R.array.Y0_27); break;
                case (27) :
                    setSpinner_small(R.array.Y0_28); break;
                case (28) :
                    setSpinner_small(R.array.Y0_29); break;
                case (29) :
                    setSpinner_small(R.array.Y0_30); break;
                case (30) :
                    setSpinner_small(R.array.Y0_31); break;
            }
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    };

    public AdapterView.OnItemSelectedListener Gyeongsangnamdo = new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
            switch (pos){
                case (0) :
                    setSpinner_small(R.array.S0_1); break;
                case (1) :
                    setSpinner_small(R.array.S0_2); break;
                case (2) :
                    setSpinner_small(R.array.S0_3); break;
                case (3) :
                    setSpinner_small(R.array.S0_4); break;
                case (4) :
                    setSpinner_small(R.array.S0_5); break;
                case (5) :
                    setSpinner_small(R.array.S0_6); break;
                case (6) :
                    setSpinner_small(R.array.S0_7); break;
                case (7) :
                    setSpinner_small(R.array.S0_8); break;
                case (8) :
                    setSpinner_small(R.array.S0_9); break;
                case (9) :
                    setSpinner_small(R.array.S0_10); break;
                case (10) :
                    setSpinner_small(R.array.S0_11); break;
                case (11) :
                    setSpinner_small(R.array.S0_12); break;
                case (12) :
                    setSpinner_small(R.array.S0_13); break;
                case (13) :
                    setSpinner_small(R.array.S0_14); break;
                case (14) :
                    setSpinner_small(R.array.S0_15); break;
                case (15) :
                    setSpinner_small(R.array.S0_16); break;
                case (16) :
                    setSpinner_small(R.array.S0_17); break;
                case (17) :
                    setSpinner_small(R.array.S0_18); break;


            }
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    };

    public AdapterView.OnItemSelectedListener Gyeongsangbukdo = new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
            switch (pos){
                case (0) :
                    setSpinner_small(R.array.B0_1); break;

                case (1) :
                    setSpinner_small(R.array.B0_2); break;

                case (2) :
                    setSpinner_small(R.array.B0_3); break;

                case (3) :
                    setSpinner_small(R.array.B0_4); break;

                case (4) :
                    setSpinner_small(R.array.B0_5); break;

                case (5) :
                    setSpinner_small(R.array.B0_6); break;

                case (6) :
                    setSpinner_small(R.array.B0_7); break;

                case (7) :
                    setSpinner_small(R.array.B0_8); break;

                case (8) :
                    setSpinner_small(R.array.B0_9); break;

                case (9) :
                    setSpinner_small(R.array.B0_10); break;

                case (10) :
                    setSpinner_small(R.array.B0_11); break;

                case (11) :
                    setSpinner_small(R.array.B0_12); break;

                case (12) :
                    setSpinner_small(R.array.B0_13); break;

                case (13) :
                    setSpinner_small(R.array.B0_14); break;

                case (14) :
                    setSpinner_small(R.array.B0_15); break;

                case (15) :
                    setSpinner_small(R.array.B0_16); break;

                case (16) :
                    setSpinner_small(R.array.B0_17); break;

                case (17) :
                    setSpinner_small(R.array.B0_18); break;

                case (18) :
                    setSpinner_small(R.array.B0_19); break;

                case (19) :
                    setSpinner_small(R.array.B0_20); break;

                case (20) :
                    setSpinner_small(R.array.B0_21); break;

                case (21) :
                    setSpinner_small(R.array.B0_22); break;

                case (22) :
                    setSpinner_small(R.array.B0_23); break;
            }
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    };

    public AdapterView.OnItemSelectedListener Gwangju = new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
            switch (pos){
                case (0) :
                    setSpinner_small(R.array.J0_1); break;

                case (1) :
                    setSpinner_small(R.array.J0_2); break;

                case (2) :
                    setSpinner_small(R.array.J0_3); break;

                case (3) :
                    setSpinner_small(R.array.J0_4); break;

                case (4) :
                    setSpinner_small(R.array.J0_5); break;
            }
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    };

    public AdapterView.OnItemSelectedListener Daegu = new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
            switch (pos){
                case (0) :
                    setSpinner_small(R.array.D0_1); break;

                case (1) :
                    setSpinner_small(R.array.D0_2); break;

                case (2) :
                    setSpinner_small(R.array.D0_3); break;

                case (3) :
                    setSpinner_small(R.array.D0_4); break;

                case (4) :
                    setSpinner_small(R.array.D0_5); break;

                case (5) :
                    setSpinner_small(R.array.D0_6); break;

                case (6) :
                    setSpinner_small(R.array.D0_7); break;

                case (7) :
                    setSpinner_small(R.array.D0_8); break;
            }
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    };

    public AdapterView.OnItemSelectedListener Daejeon = new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
            switch (pos){
                case (0) :
                    setSpinner_small(R.array.E0_1); break;

                case (1) :
                    setSpinner_small(R.array.E0_2); break;

                case (2) :
                    setSpinner_small(R.array.E0_3); break;

                case (3) :
                    setSpinner_small(R.array.E0_4); break;

                case (4) :
                    setSpinner_small(R.array.E0_5); break;




            }
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    };

    public AdapterView.OnItemSelectedListener Busan = new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
            switch (pos){
                case (0) :
                    setSpinner_small(R.array.A0_1); break;

                case (1) :
                    setSpinner_small(R.array.A0_2); break;

                case (2) :
                    setSpinner_small(R.array.A0_3); break;

                case (3) :
                    setSpinner_small(R.array.A0_4); break;

                case (4) :
                    setSpinner_small(R.array.A0_5); break;

                case (5) :
                    setSpinner_small(R.array.A0_6); break;

                case (6) :
                    setSpinner_small(R.array.A0_7); break;

                case (7) :
                    setSpinner_small(R.array.A0_8); break;

                case (8) :
                    setSpinner_small(R.array.A0_9); break;

                case (9) :
                    setSpinner_small(R.array.A0_10); break;

                case (10) :
                    setSpinner_small(R.array.A0_11); break;

                case (11) :
                    setSpinner_small(R.array.A0_12); break;

                case (12) :
                    setSpinner_small(R.array.A0_13); break;

                case (13) :
                    setSpinner_small(R.array.A0_14); break;

                case (14) :
                    setSpinner_small(R.array.A0_15); break;

                case (15) :
                    setSpinner_small(R.array.A0_16); break;


            }
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    };

    public AdapterView.OnItemSelectedListener Seoul = new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
            switch (pos){
                case (0) :
                    setSpinner_small(R.array.C0_1); break;

                case (1) :
                    setSpinner_small(R.array.C0_2); break;

                case (2) :
                    setSpinner_small(R.array.C0_3); break;

                case (3) :
                    setSpinner_small(R.array.C0_4); break;

                case (4) :
                    setSpinner_small(R.array.C0_5); break;

                case (5) :
                    setSpinner_small(R.array.C0_6); break;

                case (6) :
                    setSpinner_small(R.array.C0_7); break;

                case (7) :
                    setSpinner_small(R.array.C0_8); break;

                case (8) :
                    setSpinner_small(R.array.C0_9); break;

                case (9) :
                    setSpinner_small(R.array.C0_10); break;

                case (10) :
                    setSpinner_small(R.array.C0_11); break;

                case (11) :
                    setSpinner_small(R.array.C0_12); break;

                case (12) :
                    setSpinner_small(R.array.C0_13); break;

                case (13) :
                    setSpinner_small(R.array.C0_14); break;

                case (14) :
                    setSpinner_small(R.array.C0_15); break;

                case (15) :
                    setSpinner_small(R.array.C0_16); break;

                case (16) :
                    setSpinner_small(R.array.C0_17); break;

                case (17) :
                    setSpinner_small(R.array.C0_18); break;

                case (18) :
                    setSpinner_small(R.array.C0_19); break;

                case (19) :
                    setSpinner_small(R.array.C0_20); break;

                case (20) :
                    setSpinner_small(R.array.C0_21); break;

                case (21) :
                    setSpinner_small(R.array.C0_22); break;

                case (22) :
                    setSpinner_small(R.array.C0_23); break;

                case (23) :
                    setSpinner_small(R.array.C0_24); break;

                case (24) :
                    setSpinner_small(R.array.C0_25); break;


            }
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    };

    public AdapterView.OnItemSelectedListener Sejong = new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
            switch (pos){
                case (0) :
                    setSpinner_small(R.array.F0_1); break;

                case (1) :
                    setSpinner_small(R.array.F0_2); break;

                case (2) :
                    setSpinner_small(R.array.F0_3); break;

                case (3) :
                    setSpinner_small(R.array.F0_4); break;

                case (4) :
                    setSpinner_small(R.array.F0_5); break;

                case (5) :
                    setSpinner_small(R.array.F0_6); break;

                case (6) :
                    setSpinner_small(R.array.F0_7); break;

                case (7) :
                    setSpinner_small(R.array.F0_8); break;

                case (8) :
                    setSpinner_small(R.array.F0_9); break;

                case (9) :
                    setSpinner_small(R.array.F0_10); break;

                case (10) :
                    setSpinner_small(R.array.F0_11); break;

                case (11) :
                    setSpinner_small(R.array.F0_12); break;

                case (12) :
                    setSpinner_small(R.array.F0_13); break;

                case (13) :
                    setSpinner_small(R.array.F0_14); break;

                case (14) :
                    setSpinner_small(R.array.F0_15); break;

                case (15) :
                    setSpinner_small(R.array.F0_16); break;

                case (16) :
                    setSpinner_small(R.array.F0_17); break;


            }
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    };

    public AdapterView.OnItemSelectedListener Ulsan = new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
            switch (pos){
                case (0) :
                    setSpinner_small(R.array.K0_1); break;

                case (1) :
                    setSpinner_small(R.array.K0_2); break;

                case (2) :
                    setSpinner_small(R.array.K0_3); break;

                case (3) :
                    setSpinner_small(R.array.K0_4); break;

                case (4) :
                    setSpinner_small(R.array.K0_5); break;

            }
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    };

    public AdapterView.OnItemSelectedListener Incheon = new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
            switch (pos){
                case (0) :
                    setSpinner_small(R.array.L0_1); break;

                case (1) :
                    setSpinner_small(R.array.L0_2); break;

                case (2) :
                    setSpinner_small(R.array.L0_3); break;

                case (3) :
                    setSpinner_small(R.array.L0_4); break;

                case (4) :
                    setSpinner_small(R.array.L0_5); break;

                case (5) :
                    setSpinner_small(R.array.L0_6); break;

                case (6) :
                    setSpinner_small(R.array.L0_7); break;

                case (7) :
                    setSpinner_small(R.array.L0_8); break;

                case (8) :
                    setSpinner_small(R.array.L0_9); break;

                case (9) :
                    setSpinner_small(R.array.L0_10); break;

            }
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    };

    public AdapterView.OnItemSelectedListener Jeollanamdo = new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
            switch (pos){
                case (0) :
                    setSpinner_small(R.array.M0_1); break;

                case (1) :
                    setSpinner_small(R.array.M0_2); break;

                case (2) :
                    setSpinner_small(R.array.M0_3); break;

                case (3) :
                    setSpinner_small(R.array.M0_4); break;

                case (4) :
                    setSpinner_small(R.array.M0_5); break;

                case (5) :
                    setSpinner_small(R.array.M0_6); break;

                case (6) :
                    setSpinner_small(R.array.M0_7); break;

                case (7) :
                    setSpinner_small(R.array.M0_8); break;

                case (8) :
                    setSpinner_small(R.array.M0_9); break;

                case (9) :
                    setSpinner_small(R.array.M0_10); break;

                case (10) :
                    setSpinner_small(R.array.M0_11); break;

                case (11) :
                    setSpinner_small(R.array.M0_12); break;

                case (12) :
                    setSpinner_small(R.array.M0_13); break;

                case (13) :
                    setSpinner_small(R.array.M0_14); break;

                case (14) :
                    setSpinner_small(R.array.M0_15); break;

                case (15) :
                    setSpinner_small(R.array.M0_16); break;

                case (16) :
                    setSpinner_small(R.array.M0_17); break;

                case (17) :
                    setSpinner_small(R.array.M0_18); break;

                case (18) :
                    setSpinner_small(R.array.M0_19); break;

                case (19) :
                    setSpinner_small(R.array.M0_20); break;

                case (20) :
                    setSpinner_small(R.array.M0_21); break;

                case (21) :
                    setSpinner_small(R.array.M0_22); break;



            }
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    };

    public AdapterView.OnItemSelectedListener Jeollabukdo = new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
            switch (pos){
                case (0) :
                    setSpinner_small(R.array.Q0_1); break;

                case (1) :
                    setSpinner_small(R.array.Q0_2); break;

                case (2) :
                    setSpinner_small(R.array.Q0_3); break;

                case (3) :
                    setSpinner_small(R.array.Q0_4); break;

                case (4) :
                    setSpinner_small(R.array.Q0_5); break;

                case (5) :
                    setSpinner_small(R.array.Q0_6); break;

                case (6) :
                    setSpinner_small(R.array.Q0_7); break;

                case (7) :
                    setSpinner_small(R.array.Q0_8); break;

                case (8) :
                    setSpinner_small(R.array.Q0_9); break;

                case (9) :
                    setSpinner_small(R.array.Q0_10); break;

                case (10) :
                    setSpinner_small(R.array.Q0_11); break;

                case (11) :
                    setSpinner_small(R.array.Q0_12); break;

                case (12) :
                    setSpinner_small(R.array.Q0_13); break;

                case (13) :
                    setSpinner_small(R.array.Q0_14); break;


            }
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    };

    public AdapterView.OnItemSelectedListener Jeju = new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
            switch (pos){
                case (0) :
                    setSpinner_small(R.array.R0_1); break;
                case (1) :
                    setSpinner_small(R.array.R0_2); break;

            }
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    };

    public AdapterView.OnItemSelectedListener Chungcheongnamdo = new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
            switch (pos){
                case (0) :
                    setSpinner_small(R.array.V0_1); break;

                case (1) :
                    setSpinner_small(R.array.V0_2); break;

                case (2) :
                    setSpinner_small(R.array.V0_3); break;

                case (3) :
                    setSpinner_small(R.array.V0_4); break;

                case (4) :
                    setSpinner_small(R.array.V0_5); break;

                case (5) :
                    setSpinner_small(R.array.V0_6); break;

                case (6) :
                    setSpinner_small(R.array.V0_7); break;

                case (7) :
                    setSpinner_small(R.array.V0_8); break;

                case (8) :
                    setSpinner_small(R.array.V0_9); break;

                case (9) :
                    setSpinner_small(R.array.V0_10); break;

                case (10) :
                    setSpinner_small(R.array.V0_11); break;

                case (11) :
                    setSpinner_small(R.array.V0_12); break;

                case (12) :
                    setSpinner_small(R.array.V0_13); break;

                case (13) :
                    setSpinner_small(R.array.V0_14); break;

                case (14) :
                    setSpinner_small(R.array.V0_15); break;



            }
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    };

    public AdapterView.OnItemSelectedListener Chungcheongbukdo = new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long l) {
            switch (pos){
                case (0) :
                    setSpinner_small(R.array.Z0_1); break;

                case (1) :
                    setSpinner_small(R.array.Z0_2); break;

                case (2) :
                    setSpinner_small(R.array.Z0_3); break;

                case (3) :
                    setSpinner_small(R.array.Z0_4); break;

                case (4) :
                    setSpinner_small(R.array.Z0_5); break;

                case (5) :
                    setSpinner_small(R.array.Z0_6); break;

                case (6) :
                    setSpinner_small(R.array.Z0_7); break;

                case (7) :
                    setSpinner_small(R.array.Z0_8); break;

                case (8) :
                    setSpinner_small(R.array.Z0_9); break;

                case (9) :
                    setSpinner_small(R.array.Z0_10); break;

                case (10) :
                    setSpinner_small(R.array.Z0_11); break;
            }
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    };

}
