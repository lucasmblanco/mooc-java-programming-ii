public class Hideout<T> {
    private T object;

    public void putIntoHideout(T toHide){
        this.object = toHide;
    }
    public T takeFromHideout(){
        if(this.object == null){
            return null;
        }
        T toShow = this.object;
        this.object = null;
        return toShow;
    }

    public boolean isInHideout(){
        return this.object != null;
    }
}
