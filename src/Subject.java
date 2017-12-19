public interface Subject {
    //初始化,将Observer加入到list中
    public void initObserver(Observer ob);
    //遍历list,执行Observer中的update方法
    public void notifyObserver();
    //移除list
    public void removeObserver(Observer ob);
}
