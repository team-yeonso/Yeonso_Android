package dsm.yeonso.Fragment;


import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.lang.reflect.Array;

import dsm.yeonso.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MainTabFragment2 extends Fragment {
    private Spinner jobFirst, jobSecond;
    private ArrayAdapter<CharSequence> jobFirstAdapter, jobSecondAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.main_tab_fragment_2, container, false);

        jobFirst = (Spinner) view.findViewById(R.id.mainTabFragment_job_first);
        jobSecond = (Spinner) view.findViewById(R.id.mainTabFragment_job_second);

        jobFirstAdapter = ArrayAdapter.createFromResource(getContext(), R.array.job_first, android.R.layout.simple_spinner_item);
        jobFirst.setAdapter(jobFirstAdapter);

        jobFirst.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (jobFirst.getItemAtPosition(i).equals("대분류")) {
                    jobSecondAdapter = ArrayAdapter.createFromResource(getContext(), R.array.job_second_all, android.R.layout.simple_spinner_item);
                    jobSecondAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                    jobSecond.setAdapter(jobSecondAdapter);
                    jobSecond.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                            // 두번째 선택된 값을 변수를 이용하여 저장할 수 있음.
                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {
                            // 아무것도 선택이 안됐을때
                        }
                    });
                } else if (jobFirst.getItemAtPosition(i).equals("일반")) {
                    jobSecondAdapter = ArrayAdapter.createFromResource(getContext(), R.array.job_second_general,android.R.layout.simple_spinner_item);
                    jobSecondAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                    jobSecond.setAdapter(jobSecondAdapter);
                    jobSecond.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                } else if (jobFirst.getItemAtPosition(i).equals("전문직")) {
                    jobSecondAdapter = ArrayAdapter.createFromResource(getContext(),R.array.job_second_professionals,android.R.layout.simple_spinner_item);
                    jobSecondAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                    jobSecond.setAdapter(jobSecondAdapter);
                    jobSecond.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                } else if (jobFirst.getItemAtPosition(i).equals("의료직")) {
                    jobSecondAdapter = ArrayAdapter.createFromResource(getContext(),R.array.job_second_medical_care,android.R.layout.simple_spinner_item);
                    jobSecondAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                    jobSecond.setAdapter(jobSecondAdapter);
                    jobSecond.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                } else if (jobFirst.getItemAtPosition(i).equals("교육직")) {
                    jobSecondAdapter = ArrayAdapter.createFromResource(getContext(),R.array.job_second_education,android.R.layout.simple_spinner_item);
                    jobSecondAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                    jobSecond.setAdapter(jobSecondAdapter);
                    jobSecond.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                } else if (jobFirst.getItemAtPosition(i).equals("공무원")) {
                    jobSecondAdapter = ArrayAdapter.createFromResource(getContext(),R.array.job_second_official,android.R.layout.simple_spinner_item);
                    jobSecondAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                    jobSecond.setAdapter(jobSecondAdapter);
                    jobSecond.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                } else if (jobFirst.getItemAtPosition(i).equals("사업가")) {
                    jobSecondAdapter = ArrayAdapter.createFromResource(getContext(),R.array.job_second_businessman,android.R.layout.simple_spinner_item);
                    jobSecondAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                    jobSecond.setAdapter(jobSecondAdapter);
                    jobSecond.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                } else if (jobFirst.getItemAtPosition(i).equals("금융직")) {
                    jobSecondAdapter = ArrayAdapter.createFromResource(getContext(),R.array.job_second_financial_business,android.R.layout.simple_spinner_item);
                    jobSecondAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                    jobSecond.setAdapter(jobSecondAdapter);
                    jobSecond.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                } else if (jobFirst.getItemAtPosition(i).equals("연구, 기술직")) {
                    jobSecondAdapter = ArrayAdapter.createFromResource(getContext(),R.array.job_second_research_technical,android.R.layout.simple_spinner_item);
                    jobSecondAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
                    jobSecond.setAdapter(jobSecondAdapter);
                    jobSecond.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                        @Override
                        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                        }

                        @Override
                        public void onNothingSelected(AdapterView<?> adapterView) {

                        }
                    });
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        return view;

    }

    // TODO: 2018-05-01 R.array 부분 매개변수로 어떻게 넣을지 생각해보자
//    private void setSpinner(final Spinner spinner, final String s, final ArrayAdapter<CharSequence> arrayAdapter, final Resources resources1, final Resources resources2) {
//        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
//            @Override
//            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
//                if(spinner.getItemAtPosition(i).equals(s)) {
//                    //arrayAdapter = ArrayAdapter.createFromResource(getContext(), resources1, resources2);
//                }
//            }
//
//            @Override
//            public void onNothingSelected(AdapterView<?> adapterView) {
//
//            }
//        });
//    }

}
