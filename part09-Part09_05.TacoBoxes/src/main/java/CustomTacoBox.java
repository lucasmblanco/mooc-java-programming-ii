public class CustomTacoBox implements TacoBox{
    private Integer tacos;

    public CustomTacoBox(int amount){
        this.tacos = amount;
    }

    public int tacosRemaining(){
        return this.tacos;
    }

    public void eat(){
        if(!(this.tacos == 0)){
            this.tacos--;
        }
    }
}
