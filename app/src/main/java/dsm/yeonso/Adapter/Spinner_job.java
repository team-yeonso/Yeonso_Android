package dsm.yeonso.Adapter;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import dsm.yeonso.R;

public class Spinner_job {

    Spinner spinner_big;
    Spinner spinner_small;
    Context content;

    public Spinner_job(Spinner a, Spinner b, android.content.Context c){
        spinner_big = a;
        spinner_small = b;
        content = c;
    }

    public void setSpinner(){
        ArrayAdapter<CharSequence> fAdapter;
        fAdapter = ArrayAdapter.createFromResource(content, R.array.job_first,
                android.R.layout.simple_spinner_item);
        fAdapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinner_big.setAdapter(fAdapter);
        spinner_big.setOnItemSelectedListener(spinSelectedlistener);
    }

    public void setSpinner(int itemNum){
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
                            setSpinner(R.array.job_second_all); break;
                        case (1):
                            setSpinner(R.array.job_second_general); break;
                        case (2):
                            setSpinner(R.array.job_second_professionals); break;
                        case (3):
                            setSpinner(R.array.job_second_medical_care); break;
                        case (4):
                            setSpinner(R.array.job_second_education); break;
                        case (5):
                            setSpinner(R.array.job_second_official); break;
                        case (6):
                            setSpinner(R.array.job_second_businessman); break;
                        case (7):
                            setSpinner(R.array.job_second_financial_business); break;
                        case (8):
                            setSpinner(R.array.job_second_research_technical); break;
                    }
                }

                @Override
                public void onNothingSelected(AdapterView<?> parent) {
                    // TODO Auto-generated method stub

                }

            };
}
