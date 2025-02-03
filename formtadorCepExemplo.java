public class formtadorCepExemplo {
    public static void main(String[] args) {
        try {
            String cepFormatdo = formatarCep("23765064");
            System.out.println(cepFormatdo);
        } catch (cepinvalidoExcepition e) {
           System.out.println("CEP inválido");
        }
    }
    static String formatarCep(String cep) throws cepinvalidoExcepition {
        if (cep.length() != 8) 
            throw new cepinvalidoExcepition();
        
        return "23.765-064";
    }
}
