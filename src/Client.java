public class Client {
    public static void main(String[] args) {
        //创建公众号对象
        SubscriptionSubject subject = new SubscriptionSubject();
        //2.订阅公众号
        subject.attach(new WeiXinUser("小李"));
        subject.attach(new WeiXinUser("小王"));
        subject.attach(new WeiXinUser("小杨"));
        //3.微信公共号更新
        subject.notify("陈睿叔叔将死人复活");
    }
}
