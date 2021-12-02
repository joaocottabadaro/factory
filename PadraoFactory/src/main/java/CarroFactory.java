




    public class CarroFactory {
        public static InterfaceCarro obterCarro(String carro) {
            Class classe = null;
            Object objeto = null;
            try {
                classe = Class.forName("Carro" + carro);
                objeto = classe.newInstance();
            } catch (Exception ex) {
                throw new IllegalArgumentException("Carro inexistente");
            }
            if (!(objeto instanceof InterfaceCarro)) {
                throw new IllegalArgumentException("Carro inválido");
            }
            return (InterfaceCarro) objeto;
        }
    }