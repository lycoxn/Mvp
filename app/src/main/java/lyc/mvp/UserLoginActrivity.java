package lyc.mvp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import lyc.mvp.bean.User;
import lyc.mvp.presenter.UserLoginPresenter;
import lyc.mvp.view.IUserLoginView;

public class UserLoginActrivity extends ActionBarActivity implements IUserLoginView, View.OnClickListener {

    private EditText et_password;
    private EditText et_name;

    private Button clear, login;
    private ProgressBar progressbar;

    private UserLoginPresenter mUserLoginPresenter = new UserLoginPresenter(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.userlogin_activity);
        initViews();
    }

    private void initViews() {
        et_name = (EditText) findViewById(R.id.et_name);
        et_password = (EditText) findViewById(R.id.et_password);

        clear = (Button) findViewById(R.id.clear);
        login = (Button) findViewById(R.id.login);

        progressbar = (ProgressBar) findViewById(R.id.progressbar);

        clear.setOnClickListener(this);
        login.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.clear:
                mUserLoginPresenter.clear();
                break;
            case R.id.login:
                mUserLoginPresenter.login();
                break;
        }
    }

    @Override
    public String getUsername() {
        return et_name.getText().toString();
    }

    @Override
    public String getPasswprd() {
        return et_password.getText().toString();
    }

    @Override
    public void clearUsername() {
        et_name.setText("");
    }

    @Override
    public void clearPassword() {
        et_password.setText("");
    }

    @Override
    public void showLoading() {
        progressbar.setVisibility(View.VISIBLE);
    }

    @Override
    public void hideLoading() {
        progressbar.setVisibility(View.INVISIBLE);
    }

    @Override
    public void toMainActivity(User user) {
        Toast.makeText(this, "登录成功", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showFailedError() {
        Toast.makeText(this, "登录失败", Toast.LENGTH_SHORT).show();

    }


}
