package POO.classes.metodos.dominio;

import org.w3c.dom.ls.LSOutput;

public class Calculadora {
    // public = Modificador de acesso / void(vazio) = Diz que o metodo não terá retorno.

    // metodos sem retorno.
    public void somaDoisNumeros(){
        System.out.println(10+10);
    }

    public void subtraiDoisNumeros(){
        System.out.println(10-1);
    }

    //metodo sem retorno com dois parametros.
    public void multiplicaDoisNumeros(int num1, int num2){
        System.out.println(num1 * num2);
    }

    //metodo com retorno
    public double divideDoisNumeros(double num1, double num2){
        return num1 / num2;
    }
}
