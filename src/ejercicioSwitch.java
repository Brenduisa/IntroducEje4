public class ejercicioSwitch {
    public static void main(String [] args){
        String estacion = "Primavera";

        switch (estacion) {
            case "Primavera":
                System.out.println("Esta es la estacion primavera");
            break;
            case "Otoño":
                System.out.println("Estacion Otoño");
            break;
            case "Invierno":
                System.out.println("Estacion Invierno");
            break;
            case "Verano":
                System.out.println("Estacion Verano");
            break;
            default:
                System.out.println("No elegiste una Estacion!!");
        }

    }
}
