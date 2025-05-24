package animais;

public class Pombo extends Ave {
    private int cartasEnviadas;

    public Pombo(String nome) {
        super(nome);
        cartasEnviadas = 7;
    }

    public int getCartasEnviadas() {
        return cartasEnviadas;
    }

    public void fazerPruh() {
        System.out.printf("%s fez pruh.\n", getNome());
    }

    public void enviarCarta() {
        System.out.println(cartasEnviadas);
        System.out.printf("%s enviou cartas.\n", getNome());
        cartasEnviadas++;
        System.out.println(cartasEnviadas);
    }
}
