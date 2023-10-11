public class TripleTacoBox implements TacoBox{
    private Integer tacos;

    public TripleTacoBox(){
        this.tacos = 3;
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
