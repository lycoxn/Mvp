package lyc.mvp.biz;

/**
 * Created by lyc on 2017/3/8.
 */

public interface IUserBiz {
    public void login(String username, String password, OnLoginListener loginListener);
}
