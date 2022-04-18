import java.util.ArrayList;
import java.util.List;

public class SubscriptionSubject implements Subject{
    private List<Observer> weiXinUserList = new ArrayList<Observer>();
    @Override
    public void attach(Observer observer) {
        weiXinUserList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        weiXinUserList.remove(observer);
    }

    @Override
    public void notify(String message) {
        //遍历集合
        for(Observer observer:weiXinUserList) {
            observer.upDate(message);
        }
    }
}
