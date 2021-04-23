
public class Matematico
{
    private int indicar;
    private int n1;
    private int n2;
    private int n3;
    String respuesta;
    private int area;
    private double distancia;
    private int x0, y0;
    private int x1, y1;
    private int coordenada;
    private int x;
    private int y;
    public String respuest;
    
    public String indicar(int n1, int n2, int n3){    
       String respuesta;
       
       if (n1 > n2) {
            if (n1 > n3) {
                respuesta = "El mayor es: " + n1;                                             
            } else {
                respuesta = "el mayor es: " + n3;     
            }
       } else if (n2 > n3) {
            respuesta = "el mayor es es:" + n2;
       } else {
            respuesta = "el mayor es: " + n3;
       } 
       return respuesta;
    }
    
    public int CalArea(int base, int altura){
        area = base * altura;
        return area;
    }
    
    
    public  double DistanciaPuntos(int x0, int y0, int x1, int y1){
        this.x0=x0;
        this.y0=y0;
        this.x1=x1;
        this.y1=y1;
        double p = Math.sqrt((Math.pow((this.x1 - this.x0), 2)) + (Math.pow((this.y1 - this.y0), 2)));
        return p;
    }
    
    
    public String coordenada(int x, int y){
        if(x > 0 && y > 0){
            respuest = "El punto " + x + "," + y + " esta en el primer cuadrante"; 
        } 
        else if(x < 0 && y > 0){
            respuest = "El punto " + x + "," + y + " esta en el segundo cuadrante"; 
        }
        else if(x < 0 && y < 0){
            respuest = "El punto " + x + "," + y + " esta en el tercer cuadrante"; 
        }
        else if(x > 0 && y < 0){
            respuest = "El punto " + x + "," + y + " esta en el cuarto cuadrante"; 
        }
        return respuest; 
    }     
}

