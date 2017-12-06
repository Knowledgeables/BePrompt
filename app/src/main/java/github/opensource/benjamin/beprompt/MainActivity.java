package github.opensource.benjamin.beprompt;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;

/**
 * Project :  BePrompt.
 * Package name: PACKAGE_NAME
 * Created by :  Benjamin.
 * Created time: 2017/12/6 13:34
 * Changed by :  Benjamin.
 * Changed time: 2017/12/6 13:34
 * Class description:
 */

public class MainActivity extends Activity implements View.OnClickListener {

    private Button mTopBtn;
    private Button mCenterBtn;
    private Button mBottomBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        mTopBtn = findViewById(R.id.btn_top);
        mTopBtn.setOnClickListener(this);
        mCenterBtn = findViewById(R.id.btn_center);
        mCenterBtn.setOnClickListener(this);
        mBottomBtn = findViewById(R.id.btn_bottom);
        mBottomBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_top:
                // TODO 17/12/06
                BeTopMessage.Builder builder = new BeTopMessage.Builder(this);
                builder.setDuringTime(1000)
                        .setGravity(Gravity.TOP)
                        .setMessage("nihao")
                        .setIcon(R.mipmap.ic_launcher)
                        .show();

                break;
            case R.id.btn_center:
                // TODO 17/12/06
                BeCenterMessage.Builder center = new BeCenterMessage.Builder(this);
                center.setDuringTime(1000)
                        .setGravity(Gravity.CENTER)
                        .setMessage("nihao")
                        .setIcon(R.mipmap.ic_launcher)
                        .show();
                break;
            case R.id.btn_bottom:
                // TODO 17/12/06
                BeCenterToast.Builder TOAST = new BeCenterToast.Builder(this);
                TOAST.setDuringTime(1000)
                        .setGravity(Gravity.CENTER)
                        .setMessage("nihao")
                        .show();
                break;
            default:
                break;
        }
    }
}
