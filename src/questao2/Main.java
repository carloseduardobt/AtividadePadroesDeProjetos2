package questao2;

public class Main {
    public static void main(String[] args) {
        int minutos = 135;
        PerfilCobranca[] perfis = {
            new PerfilRotativo(), new PerfilMensalista(), new PerfilConveniado()
        };

        System.out.println("--- Mesmo tempo (" + minutos + " min) nos três perfis");
        for (PerfilCobranca perfil : perfis) {
            Tiquete t = new Tiquete("ABC1D23", minutos, perfil);
            System.out.printf("%-11s R$ %.2f%n", perfil.getNome(), t.calcularValor());
        }

        System.out.println("--- Troca de perfil no mesmo tíquete");
        Tiquete tiquete = new Tiquete("XYZ9K88", minutos, new PerfilRotativo());
        System.out.printf("%-11s R$ %.2f%n", tiquete.getPerfil().getNome(), tiquete.calcularValor());
        tiquete.setPerfil(new PerfilConveniado());
        System.out.printf("%-11s R$ %.2f%n", tiquete.getPerfil().getNome(), tiquete.calcularValor());
        tiquete.setPerfil(new PerfilMensalista());
        System.out.printf("%-11s R$ %.2f%n", tiquete.getPerfil().getNome(), tiquete.calcularValor());

        System.out.println("--- Conveniado com 20 min (dentro da franquia)");
        Tiquete curto = new Tiquete("CUR7T00", 20, new PerfilConveniado());
        System.out.printf("%-11s R$ %.2f%n", curto.getPerfil().getNome(), curto.calcularValor());
    }
}
