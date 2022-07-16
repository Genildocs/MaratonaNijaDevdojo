package EstruturaArrays;

public class ArraysForeach {
    public static void main(String[] args) {
        int [] numeros = {1,2,3,4,5};
        for(int i : numeros){ //forma simplificada de utilizar o for para varrer o array.
            System.out.println(i);
        }

        String [] nomes = {"Luff", "Goku", "Ainzen"}; // Ao utilizar o for each colocar o mesmo tipo do array no for.
        for(String i : nomes){
            System.out.println(i);
        }
    }
}
