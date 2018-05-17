package dsm.yeonso;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;

/**
 * Created by dsm2016 on 2018-05-17.
 */

public class CustomDialog extends Dialog implements View.OnClickListener {
    public CustomDialog(@NonNull Context context) {
        super(context);
    }

    @Override
    public void onClick(View view) {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.dialog_custom);
        setContentView(R.layout.dialog_wrong_id);

    }
}
