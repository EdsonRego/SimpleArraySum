import java.util.List;

public class Result {
    public static int simpleArraySum(List<Integer> ar) {

        int resultado = 0;
        for(int i = 0; i < ar.toArray().length; i++){
            resultado += ar.get(i);
        }
        System.out.println(resultado);
        return resultado;
    }
}
