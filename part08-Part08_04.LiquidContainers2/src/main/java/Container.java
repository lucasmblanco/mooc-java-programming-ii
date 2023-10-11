public class Container {
    private int content;
    private int maxCapacity;

    public Container(){
        this.content = 0;
        this.maxCapacity = 100;
    }

    public int contains() {
        return content;
    }

    public void add(int amount){
        if(content + amount <= maxCapacity && amount > 0){
            content += amount;
        } else if (amount > maxCapacity || content + amount > maxCapacity){
            content = 100;
        }
    }

    public void remove(int amount){
        if(amount <= content){
            content -= amount;
        } else if(content - amount < 0){
            content = 0;
        }
    }

    public String toString(){
        return contains() + "/" + this.maxCapacity;
    }
}
