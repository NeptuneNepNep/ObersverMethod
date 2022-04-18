public class WeiXinUser implements Observer{
    private String name;
    public WeiXinUser(String name) {
        this.name = name;
    }
    @Override
    public void upDate(String message) {
        System.out.println(name + "收到了" +message);
    }
}
