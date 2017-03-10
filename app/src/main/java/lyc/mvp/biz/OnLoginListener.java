package lyc.mvp.biz;

import lyc.mvp.bean.User;

/**
 * Created by lyc on 2017/3/8.
 */

public interface OnLoginListener {
    void loginSuccess(User user);

    void loginFailed();
}
