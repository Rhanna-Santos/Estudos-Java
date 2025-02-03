public class planoOperadora {
    public static void main(String[] args) {
        String plano = "M";
        switch (plano) {
            case "T":
            System.out.println("5 GB Youtube");
            break;
            case "M":
            System.out.println("whatsapp e Instagram ilimitado");
            break;
            case "B":
            System.out.println("100 minutos de ligação");
            break;
            default:
            System.out.println("Plano inválido");
        }
    }
}
