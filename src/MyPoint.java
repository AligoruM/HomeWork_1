public class MyPoint {
    private int x;
    private int y;

    public MyPoint() {
        this.x=0;
        this.y=0;
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y){
        setX(x);                    //Есть ли смысл делать так, или дублирование кода сэттеров не так критично?
        setY(y);
    }

    public int[] getXY(){
        int[] tmp = {x,y};          //Тот же вопрос к get методам, как я понял их совсем не обязательно использовать
        return tmp;                 //внутри класса
    }

    @Override
    public String toString() {
        return "(" + x + ',' + y + ')';
    }

    public double distance(int x2, int y2){
        double result = Math.sqrt((x2-x)*(x2-x) + (y2-y)*(y2-y));
        return result;
    }

    public double distance(MyPoint point){
        double result = distance(point.getX(), point.getY());
        return result;
    }
    public double distance(){
        double result = distance(0,0);
        return result;
    }
}
