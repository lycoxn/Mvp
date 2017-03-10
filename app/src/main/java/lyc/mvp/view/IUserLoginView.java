package lyc.mvp.view;

import lyc.mvp.bean.User;

/**
 * Created by lyc on 2017/3/8.
 */

public interface IUserLoginView {

    String getUsername();

    String getPasswprd();

    void clearUsername();

    void clearPassword();

    void showLoading();

    void hideLoading();

    void toMainActivity(User user);

    void showFailedError();
}
