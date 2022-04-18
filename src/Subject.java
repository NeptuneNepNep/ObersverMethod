
public interface Subject {
    //定义添加定义这
    void attach(Observer observer);
    //定义删除定义者
    void detach(Observer observer);
    //通知订阅者更新消息
    void notify(String message);
}
